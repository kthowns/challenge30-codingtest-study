import java.util.Scanner;
public class 숫자로_이루어진_사각형 {
    public static void print(int n){
        int sn=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sn + " ");
                sn++;
                if(sn==10){
                    sn = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
