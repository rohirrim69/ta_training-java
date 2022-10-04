package com.epam.training.student_vladimir_bendyna.task25;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (isRun) {
            isRun = false;
            return new CarouselRun() {
                int[] arr = new int[DecrementingCarousel.capacity];
                int n = 1;

                @Override
                public int next() {
                    if (array.length == 0) {
                        return -1;
                    }
                    if (count == array.length) {
                        count = 0;
                        n++;
                    }
                    while (array[count] == 0 || array[count] < 0) {
                        count++;
                        if (count > array.length - 1) {
                            count = 0;
                        }
                        if (count == 0) {
                            n++;
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
                    array[count - 1] -= n;
                    arr[count - 1] = array[count - 1] + n;
                    return arr[count - 1];
                }

                @Override
                public boolean isFinished() {
                    for (int var : array) {
                        if (var > 0) return false;
                    }
                    return true;
                }
            };
        } else return null;
    }
}