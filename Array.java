import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, -7,2,100,-451};
        int arr2[] = { 2, 4,554,5,58,51,3};
        int arr3[] = { -52, -84, -19, -2,-25,-10,-45};
        System.out.println("Min Value of arr[2, 4, 1, -7,2,100,-451] is : "+minValue(arr));
        System.out.println("Min Value of arr2[2, 4,554,5,58,51,3] is : "+minValue(arr2));
        System.out.println("Min Value of arr3[-52, -84, -19, -2,-25,-10,-45] is : "+minValue(arr3));

        System.out.println("-------------------------------------------------");
        int array[] = {  2, 4, 1, -7,2,100,-451};
        int array2[] = { 2, 4,554,5,58,51,3};
        int array3[] = {-52, -84, -19, -2,-25,-10,-45};
        System.out.println("Max Value of array[2, 4, 1, -7,2,100,-451 ] is : "+maxValue(array));
        System.out.println("Max Value of array2[2, 4,554,5,58,51,3] is : "+maxValue(array2));
        System.out.println("Max Value of array3[-52, -84, -19, -2,-25,-10,-45 ] is : "+maxValue(array3));
        System.out.println("--------------------------------------------------");
        int arrOfSum[]={1,2,3,4,5,6,7,8,9,1};
        System.out.println("AVG : "+sumOfArray(arrOfSum));
        System.out.println("--------------------------------------------------");
        int[] arraySorted = {45, -2, 47, 10, -35};
        int[] arraySorted1 = {-45, -2, -47, -10, -35};
        int[] arraySorted2 = {2, 5, 7, 10, 1};

        int[] sortedArr = sortArray(arraySorted);
        int[] sortedArr1 = sortArray(arraySorted1);
        int[] sortedArr2 = sortArray(arraySorted2);
        System.out.println("-------------First Sort-----------");
        System.out.println("Before : "+Arrays.toString(arraySorted));
        System.out.println("After : "+Arrays.toString(sortedArr));
        System.out.println("-------------Second Sort-----------");
        System.out.println("Before 2 : "+Arrays.toString(arraySorted1));
        System.out.println("After 2 : "+Arrays.toString(sortedArr1));
        System.out.println("-------------Third Sort-----------");
        System.out.println("Before 3 : "+Arrays.toString(arraySorted2));
        System.out.println("After 3 : "+Arrays.toString(sortedArr2));
    }

    public static int minValue(int[] list)
    {
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < value)
                value  = list[i];
        }

        if(value >=0)
            return value;
        else
            return  value;

    }

    public static int maxValue(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max (arr[i])) {
                return arr[i];
            }
        }
        return 0;
    }

    private static boolean max (int i) {
        return i > 0 || i<0;
    }
    public static double sumOfArray(int[]arr){
        int i=0;
        int sum =0;
        double avg=0;
        for ( ; i <= arr.length ; i++)
        {
            sum+=i;
            double length= arr.length;
            avg = sum/length;
        }

        return avg;
    }


    public static int[] sortArray(int[] arr) {
        int[] sortedArr = arr.clone();
        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    int t = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = t;
                }
            }
        }
        return sortedArr;
    }
}


