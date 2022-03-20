import java.util.Scanner;  // Import the Scanner class

//https://www.spoj.com/problems/SMPDIV/
class Divisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        while (t != 0) {

            for(int i=1 ;i<=n ; i++) {
                int r = i % x;
                int b = i % y;
               if(r==0 && b!=0) {

                   System.out.println(i);
               }
            }

            t--;
            if(t!=0) {
                n = scan.nextInt();
                x = scan.nextInt();
                y = scan.nextInt();
            }

        }
    }
}
