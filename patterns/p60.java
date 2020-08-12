/*

Pattern60
        3
      3 2 
    3 2 1 
  3 2 1 0
    3 2 1
      3 2 
        3
*/ 

class Pattern60{

    public static void main(String[] args) {
        int p=3,c =3;
        for(int i=0; i<4;i++){

            for(int j=0;j<4;j++){
                if(j<c){
                System.out.print("  ");
                }
                else{
                System.out.print(p+" ");
                p--;

                }

            }
            c--;
            p=3;
            System.out.println();
        }

        int p1 = 3,c1=1;

        for(int i=0;i<3;i++){

            for(int j=0;j<4;j++){

                if(j<c1){
                    System.out.print("  ");
                }
                else{
                    System.out.print(p1+" ");
                    p1--;
                }

            }
            c1++;
            p1=3;
            System.out.println();
        }

    }
}