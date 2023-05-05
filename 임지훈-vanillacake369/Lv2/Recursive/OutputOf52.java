public class OutputOf52 {
    public static void main(String[] args) {
        System.out.println(f(215, 5));
    }

    /**
     * f(215,5) 호출
     * => f(215 / 3, 5 * 3) + 215 % 3 * y
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
