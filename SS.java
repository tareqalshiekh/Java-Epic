public class SS {
    static void re(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println("i = " + arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] int_arr={1,2,3,4,5,6};
        for (int c = 0; c < int_arr.length; c++) {
            System.out.println("ch_arr[c] = " + int_arr[c]);
        }
        System.out.println("----------");
        re(int_arr);
    }
}
