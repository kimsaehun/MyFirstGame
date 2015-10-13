package game.gameuniverse;

/**
 * Provides a model for a hexagon, a plane figure with 6 sides.
 *
 * Hexagons will be
 *     i) vertically Oriented (pointy top).
 *     ii) a regular hexagon. All sides have equal length.
 */
public class Hexagon extends Shape2D{
    private double sideLength;

    /**
     * Constructor
     */
    public Hexagon() {
        sideLength = 0;
    }

    /**
     * Constructor
     *
     * @param sideLength the length of a side.
     */
    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // Helper Functions
    public double getSideLength() { return sideLength; }

    public void setSideLength(double sideLength) { this.sideLength = sideLength; }
}
