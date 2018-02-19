package E_5_fifth_exercise;

public class Fifth_exercise {
    public static void main(String args[]){

        System.out.println(getSUM(2222));
    }
    static int getSUM(int num){

        String a = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < a.length(); i++){
            sum += Integer.parseInt(a.charAt(i) + "");
        }
        return sum;
    }
}
