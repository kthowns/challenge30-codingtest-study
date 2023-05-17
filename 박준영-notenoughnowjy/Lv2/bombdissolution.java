import java.util.Scanner;

/*
 * 의사 코드
 * 1. resolve값을 받기 위한 revalue 클래스 선언
 * 2. 전역변수로 solvecode, solvecolor, solvesecond를 선언해준다.
 * 3. revalue메소드에서 solvecode, solvecolor, solvesecond를 선언해준다.
 * 4. 각각의 값을 scan받는다.
 * 5. revalue 클래스의 객체를 선언한다.
 * 6. 각각의 값을 출력한다.
 */

public class bombdissolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String solvecode = sc.next();
        char solvecolor = sc.next().charAt(0);
        int solvesecond = sc.nextInt();
        
        recvalue re = new recvalue(solvecode, solvecolor, solvesecond);
        System.out.println("code : " + re.solvecode);
        System.out.println("color : " + re.solvecolor);
        System.out.println("second : " + re.solvesecond);
    }
    
}

class recvalue{
    public String solvecode;
    public char solvecolor;
    public int solvesecond;


    public recvalue(String solvecode, char solvecolor, int solvesecond){
        this.solvecode = solvecode;
        this.solvecolor = solvecolor;
        this.solvesecond = solvesecond;
    }
}

