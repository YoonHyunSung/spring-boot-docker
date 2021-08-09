package SBoot.SpringDocker.util;

import java.util.Arrays;

public class ArrayDemo {
    public int[] fill(int number){
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        return arr;
    }
    public int[] createIntegerArray(int start,int end){
        int a = end -start;
        int[] arr= new int[a];
        int j = 0;
        for (int i=start;i<end;i++){
            arr[j] = i;
            j++;
        }
        return arr;
    }
}

