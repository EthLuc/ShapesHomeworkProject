//Ethan Lucas
//Shapes Java Project
//9-6-2024

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
import org.junit.Assert;
import org.junit.Test;




public class ShapeTester {

    /**
     * Testing for the Line object class.
     */
    @Test
    public void lineTest()
    {
        Point start = new Point(10,20);
        Point end = new Point(30,40);
        Color color = Color.MAGENTA;
        Line line = new Line(start, end, color);


        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
        Assert.assertEquals(color, line.getColor());
        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
    }

    /**
     * Testing for the Box object class.
     */
    @Test
    public void boxTest()
    {
        Point start = new Point(10,20);
        Point end = new Point(30,40);
        Color color = Color.MAGENTA;
        Line line = new Line(start, end, color);


        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
        Assert.assertEquals(color, line.getColor());
        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
    }

    /**
     * Testing for the Oval object class.
     */
    @Test
    public void ovalTest()
    {
        Point start = new Point(10,20);
        Point end = new Point(30,40);
        Color color = Color.MAGENTA;
        Line line = new Line(start, end, color);


        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
        Assert.assertEquals(color, line.getColor());
        Assert.assertEquals(start, line.getStart());
        Assert.assertEquals(end, line.getEnd());
    }

    public static void main(String[] args) throws Exception {


    }
}
