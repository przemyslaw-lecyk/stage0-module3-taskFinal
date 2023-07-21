package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revertedNumber = 0;
        while (number != 0){
            int reminder = number % 10;
            revertedNumber = revertedNumber * 10 + reminder;
            number = number / 10;
        }
        System.out.println(revertedNumber);
    }
}
