# Mineshot Reborn

Mineshot Reforge 是 Minecraft（Forge）的一个模组，用于创建高分辨率屏幕截图，可选择使用正交相机。(和Indev截图类似)

大部分代码基于原始的 [Mineshot by Barracuda](https:github.comata4mineshot) 。非常感谢原作者。不幸的是，这个项目似乎已经停更了，可能是因为 Forge 或 Minecraft 在代码上有了巨大的变化。

该项目的主要目的是通过更新新的 Minecraft 版本来保持 Mineshot 的活力。目前，只有部分原始 Mineshot 功能可用，而那些仍处于试验阶段。但是，非常欢迎您测试这个项目并创建问题。

支持 Minecraft 1.16.5，将会支持 1.18+ 或更高版本。

## 用法

控件与原始 Mineshot 中的控件相同：

* F9: 截屏
* 数字键 4: 向左旋转
* 数字键 6: 向右旋转
* 数字键 8: 向上旋转
* 数字键 2: 向下旋转
* 数字键 7: 俯视图
* 数字键 1: 正视图
* 数字键 3: 侧面图
* 数字键 5: 在透视投影和正交投影之间切换
* MOD-键 (左Ctrl) + 数字键 5: 在固定和自由相机之间切换。
* MOD-键 (左Ctrl) + 数字键 4、6、8 或 2: 增量而不是平滑旋转
* 加号: 放大
* 减号: 缩小

可以在 Minecraft 按键菜单中更改按键绑定。

您可以手动更改屏幕截图的大小： `<mc-folder>/config/mineshot_reforge-client.toml`. 此文件将在第一次加载此 mod 时创建，默认为 4K (3840x2160)。

请注意，创建的屏幕截图会很大（4K 已经是 23.7 MB），因此请谨慎选择您的分辨率。屏幕截图将是 Targa 图像文件，因此将限制为 65535 x 65535 像素。



