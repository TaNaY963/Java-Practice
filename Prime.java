import java.util.Scanner;
class Check
{
    public boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        {
            while(c*c<=n)
            {
                if(n%c == 0)
                {
                    return false;
                }
                c++;
            }
        }
        return true;
    }
}
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        Check obj = new Check();
        if(obj.isPrime(num))
        {
            System.out.println("IsPrime");
        }
        else{
            System.out.println("NotPrime");
        }

    }
}