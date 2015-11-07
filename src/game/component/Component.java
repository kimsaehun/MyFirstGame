package game.component;

import javafx.scene.canvas.GraphicsContext;

public abstract class Component implements Drawable {
    public enum Type {
        GAMEBOARD, EMPTY, GREEN, ORANGE
    }

    /**
     * Enum type for the various type of boards.
     */
    public enum BoardType {

    }

    /**
     * Enum type for the various type of tiles.
     */
    public enum TileType {

    }

    /**
     * Returns the components type.
     */
    public abstract Type getType();

    /**
     * Sets the priority level of the component.
     */
    public abstract void setPriority(double priority);

    /**
     * Returns the priority level of the component.
     */
    public abstract double getPriority();

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public abstract void draw(GraphicsContext graphicsContext);
}
