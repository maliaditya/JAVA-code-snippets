class pattern6
{

    public static void main(String[] args) {
        int s=1;
        
        for(int i=1;i<=3;i++){

            for(int j=1;j<=3;j++){
                System.out.printf("%2d  ",(s*s)-1);
                s++;
                
                
            }
            System.out.println();

        }

    }
}