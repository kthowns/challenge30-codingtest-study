public class Main{

  public static int[] numbers = new int[]{1,5,3,6};
  public static void main(String[] args){
    int mindiff = 100;
    for(int i=0;i<4;i++){
      for(int j=i+1;j<4;j++){
        mindiff = Math.min(mindiff, getDiff(i,j));
      }
    }
    System.out.println(mindiff);
  }
  private static int getDiff(int i, int j) {
    int sum1 = numbers[i] + numbers[j];
    int sum2 = 0;
    for(int k=0; k<4; k++){
      sum2 += numbers[k];
    }
    sum2 -= sum1;
    return Math.abs(sum1 - sum2);
  }
}