package io.github.testGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;


public class sheetGrid {
    private static int gridCellH = 100;
    private static int gridCellW = 400;
    private static int gridCellNY = 0;
    private static int gridCellNX = 0;
    ShapeRenderer shapes;
    private float scaleX = 0;
    private float scaleY = 0;
    private float posX = 0;
    private float posY = 0;


    // constructor
    public sheetGrid(int X, int Y, boolean isWidthOfCells, float scaleX, float scaleY, float posX, float posY) {
        if (isWidthOfCells) {
            gridCellW = X;
            gridCellH = Y;
            gridCellNX = (int) Math.ceil((float) Gdx.graphics.getWidth() / gridCellW);
            gridCellNY = (int) Math.ceil((float) Gdx.graphics.getHeight() / gridCellH);
        } else {
            gridCellNX = X;
            gridCellNY = Y;
            gridCellW = (int) Math.ceil((float) Gdx.graphics.getWidth() / gridCellNX);
            gridCellH = (int) Math.ceil((float) Gdx.graphics.getHeight() / gridCellNY);
        }
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.posX = posX;
        this.posY = posY;
        shapes = new ShapeRenderer();
    }

    //render function
    public void render() {
        shapes.begin(ShapeRenderer.ShapeType.Filled);
        shapes.setColor(0, 0, 0, 1);

        for (int i = 0; i <= gridCellNY; i++) {
            shapes.rectLine(new Vector2(posX, i * gridCellH * scaleY + posY),
                new Vector2(Gdx.graphics.getWidth() * scaleX + posX, i * gridCellH * scaleY + posY), 4);
        }

        for (int i = 0; i <= gridCellNX; i++) {
            shapes.rectLine(new Vector2(i * gridCellW * scaleX + posX, posY),
                new Vector2(i * gridCellW * scaleX + posX, Gdx.graphics.getHeight() * scaleY + posY), 4);
        }
        shapes.end();
    }
}
