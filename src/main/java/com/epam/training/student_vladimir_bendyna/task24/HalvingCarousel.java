package com.epam.training.student_vladimir_bendyna.task24;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);

    }
    @Override
    public CarouselRun run() {
        if (isRun) {
            isRun = false;
            return new CarouselRun(){
                int [] arr = new int[DecrementingCarousel.capacity];
                @Override
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
                    arr[count-1]=(array[count - 1]+array[count - 1]+array[count-1]%2)/2;
                    array[count-1]/=2;
                    return arr[count-1];
                }
            };
        } else return null;
    }
}