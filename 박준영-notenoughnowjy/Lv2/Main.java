public class Main{
  public static int n = 5;
  public static int[][] arr = new int[][]{
    {1,3}, {2,4}, {5,8}, {6,9}, {7,10}
  };
  public static void main(String[] args){
    int result = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      int[] counting = new int[11];
      for(int j=0; j<n; j++){
        if(i==j){
          continue;
        }
        int x1 = arr[j][0], x2 = arr[j][1];
        for(int k=x1; k<=x2; k++){
          counting[k]++;
        }
      }
      
      int maxCnt = 0;
      for(int j=0; j<11; j++){
        maxCnt = Math.max(maxCnt, counting[j]);
      }

      result = Math.min(result, maxCnt);
    }
    System.out.println(result);
  }
}