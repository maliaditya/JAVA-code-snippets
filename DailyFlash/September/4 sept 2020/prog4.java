class Pattern{

    public static void main(String[] args) {
        
        for(int i=3;i>=0;i--){
            int a = i;
            for(int j=0;j<=3-i ;j++){
                
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}