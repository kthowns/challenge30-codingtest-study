public class OutputOf27 {
    public static void main(String[] args) {
        System.out.println(f(215, 5));
    }

    /**
     * f(215,5) 호출
     * => f(215 / 3, 5 * 3) + 215 % 3 * y
     */
    public static int f(int a, int b){
        System.out.print("b : " + b );
        System.out.print(" , b > 0 : " + (b > 0));
        System.out.print(" , a % b : " + (a % b));
    return b > 0 ? f(b, a%b) + b : 0;
    }
}
