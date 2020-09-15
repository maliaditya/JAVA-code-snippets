class OddPattern{

    public static void main(String[] args) {
        int p = 4;
        for(int i=1;i<=9;i+=2){
            for(int j=i;j<=i+p;j++){

                System.out.print(j+" ");
            }
            System.out.println();
            p--;
        }
    }
}