package com.epam.training.student_vladimir_bendyna.task15;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }
    public static int[] removeLocalMaxima(int[] array){
        int[] tempArray = new int[array.length];
        int  j;
        int n=0;
        if (array[0]>array[1]) {j=0;n++;}
        else {j=1; tempArray[0]=array[0];}
        for (int i=1; i< array.length-1; i++)
            if (array[i]<=array[i+1] || array[i]<=array[i-1]) {
                tempArray[j] = array[i];
                j++;}
            else n++;
        if (array[array.length-1]<=array[array.length-2]){tempArray[array.length-n-1]=array[array.length-1];}
        else n++;
        int[] newArray = Arrays.copyOf(tempArray,array.length-n);
        return newArray;
    }
}