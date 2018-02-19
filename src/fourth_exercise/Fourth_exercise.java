package fourth_exercise;

import java.util.Scanner;

public class Fourth_exercise {
    public static void main(String args[]){

        int input;
        Scanner sc = new Scanner(System.in);


            System.out.println("Please, enter number");
            input = sc.nextInt();

            String num = "1995";
            Integer a = Integer.valueOf(num);

            int d = a.intValue();

            if ((input % 2) == 0){
                System.out.println("\nNumber is EVEN");
            } else {
                System.out.println("\nNumber is ODD");
            }


    }
}
