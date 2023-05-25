public class test1 {
  public static void main(String[] args){
    int x[] = new int[]{1,2,3};
    int y[] = new int[]{4,5,6};

    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(j==i){ // j==i가 나오면 다음 반복문으로 건너뛴다.
          continue;
        }
        // System.out.println(x[j] + " ");
        System.out.println(y[j] + " ");
      }
    }
  }
}
