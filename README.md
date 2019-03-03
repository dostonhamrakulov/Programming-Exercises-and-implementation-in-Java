# Doston Hamrakulov

## Exercises in Java programming language
  
Here, you can find a lot of programming exercise and implementations in Java.


### Programming language
```[java]
// Java 
```

### IDE
```[intellijidea]
// IntelliJ IDEA
```

## Author
**Doston Hamrakulov**
>*Software Developer*


### Exercise_1: ###
**Description:**

There are two integer variables(or whatever type) and you should swap them in manually without using any build in function and any other variable.

```java
public class First_exercise {
    public static void main(String args[]){
        
        int number_1 = 8;
        int number_2 = 15;

        number_1 = number_1 + number_2;
        number_2 = number_1 - number_2;
        number_1 = number_1 - number_2;

        System.out.println("First: " + number_1);
        System.out.println("Second: " + number_2);
    }
}
```
* * *


-[X] **Exercise 2:**

### Exercise_2: ###
**Description:**

There is a String "Hello Doston Hamrakulov" and you need to reverse it. You have to show two ways of how to reverse the String by using build-in functions and doing manually.

```java
    public static void main(String args[]){

        String var = "Hello Doston";
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

```
* * *

### Exercise_3: ###
**Description:**

Write a method in Java which takes String parameter and Character, then the method should remove the character from given String.

```java
   public static void main(String args[]){

        String str = "Doston HaBBBBBv";
        System.out.println("Third exercise:\n\n" + str);
        System.out.println("Answer:\n\n" + MyMethod(str, 'B'));
    }
    private static String MyMethod(String str, char c){

        if (str == null){
            return null;
        }
        return str.replaceAll(Character.toString(c), "");
    }
```
* * *


### Exercise_4: ###
**Description:**

Write a Java program which takes input of Integer number and outputs the ODD or EVEN of the entered number.

```java
   public static void main(String args[]){

        int input;
        Scanner sc = new Scanner(System.in);


            System.out.println("Please, enter number");
            input = sc.nextInt();

            String num = "2019";
            Integer a = Integer.valueOf(num);

            int d = a.intValue();

            if ((input % 2) == 0){
                System.out.println("\nNumber is EVEN");
            } else {
                System.out.println("\nNumber is ODD");
            }


   }
```
* * *

### Exercise_5: ###
**Description:**

Write a Java program that reads an integer between 0 and 1000 and adds all the digits of that integer

```java
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
```
* * *

### Exercise_6: ###
**Description:**

Write java program which find the lowest common multiple of two Integer number.

```java
    public static void main (String args[]){

        System.out.println(MyMethod(8, 12));
    }

    public static int MyMethod(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }
    }
```
* * *


### Exercise_7: ###
**Description:**

Write program that outputs 10 times without using any loop ('for', 'while', 'do while', ect.)

```java
    static int index = 0;
    static String temp = "";
    public static void main(String[] args) {
        System.out.println(printMore("1_", 10));
    }

    private static String printMore(String myStr, int i) {

        temp += myStr;
        index++;
        if (index < i){

            printMore(myStr, i);
        }
        return temp;
    }
```
* * *

-[ ] **Exercise 8:**
Write a Java method to count all vowels in a string.



### Enjoy in open-source community :)
