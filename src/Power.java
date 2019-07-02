import java.lang.Math;

public class Power {

	public static void main(String[] args) {
		double radius = 3.0;
		double area = (Math.pow(radius, 2.0) * Math.PI);
		System.out.println(area);
		
		System.out.println((int)(Math.random()*6));
		
		for(int i= 1;i<10;i++) {
		      int dice = (int)(Math.random()*6)+1;
		      System.out.println("dice is " + dice);

		}
		
	}

}
