package UserTry;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ксюша on 30.11.2017.
 */
public class GameForUser {


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int a = (int) (1 + Math.random() * 10);
        //    System.out.println(a);
        int k = (int) (1 + Math.random() * 5);
        System.out.println("Число ваших попыток - " + k);
        System.out.println("Введите число");

        int count = 0;


        while (true) {

            int userValue = myScan.nextInt();
            if (userValue < a) {
                System.out.println("Ваше число меньше чем МОЕ");

                count++;


            } else if (userValue > a) {
                System.out.println("Ваше число больше чем МОЕ");

                count++;


            } else {
                System.out.println("УРА!!!");
                break;

            }
            if (count == k) {
                break;
            }


        }
        System.out.println("Ваше число было - " + a);
    }


}
