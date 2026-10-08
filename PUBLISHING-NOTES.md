# Publishing notes (private – do not upload this file)

Upload ONLY the contents of `github-repo/iiq-role-textarea-plugin/`.
Run `git init` inside that folder, not in this parent folder.

Before the first push:

1. `LICENSE` is set to "Copyright (c) 2026 RoleTextarea contributors" (chosen 2026-10-01).
2. Look at the four images in `docs/images/` once more. Image 04 shows the sandbox role tree and the display name "SBX Role Manager"; images 01-03 show only the Role Editor form with the `SBX ...` test attribute labels.
3. Optional: attach `github-repo/release-assets/RoleTextarea-1.2.0.zip` to a GitHub Release instead of committing it (`dist/` is git-ignored). It is the exact zip installed and tested in the sandbox and contains only this project's class and JavaScript.

Never upload from this parent folder:

- `github-repo/backup-SBXRoleTextarea-1.1.1-source/` (pre-rename backup; safe content, but not meant for the public repo)
- `decompiled-reference/` (decompiled SailPoint classes)
- `v1.1-dynamic/TEST-CREDENTIALS.txt` and `v1.1-dynamic/sandbox-objects/SBX-Set-RoleManager-Password-Rule.xml` (test password)
- `sandbox-objects/`, `v1.1-dynamic/sandbox-objects/` (exports from the sandbox, including the full Bundle ObjectConfig)
- `scripts/`, `v1.1-dynamic/*.sh` (contain local machine paths)
- the private `README.md` files (quote IdentityIQ template markup and local paths)
