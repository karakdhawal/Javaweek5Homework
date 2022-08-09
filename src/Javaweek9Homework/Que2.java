package Javaweek9Homework;

/* Que 2 repeat of week8 or Javaweek4 Marksheet
3. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

 */

import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student Name - ");
        String name = sc.next();
        System.out.print("Input roll no - ");
        while(!sc.hasNextInt()){
            System.out.println("Invalid input - roll no has to be in Number"); sc.next();
        }
        int no = sc.nextInt();
        System.out.print("Enter maths marks - ");
        while(! sc.hasNext()){
            System.out.println("Invalid input Marks should be between 0 and 100"); sc.next();
        }
        int maths = sc.nextInt();
        while (maths<0 || maths>100) {
            System.out.println("Invalid input Marks should be between 0 and 100");
            maths = sc.nextInt();
        }
        System.out.print ("Enter Science marks - ");
        while (!sc.hasNext()) {
            System.out.println("Invalid input Marks should be between 0 and 100"); sc.next();
        }
        int science = sc.nextInt();
        while (science<0 || science>100) {
            System.out.println("Invalid input Marks should be between 0 and 100");
            science = sc.nextInt();
        }
        System.out.print("Enter English marks - ");
        while (!sc.hasNext()) {
            System.out.println("Invalid input Marks should be between 0 and 100"); sc.next();
        }
        int english = sc.nextInt();
        while (english<0 || english>100) {
            System.out.println("Invalid input Marks should be between 0 and 100");
            english = sc.nextInt();
        }
        int t = (maths+science+english);
        double per = t/3;

        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|            Mark Sheet             |");
        System.out.println("|___________________________________|");
        System.out.println("|   Name    :"+ name + "                 |");
        System.out.println("|   Roll No :"+ no + "                    |");
        System.out.println("|___________________________________|");
        System.out.println("|   Subjects:       Marks           |");
        System.out.println("|   Maths   :"+ maths + "                     |");
        System.out.println("|   Science :"+ science + "                     |");
        System.out.println("|   English :"+ english + "                     |");
        System.out.println("|___________________________________|");
        System.out.println("|   Total   :"+ t + "                    |");
        System.out.println("|___________________________________|");
        System.out.println("|   Percentage:" + per + "                 |");
        if (per>=80){
            System.out.println("|    Result  :      Pass            |");
            System.out.println("|    Grade   :       A+             |");
        } else if (per>=60 && per<80) {
            System.out.println("|    Result  :      Pass            |");
            System.out.println("|    Grade   :       A              |");
        } else if (per>=50 && per<60){
            System.out.println("|    Result  :      Pass            |");
            System.out.println("|    Grade   :       B              |");
        } else if (per>=35 && per<50) {
            System.out.println("|    Result  :      Pass            |");
            System.out.println("|    Grade   :       C              |");
        }else {
            System.out.println("|    Result  :      Fail            |");
            System.out.println("|    Grade   :       NA             |");
        }
        System.out.println("|___________________________________|");


    }

}
