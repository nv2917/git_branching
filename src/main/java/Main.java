public class Main {
    public static void main(String[] args) {
        System.out.println("Good Morning, Universe!");
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
        int sum = 0;
        for(int i=30;i<=40;i++) {
            sum = sum+i;
        }
        System.out.println(sum);

        int fac = 0;
        int temp = 0;
        for(int i=1;i<=5;i++) {
            fac = i;
            for (int j = i; j > 1; j--) {
                temp = (j-1);
                fac = fac * temp;
            }
            System.out.println(fac);
        }



        for ( int n = 1 ; n < 6 ; n++){
            double x = 1.4;
            System.out.println(Math.pow(x,n));
        }

        System.out.println("Goodbye, Universe!");
    }
}
