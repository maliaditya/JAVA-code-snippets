class SelectionSort{
    
    void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){

                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
        
        SelectionSort obj = new SelectionSort();
        int arr[]={31,92,33,54,63,34,22};
        obj.selectionSort(arr);
        obj.printArray(arr);
    }
}