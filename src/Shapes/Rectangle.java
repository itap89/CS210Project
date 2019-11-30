package Shapes;
/*
            Side B
        ----------------
 Side A |              |
        |              |
        ----------------
*/
public class Rectangle implements Shapes {

    private int sideA;
    private int sideB;

    Rectangle()
    {
        sideA = 0;
        sideB = 0;
    }

    Rectangle(int length, int width)
    {
        sideA = width;
        sideB = length;
    }

    public int area() {
        return sideA * sideB;
    }

    public int perimeter() {
        return (sideB * 2) + (sideA * 2);
    }

    public void setLength(int length)
    {
        sideB = length;
        System.out.println("Successfully set the length to " + sideB);
    }

    public void setHeight(int height)
    {
        sideA = height;
        System.out.println("Successfully set the height to " + sideA);
    }
}
