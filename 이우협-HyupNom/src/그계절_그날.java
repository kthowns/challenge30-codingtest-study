import java.util.Scanner;
public class 그계절_그날 { //4,6,9,11은 d가 최대 30 2는 d가 최대 29
    public static void ymd(int y, int m, int d){
        if((1 <= y || y <= 3000) && (m==3) && (1<=d || d<=31)){
            System.out.println("Spring");
        }
        if((1 <= y || y <= 3000) && (m==4) && (1<=d || d<=31)){
            if(d>=31){
                System.out.println("-1");
            }
            else
                System.out.println("Spring");
        }
        if((1 <= y || y <= 3000) && (m==5) && (1<=d || d<=31)){
            System.out.println("Spring");
        }
        if((1 <= y || y <= 3000) && (m==6) && (1<=d || d<=31)){
            if(d>=31){
                System.out.println("-1");
            }
            else
                System.out.println("Summer");
        }
        if((1 <= y || y <= 3000) && (m==7) && (1<=d || d<=31)){
            System.out.println("Summer");
        }
        if((1 <= y || y <= 3000) && (m==8) && (1<=d || d<=31)){
            System.out.println("Summer");
        }
        if((1 <= y || y <= 3000) && (m==9) && (1<=d || d<=31)){
            if(d>=31){
                System.out.println("-1");
            }
            else
                System.out.println("Winter");
        }
        if((1 <= y || y <= 3000) && (m==10) && (1<=d || d<=31)){
            System.out.println("Fall");
        }
        if((1 <= y || y <= 3000) && (m==11) && (1<=d || d<=31)){
            if(d>=31){
                System.out.println("-1");
            }
            else
                System.out.println("Fall");
        }
        if((1 <= y || y <= 3000) && (m==12) && (1<=d || d<=31)){
            System.out.println("Winter");
        }
        if((1 <= y || y <= 3000) && (m==1) && (1<=d || d<=31)){
            System.out.println("Winter");
        }
        if((1 <= y || y <= 3000) && (m==2) && (1<=d || d<=31)){
            if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){//윤년인가
                if(d==29){
                    System.out.println("Winter");
                }
                else if(d>29)
                    System.out.println("-1");
            }
            else
                System.out.println("Winter");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        ymd(y,m,d);
    }
}
