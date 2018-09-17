package com.mygdx.startgame;

import com.badlogic.gdx.Game;
import com.mygdx.startgame.screen.MenuScreen;

public class Star2DGame extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
