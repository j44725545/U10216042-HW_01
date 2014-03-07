package HW_01;
import java.util.Scanner;
public class HW_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x ;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		x=input.nextDouble();
		
		F_a f_a = new F_a();
		System.out.println(f_a.f(x));
		F_b f_b = new F_b();
		System.out.println(f_b.f(x));
		F_c f_c = new F_c();
		System.out.println(f_c.f(x));
		F_d f_d = new F_d();
		System.out.println(f_d.f(x));
		F_e f_e = new F_e();
		System.out.println(f_e.f(x));
		F_f f_f = new F_f();
		System.out.println(f_f.f(x));
		F_g f_g = new F_g();
		System.out.println(f_g.f(x));
	}
}