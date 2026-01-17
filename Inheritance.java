class Calc // parent class , super class
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }

}
class AdvCalc extends Calc // child class ,sub class extend keyword is used for inheritance
{
   public int mul(int n1,int n2)
    {
        return n1*n2;
    } 
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class VryAdvCalc extends AdvCalc // child class ,sub class extend keyword is used for inheritance
{
   public double pow(int n1,int n2)
    {
        return Math.pow(n1,n2);
    } 
    public double sqrt(int n1)
    {
        return Math.sqrt(n1);
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        VryAdvCalc obj = new VryAdvCalc();
        int sum = obj.add(10,20);
        int sub = obj.sub(10,5);
        int mul = obj.mul(10,5);
        int div = obj.div(10,5);
        double pow = obj.pow(4,3);
        double sqrt = obj.sqrt(25);
        System.out.println("sum is :" + sum);
        System.out.println("sub is :" + sub);
        System.out.println("mul is :" + mul);
        System.out.println("div is :" + div);
        System.out.println("pow is :" + pow);
        System.out.println("sqrt is :" + sqrt);

    }
}