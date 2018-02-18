package First_exercise;

public class First_exercise {
    public static void main(String args[]){

        int number_1 = 8;
        int number_2 = 15;

        number_1 = number_1 + number_2;
        number_2 = number_1 - number_2;
        number_1 = number_1 - number_2;

        System.out.println("First: " + number_1);
        System.out.println("\nSecond: " + number_2);
    }
}
