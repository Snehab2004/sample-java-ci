package dev_test;
import org.testng.Assert;
public class Apptest {
	public void test1() {
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("sjcit", "sjc123"));
	}
	
	public void test2() {
		App myapp2=new App();
		Assert.assertEquals(0,myapp2.userLogin("sjcit", "sjc123"));
	}

}
