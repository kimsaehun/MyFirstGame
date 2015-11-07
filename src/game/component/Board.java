package game.component;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides a model for a physical surface on which components are placed.
 */
public class Board extends Component {
    private Type type;
    private double priority;
    private Image image;
    private double width; // Width in pixels
    private double height; // Height in pixels
    private Point2D coordinate; // The coordinate of the top left corner of this board

    private List<Component> componentList; // List of components placed on this board.

    /**
     * Default Constructor
     */
    public Board() {
        priority = 0;
        image = null;
        width = height = 0;
        coordinate = new Point2D(0, 0);
        componentList = new ArrayList<>(0);
    }

    /**
     * Overloaded Constructor
     */
    public Board(Type type) {
        priority = 0;
        this.type = type;
        image = null;
        width = height = 0;
        coordinate = new Point2D(0, 0);
        componentList = new ArrayList<>(0);
    }

    /**
     * Overloaded Constructor
     *
     * @param image      The image associated with this board.
     */
    public Board(Image image) {
        this.image = image;
        width = height = 0;
        this.coordinate = new Point2D(0,0);
        componentList = new ArrayList<>(0);
    }

    /**
     * Overloaded Constructor
     *
     * @param image      The image associated with this board.
     * @param width      The width of this game board in pixels.
     * @param height     The height of this game board in pixels.
     * @param coordinate The coordinate on which this board is drawn.
     */
    public Board(Image image, double width, double height, Point2D coordinate) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.coordinate = coordinate;
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
     * Returns the components type.
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * Sets the priority level of the component.
     */
    @Override
    public void setPriority(double priority) {
        this.priority = priority;
    }

    /**
     * Returns the priority level of the component.
     */
    @Override
    public double getPriority() {
        return priority;
    }

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, coordinate.getX(), coordinate.getY());
        for (Component component : componentList) {
            component.draw(graphicsContext);
        }
    }
}
