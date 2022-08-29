# Mineshot Reborn

Mineshot Reforge is a mod for Minecraft (using Forge) for creating high-resolution screenshots, optionally using the orthographic camera.

The majority of the code is based on the original [Mineshot by Barracuda](https://github.com/ata4/mineshot). So many thanks to the original creator. Unfortunately that project seems dead, probably because of the big changes which were introduced.

The main purpose of this project is to keep Mineshot alive by updating for newer Minecraft/Forge versions. For now, the project is in ALPHA-stage. This means that only part of the original Mineshot functions is available and those that are, are still very experimental. However you are very welcome to test this project and create issues.

Minecraft 1.16.5 is supported, 1.18+ or later will support.

## Usage

The controls are the same as in the original Mineshot:

* F9: Take screenshot
* Numpad 4: Rotate left
* Numpad 6: Rotate right
* Numpad 8: Rotate up
* Numpad 2: Rotate down
* Numpad 7: Top view
* Numpad 1: Front view
* Numpad 3: Side view
* Numpad 5: Switch between perspective and orthograpic projection
* MOD-key (Left Control) + Numpad 5: Switch between fixed and free camera.
* MOD-key (Left Control) + Numpad 4, 6, 8, or 2: Incremental instead of smooth rotation
* Plus: Zoom in
* Minus: Zoom out

The key-bindings can be changed in the Minecraft Controls menu.

As there is no configuration GUI in Forge 1.15 yet, you have to change the size of the screenshot manually in: `<mc-folder>/config/mineshot_reforge-client.toml`. This file will be created the first time this mod is loaded and defaults to 4K (3840x2160).

Please note that the screenshots created will be huge (4K is already 23,7 MB), so choose your resolution carefully. The screenshot will be a Targa image file and will therefore be limited to 65535 by 65535 pixels.



