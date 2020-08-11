/*
Pattern32
E E E E E
  D D D D
    C C C
      B B
        A
*/

class Pattern32{

  public static void main(String[] args) {
      
      int j,p=5;

      for(int i=0,c=64;i<5;i++){
          for (j=0;j<5;j++){
              if(j<i)
              System.out.print("  ");
              else
              System.out.print((char)(c+p)+" ");

          }
          p--;
      System.out.println();
      }   
  }
}