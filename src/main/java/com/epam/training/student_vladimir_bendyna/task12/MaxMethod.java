package com.epam.training.student_vladimir_bendyna.task12;

public class MaxMethod {
    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (max < value) {
                max = value;
            }}
        return max;
    }
    public static void main(String[] args) {
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result == 10); // true
    }
}