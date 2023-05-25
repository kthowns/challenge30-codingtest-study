import java.util.Scanner;
public class Main {
    public static void findX(int n, int m){
        int x = 0;
        for(int i = 1; i<= Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                x = i;
            }
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,x;
        n = sc.nextInt();
        m = sc.nextInt();
        findX(n,m);
    }
}