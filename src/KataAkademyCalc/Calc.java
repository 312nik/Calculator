package KataAkademyCalc;

import static KataAkademyCalc.ArabicToRoman.toRoman;
import static KataAkademyCalc.GetResult.getResult;
import static KataAkademyCalc.Types.*;
import static KataAkademyCalc.Types.romanToArabic;

public class Calc {
    static String[] data;
    static int num1,num2,result;
    static char operation;

    static String calc (String input) throws CustomException {

        data = input.split("[-+/*]");

        if ( arabicEntryCheck(data[0]) && arabicEntryCheck(data[1])) {
            num1=Integer.parseInt(data[0]);
            num2=Integer.parseInt(data[1]);
            operation=input.charAt(data[0].length());
            result=getResult(num1,num2,operation);
            return String.valueOf(result);
        }
        if (romanEntryCheck(data[0]) && romanEntryCheck(data[1])) {
            num1 = romanToArabic(data[0]);
            num2 = romanToArabic(data[1]);
            operation = input.charAt(data[0].length());
            result = getResult(num1, num2, operation);
             if (result < 1) {
                throw new CustomException("throws Exception // римские цифры -  натуральные  числа");}

                return toRoman(result);
            }
        else{throw new CustomException("throws Exception // формат записи не соответствует условиям калькулятора");}


}
}

