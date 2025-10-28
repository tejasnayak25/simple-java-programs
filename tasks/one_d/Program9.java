package tasks.one_d;

public class Program9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) continue;
            System.out.println(arr[i]);
        }
    }
}
