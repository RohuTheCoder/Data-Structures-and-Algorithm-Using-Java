public class FindOdd {

    public static void main(String[] args) {
        int arr[] ={7,3,7,7,7};
        int n = 5;
        int result = findOdd(arr,n);
        System.out.println("The odd occurring element is: "+result);
    }
    static int findOdd(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
}
