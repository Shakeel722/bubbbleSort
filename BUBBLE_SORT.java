
public class BUBBLE_SORT {

    // function to bubble sort the array 
    // logic - just compare the adjacent elements and push the larger to the last by swapping

    public static void bubbleSort(int[] arr){
        for(int i=0 ; i< arr.length; i++){

            for (int j =0 ; j< arr.length- 1 ; j++){

                if( arr[j] > arr[j+1]){ //if the first element larger then swap to send it at the last
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    

                }
            }
        }


    }


    public static void main(String[] args){

        int[] arr = { 1 , 34, 12, 5, 6, 2};

        bubbleSort(arr); // since arrays are passed by reference original array will be sorted
    
        
        for( int i: arr){  // printing my sorted array
            System.out.print(i);
        }
    
}
}
