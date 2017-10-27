
class ExceptionProblem
 {
	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		try 
		{
			for(int i = 0; i<=3; i++)
			{
					System.out.println("a["+ i +"]: "+ a[i]);
			}	
		}
		catch (Exception e)
		{
			System.out.println("예외가 발생했습니다..");
		}
		finally 
		{
			System.out.println("==================================");
			System.out.println("예외 발생여부와 상관없이 수행됩니다.");  
		}
	}
}

