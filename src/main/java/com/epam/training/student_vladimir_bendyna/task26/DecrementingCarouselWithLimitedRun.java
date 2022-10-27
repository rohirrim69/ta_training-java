package com.epam.training.student_vladimir_bendyna.task26;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }
    @Override
    public CarouselRun run() {
        if (isRun) {
            isRun = false;
            return new CarouselRun() {
                int actionCount = -1;
                @Override
                public int next() {
                    if (actionCount==actionLimit-1)
                    {
                        for (int i=0; i< array.length; i++)
                        {array[i]=0;}
                    }
                    if (array.length == 0 || actionCount==actionLimit-1) {
                        return -1;
                    }
                    if (count == array.length) {
                        count = 0;
                    }
                    while (array[count] == 0 || array[count] < 0) {
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
                    actionCount ++;
                    count++;
                    array[count-1]--;
                    return array[count - 1] + 1;
                }

                @Override
                public boolean isFinished() {
                    int sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        sum += array[i];
                    }
                    if (actionCount==actionLimit-1){sum=0;}
                    return sum == 0;
                }
            };
        } else return null;
    }
}