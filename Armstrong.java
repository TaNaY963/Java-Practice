import java.util.Scanner;
class Check
{
    public int isArmstrong(int num){
    int n=num;
    int result=0;
    while(n>0)
    {
        int rem = n%10;
        result += rem * rem * rem ; 
        n=n/10;    
    }
    return result;

}
}

public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        Check obj = new Check();
        int result = obj.isArmstrong(num);
        if(num==result)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
    }
}