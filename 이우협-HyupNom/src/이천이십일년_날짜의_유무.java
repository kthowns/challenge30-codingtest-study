import java.util.Scanner;
public class 이천이십일년_날짜의_유무 {
    public static void md(int m, int d){
        if((1<=m && m<=12) && (1<d && d<=31)){
            if(m == 2){
                if(d>28){
                    System.out.println("No");
                }
                else
                    System.out.println("Yes");
            }
            else if(m==4 || m==6 || m==9 || m==11){
                if(d>30){
                    System.out.println("No");
                }
                else
                    System.out.println("Yes");
            }
            else
                System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        md(m,d);
    }
}
