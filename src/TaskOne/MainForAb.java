package TaskOne;

import java.util.Scanner;

/**
 * Created by Ксюша on 30.11.2017.
 */
public class MainForAb {


    public static String prov(double a) {
        String s = "";
        if (a > 3) {
            s += "Хпи Хнурэ ХАИ";

            System.out.println("Хпи Хнурэ ХАИ");


            String[] b = s.split(" ");
            System.out.println("В какой вуз вы хотите?");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            System.out.println("вы успешно прошли в " + b[ch-1]);

        } else if (a <= 3) {
            s += "Каразина ХНЭУ Юрка";
            System.out.println("Каразина ХНЭУ Юрка");
            String[] b = s.split(" ");
            System.out.println("В какой вуз вы хотите?");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            System.out.println("вы успешно прошли в " + b[ch-1]);

        } else {
            System.out.println("Писать экзамены надо лучше");
        }
        return s;



    }


    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите имя");
        String nameOfAbitura = myScan.nextLine();
        System.out.println("Введите возраст");

        int age = myScan.nextInt();


        System.out.println("Введите пол");
        String sex = myScan.next();
        myScan.nextLine();

        System.out.println("Введите фак");
        String fuc = myScan.next();
        myScan.nextLine();
        System.out.println("Введите спец");
        String spec = myScan.next();
        myScan.nextLine();

        System.out.println("Введите название экзамена 1");
        String n1 = myScan.next();
        myScan.nextLine();

        System.out.println("Введите название экзамена 2");
        String n2 = myScan.next();
        myScan.nextLine();

        System.out.println("Введите название экзамена 3");
        String n3 = myScan.next();
        myScan.nextLine();

        System.out.println("Введите оценку экзамена 1");
        int m1 = myScan.nextInt();
        System.out.println("Введите оценку экзамена 2");
        int m2 = myScan.nextInt();

        System.out.println("Введите оценку экзамена 3");
        int m3 = myScan.nextInt();


        double mdM = (m1 + m2 + m3) / 3;


        Abitur abitur = new Abitur(nameOfAbitura, age, sex, fuc, spec, n1, n2, n3, m1, m2, m3, mdM);
        System.out.println(abitur);


        prov(mdM);


    }


}
