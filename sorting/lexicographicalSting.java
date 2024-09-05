package sorting;

public class lexicographicalSting {

    static void sortFruit(String[] f){
        int n = f.length;
        for(int i =0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                if(f[j].compareTo(f[min_index]) < 0){
                    min_index = j;
                }
            }
            String temp = f[i];
            f[i] = f[min_index];
            f[min_index]= temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi","apple","papaya","meango","maoii"};
        for (String val: fruits) {
            System.out.print(val + " ");
        }
        System.out.println(" ");
        sortFruit(fruits);
        for (String val: fruits) {
            System.out.print(val + " ");
        }
    }
}
