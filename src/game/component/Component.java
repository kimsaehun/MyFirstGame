package game.component;

import game.system.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Component implements Drawable {
    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public abstract void draw(GraphicsContext graphicsContext);
}
