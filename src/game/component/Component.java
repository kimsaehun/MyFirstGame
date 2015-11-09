package game.component;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Component implements Drawable {
    // TODO: Figure out how to mimic inheritance on enums.
    public enum Type {
        GAMEBOARD, TILE_EMPTY, TILE_GREEN, TILE_ORANGE
    }

    /**
     * Returns the component's type.
     */
    public abstract Type getType();

    /**
     * Sets the component's type.
     */
    public abstract void setType(Type type);

    /**
     * Gets the image based on the component's type.
     *
     * @return The image associated with the component.
     */
    public abstract Image getImage();

    /**
     * Sets the component's priority level.
     */
    public abstract void setPriority(int priority);

    /**
     * Returns the component's priority level.
     */
    public abstract int getPriority();

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public abstract void draw(GraphicsContext graphicsContext);
}
