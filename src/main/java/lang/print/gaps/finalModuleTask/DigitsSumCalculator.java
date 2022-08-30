package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int numb1 = number % 10;
        int numb2 = number / 10 % 10;
        int numb3 = number / 100 % 10;
        int numb4 = number / 1000 % 10;
        System.out.println(numb1 + numb2 + numb3 + numb4);
    }
}
