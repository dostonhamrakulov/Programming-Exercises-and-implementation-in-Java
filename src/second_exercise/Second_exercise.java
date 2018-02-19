package second_exercise;

public class Second_exercise {
    public static void main(String args[]){

        String var = "Hello Doston Hamrakulov";
        System.out.println(var);
        System.out.println("\nUsing library:");
        System.out.println(UsingLibrary(var));
        System.out.println("\nDoing manually:");
        System.out.println(Manually(var));
    }
    public static String UsingLibrary(String name){
        String newName = new StringBuilder(name).reverse().toString();
        return newName;
    }
    public static String Manually(String name){

        char dos[] = new char[name.length()];
        for (int i = 1; i <= name.length(); i++){
            if (i > name.length()){
                break;
            } else {
                dos[i-1] = name.charAt(name.length()-i);
            }
        }
        return new String(dos) + "";
    }
}
class Doston{

}