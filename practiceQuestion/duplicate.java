package practiceQuestion;

public class duplicate {
static int removeduplicate(int arr[], int n){
    int i = 0;
    for(int j =1; j <n; j++){
        if(arr[j]!=arr[i]){
            arr[i+1] = arr[j];
            i++;
        }
    }
    return (i+1);
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,2};
        System.out.println(removeduplicate(arr,6));
    }
}
