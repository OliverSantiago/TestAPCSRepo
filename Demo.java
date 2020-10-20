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
   }else{
    System.out.println("11111\n2222\n333\n44\n5");
  }
}
}
