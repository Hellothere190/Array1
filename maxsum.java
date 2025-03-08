public class maxsum {
    public static void main(String[] args){
        int [][] arr= {
            {1,45,78},
            {23,78,90},
            {45,898,45676}
        };int max = 0;
        for(int[] n : arr){
            for(int num:n){
                if(max<num){
                    max = num;
                }
            }
        }
        System.out.println("max num is : "+max);
    }
}
