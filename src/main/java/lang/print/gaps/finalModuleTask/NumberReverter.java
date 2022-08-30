package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int numb1 = number % 10;
        int numb2 = number / 10 % 10;
        int numb3 = number / 100 % 10;
        System.out.println(numb1 + "" + numb2 + "" + numb3);
    }
}
