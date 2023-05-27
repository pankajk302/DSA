class MaxElement{

    public static int findMaximum(int[] arr)
    {
        int max = arr[0];
        for(int index = 1; index < arr.length; index++)
        {
            if(max < arr[index])
                max = arr[index];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 15, 20};
        System.out.println(findMaximum(arr));
    }
}