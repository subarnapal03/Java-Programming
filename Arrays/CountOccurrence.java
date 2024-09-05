package Arrays;

public class CountOccurrence {

    static void count(int [] arr, int x){
        int num =0;
        for(int i=0; i<arr.length; i++){
             if(arr[i]==x){
                 num++;
             }
        }
        System.out.println("Number of count is: " +num);
    }
    static void print(int []arr){
        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0]=1;
        arr[1]=3;
        arr[2]=1;
        arr[3]=2;
        arr[4]=1;
        int x = 1;
        print(arr);
        count(arr,x);
    }
}
