package pacroy.com.demo.jenkins;

public class DemoJenkins {
	public static final int TYPE_SCALENE = 1;
	public static final int TYPE_ISOSCELES = 2;
	public static final int TYPE_EQUILATERAL = 3;
	
	public static int getType(int i, int j, int k) {
		if ((i==j) && (j==k)) { 
			return TYPE_EQUILATERAL;
		} else if ((i==j) || (j==k) || (i==k)) {
			return TYPE_ISOSCELES;
		} else {
			return TYPE_SCALENE;
		}
	}

}
