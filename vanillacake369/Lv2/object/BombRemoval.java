import java.util.Scanner;

public class BombRemoval {

    private static final Scanner scanner = new Scanner(System.in);

    static class Bomb {
        public Bomb() {

        }

        public Bomb(String code, String lineColor, int second) {
            this.code = code;
            this.lineColor = lineColor;
            this.second = second;
        }

        String code;
        String lineColor;
        int second;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getLineColor() {
            return lineColor;
        }

        public void setLineColor(String lineColor) {
            this.lineColor = lineColor;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "code : " + this.code + "\ncolor : " + this.lineColor + "\nsecond : " + this.second;
        }
    }

    public static void main(String[] args) {
        String code = scanner.next();
        String color = scanner.next();
        int second = scanner.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        System.out.println(bomb);
    }
}
