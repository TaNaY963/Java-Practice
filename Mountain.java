class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end)
        {
            int mid = start + (end -start) / 2 ;
            if(arr[mid]>arr[mid+1])
            {
                //you are in decreasing part of an array
                end = mid;
            }
            else
            {
                // you are in asc part 
                start = mid + 1; // as we know mid+1 > mid
            }
        }
        return start;
        
    }
}
public class Mountain
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        int[] arr={0,10,5,2};
        int result = obj.peakIndexInMountainArray(arr);
        System.out.println("max element in mountain array is :" + arr[result]);
    }
}