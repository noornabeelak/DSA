import java.util.Arrays;
public class minHeight {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int min=arr[0]+k;
        int max=arr[arr.length-1]-k;
        return max-min;

       
    }

    public static void main(String[]args){
        int[] arr={1, 5, 8, 10};
        int k = 2;
        minHeight obj=new minHeight();
        System.out.println(obj.getMinDiff(arr, k));
    }
}

