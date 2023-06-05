public class TodayTest {

public static void returnOfArray(int ch_arr[], int n){
    int[] re_array = new int[n];
        int a=n;
    for (int i = 0; i <n ; i++) {
        re_array[a-1]=ch_arr[i];
        a=a-1;
    }
    for (int i = 0; i < n; i++) {
        System.out.println(re_array[i]);
    }
}

    public static void main(String[] args) {
        int [] ch_arr={1,2,3,4,5,5};
        System.out.println("orginal array");
        for (int i = 0; i < ch_arr.length; i++) {
            System.out.println(ch_arr[i]);
        }
        System.out.println("------------");
        returnOfArray(ch_arr,ch_arr.length);
    }
}
