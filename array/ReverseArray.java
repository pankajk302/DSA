import java.util.Arrays;

class ReverseArray{

    public static void reverseArray(int[] arr)
    {
        for(int index = 0; index < arr.length/2; index++)
        {
            int temp = arr[index];
            arr[index] = arr[arr.length - 1 - index];
            arr[arr.length - 1 - index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}