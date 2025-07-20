package school.mjc.stage0.loops.task4;

import org.w3c.dom.ls.LSOutput;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (numberToSkip<0 || lastInRow<0) {
            System.out.println("last number in row is negative");
        } else {
            int sum = 0;
            for (int i = 1; i <= numberToSkip; i++) {
                sum = sum + i;
            }
            System.out.println("skipped sum is " + sum);
            int firsy = numberToSkip+1;
            int summ = 0;
            while (firsy <= lastInRow) {
                summ = summ + firsy;
                firsy++;
            }
            System.out.println("counted sum is " + summ);

        }
    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(5,10);
    }
}
