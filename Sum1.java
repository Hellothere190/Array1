public class Sum1  {
    public static void main(String[] args){
        int[] arr= {1,5,7,8,10,12};

        int sum = 0;

        for(int i = 0
            ; i < arr.length ;i++){
            sum=sum+arr[i];

            System.out.println("The sum of the array is ="+sum);
        }

    }
}

