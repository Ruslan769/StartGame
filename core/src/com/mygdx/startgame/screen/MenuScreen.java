package com.mygdx.startgame.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.startgame.base.Base2DScreen;

public class MenuScreen extends Base2DScreen {

    SpriteBatch batch;
    Texture img;
    Vector2 position, touchPosition;

    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        batch = new SpriteBatch();
        img = new Texture("logo.png");
        position = new Vector2(0f, 0f);
        touchPosition = new Vector2(0f, 0f);
    }

    @Override
    public void render (float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, position.x, position.y);

        if (touchPosition.x != position.x) {
            if (touchPosition.x > position.x) {
                position.x ++;
            } else if (touchPosition.x < position.x) {
                position.x --;
            }
        }

        if (touchPosition.y != position.y) {
            if (touchPosition.y > position.y) {
                position.y ++;
            } else if (touchPosition.y < position.y) {
                position.y --;
            }
        }

        batch.end();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //Gdx.graphics.getHeight() - screenY // оси глафики и польз. событий разные, поэтому приходится переворачивать
        touchPosition.x = screenX - (img.getWidth() / 2);
        touchPosition.y = Gdx.graphics.getHeight() - screenY - (img.getHeight() / 2);
        return true;
    }

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
        super.dispose();
    }
}
