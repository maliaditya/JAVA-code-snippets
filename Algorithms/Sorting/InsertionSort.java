class InsertionSort {



    void insertionSort(int arr[]){

        for (int i = 1; i <arr.length;i++) { 
            int key = arr[i],j; 
  
            for (j = i - 1;j >= 0 && arr[j] > key;j--) { 
                arr[j+1] = arr[j]; 
        
            } 
            arr[j + 1] = key; 
        } 
    }


    void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
            
    }

    

    public static void main(String[] args) {
        
        InsertionSort obj = new InsertionSort();

        int arr[] ={23,13,25,45,98,76,58};
        
        obj.insertionSort(arr);

        obj.printArray(arr);
    }
}
/**
 * 
   j  i
  23,13,25,45,98,76,58
  
 */
