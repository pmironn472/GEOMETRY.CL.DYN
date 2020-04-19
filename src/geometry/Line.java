package geometry;

import java.lang.Math;

public class Line {
    // properties
    public int startX;
    private int endX;
    private int startY;
    private int endY;


    // constructor
    public Line(int startX, int startY, int endX, int endY) {
        this.startY = startY;
        this.startX = startX;
        this.endX = endX;
        this.endY = endY;
    }


    public void printCoords() {

        if (startX == endX) {
            System.err.println("Error");
        } else {
            System.out.println("[" + startX + ":" + startY + "]" + "----->" + "[" + endX + ":" + endY + "]");
        }

    }



        public int length() {


           return (int) (Math.sqrt((endY - startY) * (endY - startY) + (endX - startX) * (endX - startX)));

        }
}




