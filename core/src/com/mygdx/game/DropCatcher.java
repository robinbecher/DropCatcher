package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DropCatcher extends Game{
    SpriteBatch batch;
    BitmapFont font;

    @Override
    public void create() {
       batch = new SpriteBatch();
        //Use LibGDX's default Arial font
       font = new BitmapFont();

       this.setScreen(new MainMenuScreen(this));
    }

    public void render(){
        super.render();
    }

    public void dispose(){
        batch.dispose();
        font.dispose();
    }
}
