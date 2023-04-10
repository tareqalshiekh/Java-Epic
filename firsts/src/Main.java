public class Main {
    public static void main(String[] args) {
        //EVEN
        //for
        int i=0 , y=0;
        for (;i<=100;i+=2)
        {
            System.out.println("i = " +i);
        }
        //do while
        int a=0;
        do{
            System.out.println("a = "+ a);
            a+=2;
        }while (a<=100);
        //while
        int s =0;
        while (s<=100) {
            System.out.println("s = " + s);
            s += 2;
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ODD
        //for
        int t=0 ;
        for (; t <= 100; t++) {
            if (t % 2 != 0) {
                System.out.println("t = "+ t);
            }
        }
//        do while
        int z=0;
        do{
            if(z %2==1){
                System.out.println("z = "+ z);

            }
            z++;
        }while (z<=100);
        //while
        int o =0;
        while (o<=100){
            if(o %2==1){
                System.out.println("o = "+ o);

            }
            o++;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int sum = 0;
        for (int b = 0; b <= 100; b++)
        {
            if (b % 7 == 0)
            {
                sum = sum + b;

            }
        }
        System.out.println("sum of numbers that is dividable by 7 -FOR = "+sum);



        int m=0,summ=0;
        do{
            if(m%7==0){
                summ = summ + m;
            }
            m++;
        }while (m<=100);
        System.out.println("sum of numbers that is dividable by 7 -do = "+summ);


        //while
        int f =0,ss=0;
        while (f<=100){
            if(f %7==0){

            ss+=f;
            }
            f++;
        }
        System.out.println("sum of numbers that is dividable by 7 -while= "+ ss);
}}