public class reverse_array{
    public static void main(String[] args) {
        int i;
        int arr[] = {1,2,3,4,5};
        System.out.println("original array ");
        for(i=0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("reverse array ");
        for(i=arr.length-1;i>=0; i-- ){
            System.out.print(arr[i] + ", ");
        }
    }
}