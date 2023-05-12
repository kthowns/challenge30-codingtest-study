import java.util.Scanner;


/*
 * 의사 코드
 * 
 * 1. 두 선분의 위치가 중요
 * 2. 한 선분을 l1(x1, x2)라고 하고
 * 3. 한 선분을 l2(x3, x4)라고 할 때,
 * 4. l1이 l2의 왼쪽에 있는 경우 -> x2가 x3보다 작아야지 겹치지 않는다. 즉, x3가 x2보다 커야지 겹친다.
 * 5. l1이 l2의 오른쪽에 있는 경우 -> x1이 x4보다 커야지 겹치지 않는다. 즉, x1이 x4보다 작아야지 겹친다.
 */
public class twolines {
    public static void main(String[] args){
        
        int x1, x2, x3, x4;

        Scanner sc = new Scanner(System.in);

        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();
        x4 = sc.nextInt();

        if(x1 > x4 || x3>x2){
            System.out.println("nonintersecting");
        }
        else{
            System.out.println("intersecting");
        }
    }
}
