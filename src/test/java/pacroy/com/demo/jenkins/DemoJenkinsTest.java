package pacroy.com.demo.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoJenkinsTest {

	@Test
	public void all_equal_should_return_equilateral() {
		assertEquals(DemoJenkins.TYPE_EQUILATERAL, DemoJenkins.getType(3,3,3));
		assertEquals(DemoJenkins.TYPE_EQUILATERAL, DemoJenkins.getType(5,5,5));
	}

	@Test
	public void only_two_equal_should_return_isosceles() {
		assertEquals(DemoJenkins.TYPE_ISOSCELES, DemoJenkins.getType(5,4,4));
		assertEquals(DemoJenkins.TYPE_ISOSCELES, DemoJenkins.getType(4,5,4));
		assertEquals(DemoJenkins.TYPE_ISOSCELES, DemoJenkins.getType(4,4,5));
	}
	
	@Test
	public void no_equal_should_return_scalene() {
		assertEquals(DemoJenkins.TYPE_SCALENE, DemoJenkins.getType(3,4,5));
		assertEquals(DemoJenkins.TYPE_SCALENE, DemoJenkins.getType(5,4,3));
		assertEquals(DemoJenkins.TYPE_SCALENE, DemoJenkins.getType(4,7,5));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void ทดสอบใช้ภาษาไทย() {
//		DemoJenkins dj = new DemoJenkins();
//		assertEquals(DemoJenkins.TYPE_SCALENE, dj.getType(456,789,567));
	}
}
