/*

Pattern62
        D
      C D
    B C D
  A B C D
    B C D
      C D
        D

*/ 

class Pattern62{

    public static void main(String[] args) {
        int p=2,c =3;
        for(int i=1; i<=4;i++){

            for(int j=0;j<4;j++){
                if(j<c){
                System.out.print("  ");
                }
                else{
                ++p;
                System.out.print((char)(65+p)+" ");
                

                }

            }
            c--;
            for(int q = 0;q<=i;q++){
                        p--;
            }
            
            System.out.println();
        }

        int c1=1;

        for(int i=0;i<3;i++){

            for(int j=0;j<4;j++){

                if(j<c1){
                    System.out.print("  ");
                }
                else{
                    ++p;
                    System.out.print((char)(65+j)+" ");
                    
                }

            }
            c1++;
     
            System.out.println();
        }




    }
}