package main;

import geometry.Line;

public class Application {
    public static void main (String[] args){


        Line short_horizontal_line = new Line( 100,0, 200,0 );
        short_horizontal_line.printCoords();
        System.out.println( short_horizontal_line.length() );


        Line long_diagonal_line = new Line( 100,100, 500,500 );
        long_diagonal_line.printCoords();
        System.out.println( long_diagonal_line.length() );


        System.out.println("////////////////////////////////////");


        Line long_diagonal_line1 = new Line( 200,100, 500,500 );
        long_diagonal_line1.printCoords();
        System.out.println( long_diagonal_line1.length() );


        System.out.println("////////////////////////////////////");


        Line short_horizontal_line1 = new Line( 550,0, 550,0 );
        short_horizontal_line1.printCoords();
        System.out.println( short_horizontal_line1.length() );






    }
}
