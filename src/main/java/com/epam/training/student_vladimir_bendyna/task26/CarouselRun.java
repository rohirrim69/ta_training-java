package com.epam.training.student_vladimir_bendyna.task26;

public class CarouselRun {
    int count = 0;
    int[] array = DecrementingCarousel.array;

    public int next() {
        if (array.length == 0) {
            return -1;
        }
        if (count == array.length) {
            count = 0;
        }
        while (array[count] == 0) {
            count++;
            if (count > array.length - 1) {
                count = 0;
            }
            if (isFinished()) {
                return -1;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] == -1) {
                break;
            }
        }
        count++;
        array[count-1]--;
        return array[count - 1] + 1;
    }
    public boolean isFinished() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum == 0;
    }
}