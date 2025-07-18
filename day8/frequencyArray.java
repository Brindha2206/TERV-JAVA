public class frequencyArray {
    public static void main(String ...arg) 
	{
	   int a[] = {1,2,1,3,4,4,1,5};
	   int c[] = new int[100];
	   for(int i = 0; i<a. length;i++)
	   {
	       c[ a[i] ]++;
	   }
	   for(int i = 0;i< c.length; i++)
	   //for(int i = c.length-1;i>=0; --i)
	   {
	       for( ;c[i]>0 ;c[i]-- )
	       System.out.print(i + " ");
	       //if(c[i]>0)
	   }
	}
}
