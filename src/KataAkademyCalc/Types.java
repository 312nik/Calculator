package KataAkademyCalc;
import java.util.Arrays;

class Types {

    static final String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static final String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    static boolean arabicEntryCheck(String inputString) {
        for (String a : arabic) {
            if (a.equals(inputString)) {
                return true;
            }
        }

        return false;
    }

    static boolean romanEntryCheck(String inputString) {
        for (String a : roman) {
            if (a.equals(inputString)) {
                return true;
            }

            }

        gitreturn false;
    }

    static int romanToArabic(String inputString) {
        return Arrays.stream(roman).toList().indexOf(inputString) + 1;
    }
}
