import java.util.*;
class triangle{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double sqa=a*a;
		double sqb=b*b;
		double sqc=c*c;
		if(a+b>c || a+c>b || b+c>a)
		{
			if(a==b && a==c && b==a)
			System.out.println("equilatral");
			else if((sqa==sqb+sqc) || (sqb==sqa+sqc) || (sqc==sqb+sqa))
				System.out.println("right-angled");
			else if(a==b || b==c || a==c)
			System.out.println("isosceles");
		    else
			System.out.println("not specific");
		}
		else
		System.out.println("invalid");
		
	}
}