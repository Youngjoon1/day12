package try_catch;

import javax.xml.stream.util.EventReaderDelegate;
//예외 전가
public class TestClass05 {
	public void test1() throws InterruptedException {
		//2.
		System.out.println("test1111");
		test2();
	}
	public void test2() throws InterruptedException {
		//1.
		System.out.println("test2222");
		Thread.sleep(0);
	}
	
	
}
