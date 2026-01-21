import java.util.Arrays;
class Find{
    public int max(int[] arr){
        int maxVal=arr[0];
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
     public int maxInRange(int[] arr , int start ,int end){
        int maxVal=arr[start];
        for(int i=start ; i < end ; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
public class MaxValue
{
    public static void main(String[] args)
    {
        Find obj = new Find();
        int arr[]={1,3,45,6,34,7,55};
        int ans = obj.max(arr);
        int ansRan = obj.maxInRange(arr,1,3);
        System.out.println(ans);
        System.out.println(ansRan);
    }
}