package io.github.testGame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


//import io.github.testGame.NativeLibExample;
//import com.badlogic.gdx.graphics.g2d
/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Sprite  background;
    ShapeRenderer shapes;
    private static final int gridCellH = 50;
    private static final int gridCellW = 200;

    private static final int gridCellNY = 20;
    private static final int gridCellNX = 10;


    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("scene.jpg");
        background = new Sprite(image);
        background.setPosition(0, 0);
        background.setScale(2.0f, 0.5f);
        shapes = new ShapeRenderer();

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

        shapes.begin(ShapeRenderer.ShapeType.Line);
        shapes.setColor(0, 0, 0, 1);
        for(int i = 0; i < gridCellNY; i++)
        {
            shapes.rectLine( new Vector2(0, i * gridCellH), new Vector2(Gdx.graphics.getWidth(), i * gridCellH), 1);

        }

        for(int i = 0; i < gridCellNX; i++)
        {
            shapes.rectLine( new Vector2(i * gridCellW, 0), new Vector2(i * gridCellW, Gdx.graphics.getHeight()), 1);

        }
        shapes.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
