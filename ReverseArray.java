import java.util.Scanner;
import java.util.Arrays;
class Solve
{
    public int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;

    }
    public void swap(int[] arr, int index1 ,int index2)
    {
       int temp = arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp; 
       //System.out.println(Arrays.toString(arr)); if need step wise solution
    }
}
public class ReverseArray
{
    public static void main(String[] args)
    {   

        Scanner sc = new Scanner(System.in);
        Solve obj = new Solve();
        System.out.println("Enter no of elements you want in array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans = obj.reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
}
