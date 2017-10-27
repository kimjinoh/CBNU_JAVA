
public class ThrowsException {
	static int a, b;
	public static void main(String args[]) 
	{
		try {
			a = Integer.parseInt(args[1]);
			b = Integer.parseInt(args[0]);
			method1();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException 처리 루틴 : ");
			System.out.println(e + " 예외 발생"); 
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException 처리 루틴 : ");
			System.out.println(e + " 예외 발생"); 
		}
		catch(Exception e) 
		{
			System.out.println("나머지 모든 예외 처리 루틴 : ");
			System.out.println(e + " 예외 발생");
		} 
    }
	public static void method1() throws NumberFormatException
	{ 	
		System.out.println("매개변수로 입력받은 두 개의 값 :");
		System.out.println(" a = " + a + " b = " + b );
		System.out.println("==============================");
		method2();
	}
	public static void method2() throws ArithmeticException 
	{      
		System.out.println("최종 메소드 예외 발생 문장 수행 전");
		System.out.println("a를 b로 나눈 몫 = " + (a/b) );
		System.out.println("최종 메소드 예외 발생 문장 수행 후"); 
	}
}
