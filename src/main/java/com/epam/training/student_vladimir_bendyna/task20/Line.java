package com.epam.training.student_vladimir_bendyna.task20;

public class Line {
    int k, b, x, y;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line other) {
        if (k-other.k==0) {return null;}
        else{
            x = (other.b-b)/(k-other.k);
            y = k*x+b;
            return new Point(x,y);}
        //throw new UnsupportedOperationException();
    }
}