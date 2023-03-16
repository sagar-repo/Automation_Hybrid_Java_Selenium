package Programs;

import java.util.Arrays;
import java.util.Collections;

public class HighestnumberinArray {

public static void main(String[] args){
    int[] arr1 = {13,5,8};

    Integer[] arr2 = {13,5,8};

    int max= Collections.max(Arrays.asList(arr2));
    System.out.println("Max Number : "+max);

    Arrays.sort(arr1);
    System.out.println("Sorted Array : "+Arrays.toString(arr1));


    System.out.println("MaMxaimum number in Array : "+GetMaxNumber());
}

public static int GetMaxNumber()
    {
        int [] arr={99,88,1,-8};
        int temp;
        int total=arr.length;
        for(int i = 0;i<total;i++){
           for(int j=i+1;j<total;j++) {
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }

           }
        }
        return arr[total-1];
    }
}
