package com.epam.training.student_vladimir_bendyna.task23;

public class DecrementingCarousel {
    static int capacity;
    int k=0;
    boolean isRun=true;
    static  int [] array;
    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity=capacity;
        array = new int[capacity];
    }
    public boolean addElement(int element){
        if (!isRun) {return false;}
        if (element>0 && k<capacity) {
            array[k]=element;
            k++;
            return true;}
        return false;
    }
    public CarouselRun run(){
        if (isRun){
            isRun=false;
            return new CarouselRun();}
        else return null;
    }
}