package io.github.testGame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;


//import io.github.testGame.NativeLibExample;
//import com.badlogic.gdx.graphics.g2d

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class Main extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture image;
    private Sprite background;
    private sheetGrid grid;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("scene.jpg");
        background = new Sprite(image);
        background.setPosition(0, 0);
        background.setScale(2.0f, 0.5f);
        grid = new sheetGrid(6, 10, false, 0.720f, 0.645f, Gdx.graphics.getWidth() * 0.003f, Gdx.graphics.getHeight() * 0.155f);
        Gdx.app.log("hello", "hello from abdelilah majid");

    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(image, background.getX(), background.getY(),
            Gdx.graphics.getWidth(),
            Gdx.graphics.getHeight());
        batch.end();
        grid.render();

    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
