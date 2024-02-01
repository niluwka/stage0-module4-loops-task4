package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int sum = 0;
int x =0;

 if (numberToSkip > lastInRow) {
            System.out.println ( "number to skip is bigger then the last" );
        } else if (numberToSkip < 0 && lastInRow < 0) {
     System.out.println("last number in row is negative");
 } else {

     for (int i = numberToSkip; i <= lastInRow; i++){
         if (i == numberToSkip) {
             x = numberToSkip+lastInRow;
             System.out.println ( "skipped sum is " + x);
             continue;

         }
         sum = sum + i;

     }System.out.println ( "counted sum is " + sum);
 }


    }
}
