/*
 * Turns selected Role (Bundle) extended String attributes into <textarea>s
 * in the classic RoleEditor. Keeps the input's name/id so JSF binds it
 * exactly like the original h:inputText.
 */
(function () {
    // Extended attribute names (ObjectAttribute @name) to render multiline
    var MULTILINE_ATTRS = ['sbxKommentarsText'];

    function convert() {
        var table = document.getElementById('roleAttributeEditorTable');
        if (!table) {
            return;
        }
        var spans = table.querySelectorAll('span.attributeName');
        for (var i = 0; i < spans.length; i++) {
            var name = spans[i].textContent;
            if (MULTILINE_ATTRS.indexOf(name) < 0) {
                continue;
            }
            var row = spans[i].parentNode.parentNode;
            var input = row.querySelector('input[type="text"]');
            if (!input) {
                continue;
            }
            var ta = document.createElement('textarea');
            ta.name = input.name;
            ta.id = input.id;
            ta.rows = 6;
            ta.style.width = '500px';
            // defaultValue reflects the raw value attribute; .value has had
            // its line breaks stripped by the browser for type=text
            ta.value = input.defaultValue;
            input.parentNode.replaceChild(ta, input);
        }
    }

    function init() {
        convert();
        // RoleEditor re-renders attributesPanel via PrimeFaces ajax (e.g. on
        // role type change), so re-apply whenever the table is replaced
        new MutationObserver(convert).observe(document.body, {childList: true, subtree: true});
    }

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', init);
    } else {
        init();
    }
})();
