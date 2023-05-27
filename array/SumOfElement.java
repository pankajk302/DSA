class SumOfElement{

    public static int findSum(int[] arr)
    {
        int sum = 0;
        for(int index = 0; index < arr.length; index++)
        { 
            sum += arr[index];        
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 15, 20};
        System.out.println(findSum(arr));
    }
}