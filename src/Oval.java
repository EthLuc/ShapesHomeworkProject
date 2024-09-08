import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class Oval extends Shape
{

    /**
     * Constructor for Oval object. Accepts data for start, end, and color.
     * 
     * @param start - point value for starting position.
     * @param end - point value for ending position.
     * @param color - color value for color of the object.
     */
    public Oval(Point start, Point end, Color color)
    {
        super(start, end, color);
    }

    /*
     * For later when we learn to draw the actual shapes.
     */
    public void draw()
    {

    }
}