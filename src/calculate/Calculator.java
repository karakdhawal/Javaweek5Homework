package calculate;
/*
Que 1 week 9 - JavaWeek5
1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
 */
import java.util.Scanner;

public class Calculator {

    public void addition (int a, int b) {
        System.out.println("addition = " + (a+b));
    }

    public void subtraction (int a, int b) {
        System.out.println("subtraction = " + (a-b));
    }

    public void division (int a, int b) {
        System.out.println("division = " + (a/b));
    }

    public void multiplication (int a, int b) {
        System.out.println("multiplication = " + (a*b));
    }

    public void calclateResult (int a, int b, char symbol){
        if (symbol=='+') {
          addition(a,b);
        } else if (symbol=='-') {
            subtraction(a, b);
        } else if (symbol=='/') {
            division(a, b);
        } else if (symbol=='*') {
            multiplication(a, b);

        }

    }


}
