package Task5;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by Ксюша on 03.12.2017.
 */
public class Horse {
    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);

        System.out.println("Введите координату -  Х, с которой будет начало");

        int xS = myScan.nextInt();

        System.out.println("Введите координату -  Y начала");

        int yS = myScan.nextInt();

        System.out.println("Вы начинаете с точки  " + "" + xS + ":" + yS + "");

        while (true) {

            System.out.println("Введите Х точки куда будет ходить ваш конь");

            int xHorse = myScan.nextInt();

            System.out.println("Введите Y точки куда будет ходить ваш конь ");

            int yHorse = myScan.nextInt();

            if ((xHorse == (xS - 2) && yHorse == (yS - 1)) || (xHorse == (xS - 2) && yHorse == yS + 1) || (xHorse == xS + 2 && yHorse == yS - 1) || (xHorse == xS + 2 && yHorse == yS + 1) || (yHorse == yS - 2 && xHorse == xS - 1) || (yHorse == yS - 2 && xHorse == xS + 1) || (yHorse == yS + 2 && xHorse == xS - 1) || (yHorse == yS + 2 && xHorse == xS + 1) && xHorse <= 8 && xHorse >= 0 && yHorse <= 8 && yHorse >= 0) {

                System.out.println("Ваш ход: " + "" + xHorse + ":" + yHorse + "");

            } else {

                System.out.println("К сожалению, ход неправильный, повторите попытку");

            }

        }

    }
}
