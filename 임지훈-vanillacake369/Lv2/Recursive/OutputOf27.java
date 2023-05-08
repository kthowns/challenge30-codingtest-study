public class OutputOf27 {
    public static void main(String[] args) {
        System.out.println(f(21, 34));
        System.out.println(f(123, 12));
        System.out.println(f(2021, 4));
        System.out.println(f(107, 36));
        System.out.println(f(66, 60));
    }

    /**
     * f(21, 34) => 87
     * b : 34 , b > 0 : true , a % b : 21
     * b : 21 , b > 0 : true , a % b : 13
     * b : 13 , b > 0 : true , a % b : 8
     * b : 8 , b > 0 : true , a % b : 5
     * b : 5 , b > 0 : true , a % b : 3
     * b : 3 , b > 0 : true , a % b : 2
     * b : 2 , b > 0 : true , a % b : 1
     * b : 1 , b > 0 : true , a % b : 0
     * b : 0 , b > 0 : false
     * f(123, 12) => 15
     * b : 12 , b > 0 : true , a % b : 3
     * b : 3 , b > 0 : true , a % b : 0
     * b : 0 , b > 0 : false
     * f(2021, 4) => 5
     * b : 4 , b > 0 : true , a % b : 1
     * b : 1 , b > 0 : true , a % b : 0
     * b : 0 , b > 0 : false
     * f(107, 36) => 72
     * b : 36 , b > 0 : true , a % b : 35
     * b : 35 , b > 0 : true , a % b : 1
     * b : 1 , b > 0 : true , a % b : 0
     * b : 0 , b > 0 : false
     * f(66, 60) => 66
     * b : 60 , b > 0 : true , a % b : 6
     * b : 6 , b > 0 : true , a % b : 0
     * b : 0 , b > 0 : false
     */
    public static int f(int a, int b) {
        return b > 0 ? f(b, a % b) + b : 0;
    }
}
