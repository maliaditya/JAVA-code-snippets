

class BubbleSort{

    void bubbleSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            for(int j=0;j<arr.length-i;j++){

                if(arr[j] > arr[j+1]){

                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }

    }

    void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
            
    }

    public static void main(String[] args) {
        
        BubbleSort obj = new BubbleSort();
        int arr[]={10,22,18,71,42,66};
        obj.bubbleSort(arr);
        obj.printArray(arr);
    }

}