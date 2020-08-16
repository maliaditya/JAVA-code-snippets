 class SecondLargestNumber {


    void secondLargestNumber(int a[]){


        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");

     }
     System.out.println();

        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                 
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("The second largest no from above array  is: " + a[a.length-2]);

    }



    public static void main(String[] args) {
        
        int a[] =  { 455, 800, 56, 39, 290, 18, 383, 3, 290, 29, 10};
        int b[] = {10, 9, 4, 5, 6, 7, 8, 3};
        int c[] = {10, 8, 56, 23, 45, 97, };

        SecondLargestNumber obj = new SecondLargestNumber();
        System.out.println();

        obj.secondLargestNumber(a);
        System.out.println();

        obj.secondLargestNumber(b);
        System.out.println();

        obj.secondLargestNumber(c);
   
    }
    
}