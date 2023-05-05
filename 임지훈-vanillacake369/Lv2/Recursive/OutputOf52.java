public class OutputOf52 {
    public static void main(String[] args) {
        System.out.println(f(215, 5));
    }

    /**
     * f(215,5) 호출 : 10 + 30 + 90 + 135 + 810
     * x / 3 : 71 , y * 3 : 15 , x % 3 * y : 10
     * x / 3 : 23 , y * 3 : 45 , x % 3 * y : 30
     * x / 3 : 7 , y * 3 : 135 , x % 3 * y : 90
     * x / 3 : 2 , y * 3 : 405 , x % 3 * y : 135
     * x / 3 : 0 , y * 3 : 1215 , x % 3 * y : 810
     */
    public static int f(int x, int y) {
        if (x == 0)
            return 0;
        System.out.print("x / 3 : " + x / 3);
        System.out.print(" , y * 3 : " + y * 3);
        System.out.println(" , x % 3 * y : " + x % 3 * y);

        return f(x / 3, y * 3) + x % 3 * y;
    }

}
