package First_section;

import java.util.Random;
import java.util.Scanner;

public class First_section {
    public static void main (String args[]){

        String king = "Android";

        char arr[] = king.toCharArray();
        char arr2[] = new char[arr.length];
        for (int i = 0; i < arr.length; i++){
            //for (int j = arr.length-1; j >= 0; j--){
                arr2[i] = arr[(arr.length-1) - i];
            //}

        }
        Integer dos = new Integer(5);

        int d = dos.intValue();
//        for (int i = 0; i < arr2.length; i++){
//            System.out.print(arr2[i]);
//        }
        String two;





        int a = 5;
        int b = 7;


        One(1);
    }
    public static void One(int i){

        if (i <= 10){
            System.out.println(i);

            One(i+1);
        }

    }
}
