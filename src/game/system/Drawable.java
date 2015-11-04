package game.system;

import javafx.scene.canvas.GraphicsContext;

/**
 * To be implemented for classes that will be drawn on the screen.
 */
public interface Drawable {
    /**
     * Draws the class onto the screen.
     *
     * @param GraphicsContext The graphics context used to issue draw calls to the canvas.
     */
    public void draw(GraphicsContext graphicsContext);
}
