package game.concept;

/**
 * Provides a model for a hexagon, a plane figure with 6 sides.
 */
public class Hexagon extends Shape2D{
    public enum Orientation {
        VERTICAL, HORIZONTAL
    }

    private Orientation orientation;
    private double sideLength;

    /**
     * Default Constructor
     */
    public Hexagon() {
        orientation = Orientation.VERTICAL;
        sideLength = 0;
    }

    /**
     * Overloaded Constructor
     *
     * @param sideLength the length of a side.
     */
    public Hexagon(Orientation orientation, double sideLength) {
        this.orientation = orientation;
        this.sideLength = sideLength;
    }

    // Getters and Setters
    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
