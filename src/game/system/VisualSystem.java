package game.system;

import game.component.Component;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * System used to give vision of the game.
 */
public class VisualSystem {
    private final Image IMAGE_GAMEBOARD = new Image("res/gameboard/gameboard_background.png");
    private final Image IMAGE_TILE_EMPTY = new Image("res/tile/tile_empty.png");
    private final Image IMAGE_TILE_ORANGE = new Image("res/tile/tile_orange.png");
    private final Image IMAGE_TILE_GREEN = new Image("res/tile/tile_green.png");

    private Group group;
    private Scene scene;
    private Canvas canvas;
    private GraphicsContext graphicsContext;

    /**
     * Default Constructor
     */
    public VisualSystem() {
        group = new Group();
        scene = new Scene(group, 768, 432);
        canvas = new Canvas(768, 432);
        graphicsContext = canvas.getGraphicsContext2D();
        group.getChildren().add(canvas);
    }

    /**
     * Overloaded Constructor
     */
    public VisualSystem(Group group, Scene scene) {
        this.group = group;
        this.scene = scene;
        canvas = new Canvas(768, 432);
        graphicsContext = canvas.getGraphicsContext2D();
        group.getChildren().add(canvas);
    }

    // Temporary function just to get something running
    public void draw(Point2D xyCoordinate, Component component) {
        double x = xyCoordinate.getX();
        double y = xyCoordinate.getY();
        switch (component.getType()) {
            case GAMEBOARD:
                graphicsContext.drawImage(IMAGE_GAMEBOARD, x, y);
                break;
            case EMPTY:
                graphicsContext.drawImage(IMAGE_TILE_EMPTY, x, y);
                break;
            case ORANGE:
                graphicsContext.drawImage(IMAGE_TILE_ORANGE, x, y);
                break;
            case GREEN:
                graphicsContext.drawImage(IMAGE_TILE_GREEN, x, y);
                break;
            default:
                break;
        }
    }

    /**
     * Helper function that gets the image of an component
     */

    // Getters and Setters
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
