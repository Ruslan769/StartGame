package com.mygdx.startgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class MyStartgame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("logo.png");

		final Vector2 v1 = new Vector2(1, 3);
		final Vector2 v2 = new Vector2(1, 2);
        // добавляем
		v1.add(v2);
		System.out.println("v1 x = " + v1.x + "v1 y = " + v1.y);
        // вычитаем
		v1.set(6, 2);
		v2.set(2, 3);
		v1.sub(v2);
        System.out.println("v1 x = " + v1.x + "v1 y = " + v1.y);
        // умножение
        System.out.println("v1 len = " + v1.len());
        v1.scl(0.5f);
        System.out.println("v1 x = " + v1.x + "v1 y = " + v1.y);
        System.out.println("v1 len = " + v1.len());
        // скалярное произведение векторов
        System.out.println("v1.dot(v2) = " + v1.dot(v2));
        System.out.println("v1 len = " + v1.len());
        v1.nor();
        //v1.cpy().nor(); // создается копия вектора
        System.out.println("v1 x = " + v1.x + "v1 y = " + v1.y);
        System.out.println("v1 len = " + v1.len());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 100, 100);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
