/*

Pattern56
3 
2 3 
1 2 3
0 1 2 3
1 2 3
2 3
3 

*/ 



class Pattern56{

    public static void main(String[] args) {
        int p=3;
        for(int i=0;i<=4;i++){
        
            for(int j=0;j<i;j++){
                ++p;
                System.out.print(p+" ");
            
             }
             for(int q = 0;q<=i;q++){
                p--;
    }
            System.out.println();
        }

        int q=0;
        for(int i=3;i>0;i--){
            
            for(int j=1;j<=i;j++){
                    if(i<3){
                        System.out.print(j+q+" ");

                    }else
                    System.out.print(j+" ");
                    

            
             }
             q++;
            System.out.println();
        }

        

    }
}