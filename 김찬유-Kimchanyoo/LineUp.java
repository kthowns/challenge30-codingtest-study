import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
의사코드
1. 학생 수를 나타내는 n을 입력받는다
2. 학생을 입력받으면서 번호 인덱스를 추가적으로 객체배열로 넣어준다
3. 학생들을 정렬한다
    3-1. 키가 더 큰 학생이 앞에 오게 한다
    3-2. 키가 동일하다면, 몸무게가 더 큰 학생이 앞에 오게 한다
    3-3. 키와 몸무게가 동일하다면, 번호가 작은 학생이 앞에 오게 한다
 */
public class LineUp {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> studentsList = new ArrayList<Student>();
    public static void main(String[] args){
        int n = sc.nextInt();
        sc.nextLine();

        inputStudents(n);

        sortedStudents();

        printStudents();
    }

    /**
     * 학생들의 정보를 기입해서 ArrayList에 넣어주는 함수
     */
    private static void inputStudents(int n) {
        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i + 1;
            studentsList.add(new Student(height, weight, number));
        }
    }

    /**
     * 학생들을 정렬해주는 함수
     */
    private static void sortedStudents() {
        Collections.sort(studentsList);
    }

    /**
     * 정렬된 학생들을 출력하는 함수
     */
    private static void printStudents() {
        for(int i = 0; i < studentsList.size(); i++){
            System.out.println(studentsList.get(i));
        }
    }
}
class Student implements Comparable<Student>{
    int height;
    int weight;
    int number;
    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return (height + " " + weight + " " + number);
    }
    @Override
    public int compareTo(Student student) {
        // 키순으로 내림차순 정렬
        if(this.height != student.height){
            return  student.height - this.height;
        }
        // 키가 동일할 경우 몸무게순으로 내림차순 정렬
        else if(this.weight != student.weight) {
            return student.weight - this.weight;
        }
        // 키, 몸무게가 동일하면 번호순으로 오름차순 정렬
        else{
            return this.number - student.number;
        }
    }
}
