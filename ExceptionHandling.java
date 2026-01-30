public class ExceptionHandling
{
    public static void main(String[] args)
    {
      int i = 0;
      int j = 0;
      int[] arr = new int[5];
      String str= null;
      try
      {
        j = 18/i; // divided by zero Exception
        if(j==0){
            throw new ArithmeticException(); // use throw keyword to call catch block of ArithmeticException
        }

      }
      catch(ArithmeticException e)
      {
        j=18/1;// handling the divide by zero 
        System.out.println("Thats the default output" + e);
      }
      catch(Exception e) // parent class of all the Exceptions
      {
        System.out.println("Something went wrong" + e);
      } 

      System.out.println(j);
      System.out.println("Bye"); 
    }
}