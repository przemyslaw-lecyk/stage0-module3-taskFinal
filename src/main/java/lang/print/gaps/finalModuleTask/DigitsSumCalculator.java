package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0){
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
