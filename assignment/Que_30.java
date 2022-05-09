package assignment;

public class Que_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        printTriangle(n);
	}
    public static void printTriangle(int n)
    {
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            // ending line after each row
            System.out.println();
        }

}
}