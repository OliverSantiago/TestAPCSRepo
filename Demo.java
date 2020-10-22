import java.util.Random;
public class Demo{
  public static void main(String[] args){
    if (args.length>0){
      int x = Integer.parseInt(args[0])+1;
      for (int i = 1; i <= x; i++){
        for (int j = 1; j <= x-i; j++){
          System.out.print(i);
        }
        System.out.println();
      }
   }//else{
    //System.out.println("11111\n2222\n333\n44\n5");
  //}
  //System.out.println(create2DArrayRandomized(6,4,4));
}

  public static String arrToString(int[]arr){
    String answer = "{";
    if (arr.length==0){
      answer+="}";
    }
    for (int i = 0; i < arr.length; i++){
      String s = Integer.toString(arr[i]);
      answer += s;
      if (i == arr.length-1){
        answer += "}";
      }else{
        answer +=", ";
      }
    }
    return answer;
  }

  public static String arrayDeepToString(int[][]arr){
    String answerfinal = "{";
    String answer = "{";
    for (int i = 0; i < arr.length; i++){
      for (int k = 0; k < arr[i].length||arr[i].length==0;k++){
        if (arr[i].length==0){
          answer="{}";
          answerfinal+=answer;
          answer = "{";
          if (i==arr.length-1){
            answerfinal+="}";
          }else{
            answerfinal+=", ";
          }
          break;
        }
        answer+=arr[i][k];
        if (k == arr[i].length-1){
          answer += "}";
          answerfinal+=answer;
          answer = "{";
          if (i==arr.length-1){
            answerfinal+="}";
          }else{
            answerfinal+=", ";
          }
        }else{
          answer +=", ";
        }
      }
    }
    return answerfinal;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][]arr=new int[rows][cols];
    for (int i = 0; i < rows; i++){
      for (int k = 0; k < cols; k++){
        Random rand = new Random();
        arr[i][k]=rand.nextInt(maxValue+1);
      }
    }
    return arr;
  }
  public static int[][]create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][]arr=new int[rows][];
    for(int i = 0 ; i < rows; i++){
      Random rand = new Random();
      arr[i]= new int[rand.nextInt(cols+1)];
    }
    for (int i = 0; i < rows; i++){
      for (int k = 0; k <= cols; k++){
        if (k<arr[i].length){
        Random rand = new Random();
        arr[i][k]=rand.nextInt(maxValue+1);}
      }
    }
    return arr;
  }
}
