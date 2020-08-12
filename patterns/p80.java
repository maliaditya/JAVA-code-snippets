/*
Pattern80
      A
     A B
    A B C
   A B C D
  A B C D E
   B C D E
    C D E
     D E
      E
 */


class Pattern80{


    public static void main(String[] args) {
        
        int p=1;
        for(int i=4;i>0;i--){

            System.out.print(" ");

            for(int j=1;j<=4;j++){
                
                if(j<i){

                System.out.print(" ");

                } else{

                System.out.print((char)(64+p)+" ");
                p++;
                }
            }
            p=1;
            System.out.println();
        }

        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){

                if(i>j){

                    System.out.print(" ");

                } else {

                    System.out.print((char)(64+j)+" ");

                }
            }
            System.out.println();


        }
    }
}