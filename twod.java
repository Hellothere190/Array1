public class twod {
    public static void main(String[] args){
        int arr[][]={
                {1,9,6},
                {56,78,89},
                {234,789,675}
        };
        int sum = 0;
        for (int n[] : arr){
            for (int num:n){
                sum+=num;
            }
        }
                System.out.println("Sum of the elements : "+sum);
    }
}
