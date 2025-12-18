// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Star{
    public static void main(String args[])
    {
    
        int n=11;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==0|| i==5||i==n-1||j==1||j==6||j==n)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
         
    }
}
