package com.epam.training.student_vladimir_bendyna.task16;

class CycleSwap {
    static void cycleSwap(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int k = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j + 1];
            array[array.length - 1] = k;
        }
    }
    static void cycleSwap(int[] array, int shift) {
        for (int i = 0; i < array.length-shift; i++) {
            int k = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j + 1];
            array[array.length - 1] = k;
        }
    }
}