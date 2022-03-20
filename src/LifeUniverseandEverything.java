import java.util.Scanner;  // Import the Scanner class
//https://www.spoj.com/problems/TEST/
class LifeUniverseandEverything {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        while (x!=42) {
            System.out.println(x);
            x= scan.nextInt();
        }
    }
}