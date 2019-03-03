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

### Exercise_1: ###
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


-[X] **Exercise 3:**
Write a method in Java which takes String parameter and Character, then the method should remove the character from given String.

You can find answer in the package name of "E_3_third_exercise".


-[X] **Exercise 4:**
Write a Java program which takes input of Integer number and outputs the ODD or EVEN of the entered number.

You can find answer in the package name of "E_4_fourth_exercise".

-[X] **Exercise 5:**
Write a Java program that reads an integer between 0 and 1000 and adds all the digits of that integer

You can find answer in the package name of "E_5_fifth_exercise".


-[X] **Exercise 6:**
Write java program which find the lowest common multiple of two Integer number.

You can find answer in the package name of "E_6_exercise".


-[X] **Exercise 7:**
Write program that outputs 10 times without using any loop ('for', 'while', 'do while', ect.)


-[ ] **Exercise 8:**
Write a Java method to count all vowels in a string.



### Enjoy in open-source community :)
