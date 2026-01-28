import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
{
    public int searchCeiling(int [] arr , int target)
    {
        if(target > arr[arr.length -1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start) / 2; 
            if(target< arr[mid])
            {
                end = mid -1 ;
            } 
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else 
            {
                return mid ;
            }
        }
        
    return start;
    }

    public int searchFloor(int [] arr , int target)
    {
        if(target > arr[arr.length -1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start) / 2; 
            if(target< arr[mid])
            {
                end = mid -1 ;
            } 
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else 
            {
                return mid ;
            }
        }
        
        return end;

    }
}

public class CeilingNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearch obj = new BinarySearch();
        int [] arr ={1,3,4,5,6,7,12,14,27};
        int target = 11;
        int ans1 =obj.searchCeiling(arr,target);
        int ans2 =obj.searchFloor(arr,target);
        System.out.println("Ceiling number to the target is :" + arr[ans1]);
        System.out.println("Ceiling number to the target is :" + arr[ans2]);


    }
}