/*
 * Turns the Role (Bundle) extended String attributes listed in the plugin
 * setting "multilineAttributes" into <textarea>s in the classic RoleEditor.
 * The list comes from the plugin's REST endpoint (string attributes only).
 * Whether an attribute is editable is left to IIQ: only a text input that
 * IIQ actually rendered is converted, nothing else is added or enabled.
 * The textarea keeps the input's name, so JSF binds it like the original
 * h:inputText. If the config cannot be loaded the page is left unchanged.
 */
(function () {
    var CONFIG_PATH = 'sbxroletextarea/config';

    function convert(multilineAttrs) {
        var table = document.getElementById('roleAttributeEditorTable');
        if (!table) {
            return;
        }
        var spans = table.querySelectorAll('span.attributeName');
        for (var i = 0; i < spans.length; i++) {
            if (multilineAttrs.indexOf(spans[i].textContent) < 0) {
                continue;
            }
            var row = spans[i].parentNode.parentNode;
            // Only act on what IIQ rendered: an editable text input. A
            // read-only value, dropdown or disabled field is left alone.
            var input = row.querySelector('input[type="text"]');
            if (!input || input.disabled || input.readOnly) {
                continue;
            }
            var ta = document.createElement('textarea');
            ta.name = input.name;
            if (input.id) {
                ta.id = input.id;
            }
            ta.rows = 6;
            ta.style.width = '500px';
            // defaultValue reflects the raw value attribute; .value has had
            // its line breaks stripped by the browser for type=text
            ta.value = input.defaultValue;
            input.parentNode.replaceChild(ta, input);
        }
    }

    function loadConfig(callback) {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', PluginHelper.getPluginRestUrl(CONFIG_PATH), true);
        xhr.setRequestHeader('Accept', 'application/json');
        xhr.setRequestHeader('X-XSRF-TOKEN', PluginHelper.getCsrfToken());
        xhr.onreadystatechange = function () {
            if (xhr.readyState !== 4) {
                return;
            }
            if (xhr.status === 200) {
                callback(JSON.parse(xhr.responseText).multilineAttributes || []);
            } else if (window.console) {
                console.warn('SBXRoleTextarea: config request failed (' + xhr.status + ')');
            }
        };
        xhr.send();
    }

    function init() {
        loadConfig(function (multilineAttrs) {
            if (multilineAttrs.length === 0) {
                return;
            }
            convert(multilineAttrs);
            // RoleEditor re-renders attributesPanel via PrimeFaces ajax (e.g. on
            // role type change), so re-apply whenever the table is replaced
            new MutationObserver(function () {
                convert(multilineAttrs);
            }).observe(document.body, {childList: true, subtree: true});
        });
    }

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', init);
    } else {
        init();
    }
})();
