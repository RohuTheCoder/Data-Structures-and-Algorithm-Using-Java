public class InsertOperation {
    public static void main(String[] args) {
        int arr[] = {5, 7, 10, 20, 0};  // Increase the array size to accommodate the new element
        int x = 3;
        int pos = 2;
        int n = 4;  // Current size of the array
        int cap = 5;  // Capacity of the array
        int size = insert(arr, n, x, cap, pos);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
    static int insert(int arr[],int n,int x,int cap,int pos) 
    {
        if (n == cap) {
            System.out.println("Array is full. Cannot insert element.");
            return n;
        }

        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;
        return (n + 1);
    }
}
