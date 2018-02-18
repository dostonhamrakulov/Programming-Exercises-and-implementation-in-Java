package second_exercise;

public class Second_exercise {
    public static void main(String args[]){

        String var = "Hello Doston Hamrakulov";
        System.out.println(var);
        System.out.println(UsingLibrary(var));
    }
    public static String UsingLibrary(String name){
        String newName = new StringBuilder(name).reverse().toString();
        return newName;
    }
}
