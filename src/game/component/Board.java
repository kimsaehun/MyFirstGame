package game.component;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides a model for a physical surface on which components are placed.
 */
public class Board extends Component {
    private Image image;
    private double width; // Width in pixels
    private double height; // Height in pixels
    private double xCoordinate; // x coordinate of the top left corner of this board
    private double yCoordinate; // y coordinate of the top left corner of this board

    private List<Component> componentList; // List of components placed on this board.

    /**
     * Default Constructor
     */
    public Board() {
        image = null;
        width = height = 0;
        xCoordinate = yCoordinate = 0;
        componentList = new ArrayList<>(0);
    }

    /**
     * Overloaded Constructor
     *
     * @param image       The image associated with this board.
     * @param width       The width of this game board in pixels.
     * @param height      The height of this game board in pixels.
     * @param xCoordinate The x coordinate on which this board is drawn.
     * @param yCoordinate The Y coordinate on which this board is drawn.
     */
    public Board(Image image, double width, double height, double xCoordinate, double yCoordinate) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        componentList = new ArrayList<>(0);
    }

    /**
     * Places the component on the board.
     *
     * @param component The component to place on the board.
     */
    public void place(Component component) {
        componentList.add(component);
    }

    /**
     * Removes the component from the board.
     *
     * @param component The component to remove from the board.
     */
    public void remove(Component component) {
        componentList.remove(component);
    }

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, xCoordinate, yCoordinate);
        for (Component component : componentList) {
            component.draw(graphicsContext);
        }
    }
}
