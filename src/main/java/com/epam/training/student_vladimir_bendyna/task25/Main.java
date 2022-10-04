package com.epam.training.student_vladimir_bendyna.task25;

public class Main {
    public static void main(String[] args) {
        GraduallyDecreasingCarousel carousel = new GraduallyDecreasingCarousel(7);

        carousel.addElement(7);
        carousel.addElement(3);
        carousel.addElement(4);
        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //7
        System.out.println(run.next()); //3
        System.out.println(run.next()); //4

        System.out.println(run.next()); //6
        System.out.println(run.next()); //2
        System.out.println(run.next()); //3

        System.out.println(run.next()); //4
        System.out.println(run.next()); //1

        System.out.println(run.next()); //1

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
    }
}