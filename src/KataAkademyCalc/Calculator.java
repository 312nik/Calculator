package KataAkademyCalc;

import java.util.Scanner;

import static KataAkademyCalc.Calc.calc;

public class Calculator {

    public static void main(String[] args) throws CustomException {

        Scanner scn = new Scanner(System.in);

        System.out.println(calc(scn.nextLine()));
}
}
