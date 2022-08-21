package KataAkademyCalc;

class ArabicToRoman {
    static String [] roman = {"C", "XC","L", "XL", "X", "V", "IV","I"};
    static int [] number={100,90,50,40,10,5,4,1};

    static String toRoman(int num){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while ((num > 0) && i<=8){
           if (number[i]<= num){
               sb.append(roman[i]);
               num=num-number[i];
           }
           else i++;
        }

        return sb.toString();
    }

}
