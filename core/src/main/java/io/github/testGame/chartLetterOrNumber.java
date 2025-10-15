package io.github.testGame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class chartLetterOrNumber {
    // constructor
    private final int width;
    private final int height;
    private final int posX;
    private final int posY;
    private final char letterOrNumber;
    private final Color color;
    ShapeRenderer shapes;

    public chartLetterOrNumber(int width, int height, int posX, int posY, char letterOrNumber, Color color, ShapeRenderer shapes) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
        this.letterOrNumber = letterOrNumber;
        this.color = color;
    }

    // render function
    public void render() {
        shapes.setColor(color);
        shapes.rect(posX, posY, width, height);
    }
}
