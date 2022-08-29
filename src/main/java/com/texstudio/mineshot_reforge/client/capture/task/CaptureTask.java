package com.texstudio.mineshot_reforge.client.capture.task;

import java.nio.file.Path;

import com.texstudio.mineshot_reforge.client.capture.FramebufferWriter;
import com.texstudio.mineshot_reforge.util.reflection.PrivateAccessor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.TickEvent.RenderTickEvent;

import com.texstudio.mineshot_reforge.client.capture.FramebufferCapturer;
import com.texstudio.mineshot_reforge.client.config.MyModConfig;

public class CaptureTask implements RenderTickTask, PrivateAccessor {
	private static final Minecraft MC = Minecraft.getInstance();

	private final Path file;

	private int frame;
	private int displayWidth;
	private int displayHeight;

	public CaptureTask(Path file) {
		this.file = file;
	}

	@Override
	public boolean onRenderTick(RenderTickEvent evt) throws Exception {
		switch (frame) {
		// override viewport size (the following frame will be black)
		case 0:
			displayWidth = MC.getMainWindow().getFramebufferWidth();
			displayHeight = MC.getMainWindow().getFramebufferHeight();

			int width = MyModConfig.captureWidth;
			int height = MyModConfig.captureHeight;

			// resize viewport/framebuffer
			framebufferSizeUpdate(MC, width, height);

			break;

		// capture screenshot and restore viewport size
		case 3:
			try {
				FramebufferCapturer fbc = new FramebufferCapturer();
				FramebufferWriter fbw = new FramebufferWriter(file, fbc);
				fbw.write();
			} finally {
				// restore viewport/framebuffer
				framebufferSizeUpdate(MC, displayWidth, displayHeight);
			}
			break;
		}

		frame++;
		return frame > 3;
	}
}
