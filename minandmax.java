public class minandmax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
            int max = arr[0];
            int min = arr[0];
    
            for (int i = 1; i < arr.length; i++){
                if (arr[i] > max) {
                    max = arr[i];
                }
    
                else if (arr[i] < min) {
                    min = arr[i];
                }
            }
     
            System.out.println("The minimum array element is " + min);
            System.out.println("The maximum array element is " + max);
        
    }
}

