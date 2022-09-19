package com.epam.training.student_vladimir_bendyna.task22;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle {
    Point a,b,c;
    double length1,length2,length3;
    public Triangle(Point a, Point b, Point c) {
        this.a=a;
        this.b=b;
        this.c=c;
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        length1 = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        length2 = sqrt(pow((x3-x2),2)+pow((y3-y2),2));
        length3 = sqrt(pow((x3-x1),2)+pow((y3-y1),2));
        if (length1+length2<=length3){throw new IllegalArgumentException();}
        if (length3+length2<=length1){throw new IllegalArgumentException();}
    }
    public double area() {
        double s, area;
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        length1 = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        length2 = sqrt(pow((x3-x2),2)+pow((y3-y2),2));
        length3 = sqrt(pow((x3-x1),2)+pow((y3-y1),2));
        s=(length1+length2+length3)*0.5;
        area=sqrt(s*(s-length1)*(s-length2)*(s-length3));
        return area;
    }
    public Point centroid(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        return new Point((x1+x2+x3)/3,(y1+y2+y3)/3);
    }
}