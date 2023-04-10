public class Main {
    public static void main(String[] args) {
       int even=sumOfEvem(0,100,0);
        System.out.println("Sum Of Even = "+even);


        int Odd=sumOfOdd(0,100,0);
        System.out.println("Sum Of Odd = "+Odd);

        int DivideBySeven=DivideBySeven(0,100,0);
        System.out.println("DivideBySeven= "+DivideBySeven);
    }
    public static int sumOfEvem(int start,int end ,int sum){

        return start > end ?sum : sumOfEvem(start+1,end,sum+(start%2==0?start:0));
    }

    public static int sumOfOdd(int start,int end ,int sum){

        return start > end ?sum : sumOfOdd(start+1,end,sum+(start%2==1?start:0));
    }

    public static int DivideBySeven(int start,int end ,int sum){

        return start > end ?sum : DivideBySeven(start+1,end,sum+(start%7==0?start:0));
    }
}