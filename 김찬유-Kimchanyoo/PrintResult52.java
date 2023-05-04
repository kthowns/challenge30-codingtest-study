/*
의사코드
재귀문 하나씩 계산하여 결과 계산

(71,15)+10                  = 1075
(23,45)+30              = 1065
(7,135)+90          = 1035
(2,405)+135      = 945
(0,1215)+810 = 810
 */
public class PrintResult52 {
    private static int f(int x, int y) {
        if (x == 0)
            return 0;
        return f(x / 3, y * 3) + x % 3 * y;
    }

    public static void main(String[] args) {
        System.out.println(f(215, 5));
    }
}
