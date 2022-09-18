package com.epam.training.student_vladimir_bendyna.task21;


import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    Point p1,p2;
    public Segment(Point start, Point end) {
        p1=start;
        p2=end;
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        if(x1==x2 && y1==y2) {throw new IllegalArgumentException();}
        if(p1 ==null || p2 ==null || p1==p2) {throw new IllegalArgumentException();}
    }
    double length() {
        double length;
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        length = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        return length;
    }
    Point middle() {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return new Point((x1+x2)/2,(y1+y2)/2);
    }

    Point intersection(Segment another) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = another.p1.getX();
        double y3 = another.p1.getY();
        double x4 = another.p2.getX();
        double y4 = another.p2.getY();
        double t;
        double u;
        double n;
        n = (x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);
        if (x2==x3 && y2==y3){return null;}
        if (n==0){return null;}
        t=((x1-x3)*(y3-y4)-(y1-y3)*(x3-x4))/n;
        u=((x1-x3)*(y1-y2)-(y1-y3)*(x1-x2))/n;
        if (t<0 || t>1 || u<0 || u>1 ) {return null;}
        else
            return new Point(x1+t*(x2-x1),y1+t*(y2-y1));
    }
}