package third_exercise;

public class Third_exercise {
    public static void main(String args[]){

        String str = "Doston HamrakuloBBBBBv";
        System.out.println("Third exercise:\n\n" + str);
        System.out.println("Answer:\n\n" + MyMethod(str, 'B'));
    }
    private static String MyMethod(String str, char c){

        if (str == null){
            return null;
        }
        return str.replaceAll(Character.toString(c), "");
    }
}
