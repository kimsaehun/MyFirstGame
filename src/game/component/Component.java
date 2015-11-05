package game.component;

import javafx.scene.canvas.GraphicsContext;

public abstract class Component implements Drawable {
    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public abstract void draw(GraphicsContext graphicsContext);
}
