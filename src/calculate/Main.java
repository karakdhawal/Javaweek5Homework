package calculate;
/* Que1 Week 9 or Javaweek5
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)

 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char c;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first Number - ");
            int a = sc.nextInt();
            System.out.print("Please enter one of symbol +, -, *, / : ");
            char symbol = sc.next().charAt(0);
            System.out.print("Enter second Number - ");
            int b = sc.nextInt();
            //System.out.print (" Total ");
            Calculator obj = new Calculator();
            obj.calclateResult(a, b, symbol);
            System.out.println("Do you still want more? - Y or N");
            c = sc.next().charAt(0);
        } while (c== 'Y' || c== 'y');
    }



    }

