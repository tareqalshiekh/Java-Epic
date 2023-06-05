import java.util.ArrayList;
import java.util.List;

public class LessMoreEqualF {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 8, 2, 3,44, 7, 99, 5};
        List<Integer> lessTh5 = new ArrayList<>();
        List<Integer> equalTo5 = new ArrayList<>();
        List<Integer> greaterTh5 = new ArrayList<>();

        for (int n :numbers){
            if (n<5) {
                lessTh5.add(n);
            } else if (n==5)
            {
                    equalTo5.add(n);
            } else if (n>5) {
                greaterTh5.add(n);

            }
        }

        System.out.println("Numbers less than 5: " + lessTh5);
        System.out.println("Numbers equal to 5: " + equalTo5);
        System.out.println("Numbers greater than 5: " + greaterTh5);
    }

}
