import java.util.Arrays;
import java.util.Scanner;
/*
1. 양의 정수의 원소의 수 n을 정함
2. n개의 원소를 입력함
3. Element 클래스배열을 만들어 원소들과 number를 적어넣는다
4. 원소들 정렬한다
    4-1. 원소가 다르다면 오름차순으로 원소를 정렬한다
    4-2. 원소가 같다면 먼저 입력된 원소순으로 정렬한다
5. 정렬한 원소의 number를 result배열의 인덱스로 해서 반복문 값을 넣어준다
6. 출력
 */
public class SortedElementPlace {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int[] result = new int[n];
        Element[] elementList = new Element[n];
        inputElements(n, elementList);
        sortedElements(result, elementList);
        printList(n, result);
    }

    /**
     * 원소를 입력하는 함수
     */
    private static void inputElements(int n, Element[] elementList) {
        for(int i = 0; i < n; i++){
            int element = sc.nextInt();
            int number = i;
            elementList[i] = new Element(element, number);
        }
    }

    /**
     * 원소들을 정렬하고 정렬하는 함수
     */
    private static void sortedElements(int[] result, Element[] elementList) {
        Arrays.sort(elementList);
        putInArray(result, elementList);
    }

    /**
     * 원소의 위치를 배열에 집어넣는 함수
     */
    private static void putInArray(int[] result, Element[] elementList) {
        for(int i = 0; i < result.length; i++){
            result[elementList[i].number] = i + 1;
        }
    }

    /**
     * 정렬된 숫자의 위치를 출력하는 함수
     */
    private static void printList(int n, int[] result) {
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}
class Element implements Comparable<Element>{
    int element;
    int number;
    public Element(int element, int number){
        this.element = element;
        this.number = number;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public int getElement() {
        return element;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return (element + " " + number);
    }

    @Override
    public int compareTo(Element el) {
        if(this.element != el.element){
            return this.element - el.element;
        }
        else{
            return this.number - el.number;
        }
    }
}