/*
Pattern46
        A
      A B A
    A B C A B
  A B C D A B C
A B C D E A B C D
*/



class pattern45{

  public static void main(String[] args) {
    int fspace = 3, bspace=3;
    
    for(int i=0,p=1;i<4;i++){

      for(int j=0;j<8;j++){

          if(j<fspace || j>bspace){
            System.out.print("  ");
          } else{
            if( j<=3){
             System.out.print(p+" ");
             p++;
            } else{
              
              System.out.print(--p - 1+" ");
              
            }
          }
    
      }
      p=1;
      fspace--;
      bspace++;
      System.out.println();
    }

  }
}