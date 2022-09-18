package com.epam.training.student_vladimir_bendyna.task14;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 3, 2, 5, 7, 12, 19, 31, 50, 81, 131, 212};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array){
        boolean[] logicArray = new boolean[array.length];
        logicArray[0] = false;
        logicArray[1] = false;
        int i;
        int j;
        for (i = 2, j = 2; i==j; i ++, j ++)
            if (i< array.length)
            {if(array[i] == array[i-1] + array[i-2])
            {logicArray[j] = true;}
            else logicArray[j] = false;}
            else break;
        return logicArray;
    }
}