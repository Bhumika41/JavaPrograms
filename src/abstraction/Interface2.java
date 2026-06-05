package abstraction;
interface Shape{
	double pi=3.14;
	public void calculate_area();
}
interface Shape1{
	public void calculate_volume();
}
class Square implements Shape{
	double side=2;
	public void calculate_area() {
		double result=side*side;
		System.out.println(result);
	}
}
class Sphere implements Shape,Shape1{
	double r=4;
	public void calculate_volume() {
		double result=(4/3)*pi*r*r*r;
		System.out.println("volume of sphere="+result);
	}
	public void calculate_area() {
		double area=4*pi*r*r;
		System.out.println("area of sphere="+area);
	}
}
public class Interface2{
	public static void main(String[] args) {
		Sphere s1=new Sphere();
		s1.calculate_area();
		s1.calculate_volume();
		Square s2=new Square();
		s2.calculate_area();
	}
} 