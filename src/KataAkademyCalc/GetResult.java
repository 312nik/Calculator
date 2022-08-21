package KataAkademyCalc;

public class GetResult {
    static int getResult(int num1, int num2, char operation) throws CustomException {
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                throw new CustomException ();
        }
        return result;
    }
}


