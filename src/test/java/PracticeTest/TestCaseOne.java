package PracticeTest;

import org.testng.annotations.Test;

public class TestCaseOne {
//@Test(dataProvider ="datareader",description = "this is my main test",groups = "",)
	@Test
public void BloginPgverify1() {
	System.out.println("login page1");
}

	@Test
	public void AloginPgverify2() {
		System.out.println("login page2");
	}
	@Test
	public void CloginPgverify3() {
		System.out.println("login page3");
	}

}
