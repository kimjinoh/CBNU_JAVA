
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
			System.out.println("���ܰ� �߻��߽��ϴ�..");
		}
		finally 
		{
			System.out.println("==================================");
			System.out.println("���� �߻����ο� ������� ����˴ϴ�.");  
		}
	}
}

