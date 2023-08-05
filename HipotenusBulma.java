import java.util.Scanner;
public class HipotenusBulma {

	public static void main(String[] args) {
		int a,b;
		double c;
		
		Scanner imp = new Scanner(System.in);
		System.out.println(" a kenarini giriniz : ");
		a = imp.nextInt();
		System.out.println(" b kenarini giriniz : ");
		b = imp.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus : "+c);
		
		
		
		
		

	}

}
