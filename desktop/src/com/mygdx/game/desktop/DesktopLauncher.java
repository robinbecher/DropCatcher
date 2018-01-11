package com.mygdx.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.DropCatcher;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Catch the Drops!";
		config.width = 800;
		config.height = 480;
		config.addIcon("icon-128.png", Files.FileType.Internal);
		config.addIcon("icon-32.png", Files.FileType.Internal);
		config.addIcon("icon-16.png", Files.FileType.Internal);
		new LwjglApplication(new DropCatcher(), config);
	}
}
