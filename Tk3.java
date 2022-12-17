public class Tk3 {
	public static void main(String[] args) {
		int a = 24;
		int b = 4;
		int c = 10;
		System.out.println(a + b * c);
		
		boolean True = true;
		boolean False = false;
		//Konjungsi
		System.out.print("True ^True : ");
		System.out.println(True && True);
		System.out.print("True ^ False : ");
		System.out.println(True && False);
		System.out.print("False ^ True : ");
		System.out.println(False && True);
		System.out.print("False ^ False : ");
		System.out.println(False && False);
		System.out.println();
		//Disjungsi
		System.out.print("True V True : ");
		System.out.println(True || True);
		System.out.print("True V False : ");
		System.out.println(True || False);
		System.out.print("False V True : ");
		System.out.println(False || True);
		System.out.print("False V False : ");
		System.out.println(False || False);
		System.out.println(); 
		
		int x = 4;
		int y = 2;
		int z = 3;
		System.out.println("Nilai x = " + x);
		System.out.println("Nilai y = " + y);
		System.out.print("x + y = ");
		System.out.println(x + y);
		System.out.print("x - y = ");
		System.out.println(x - y);
		System.out.print("x * y = ");
		System.out.println(x * y);
		System.out.print("x / y = ");
		System.out.println(x / y);
		System.out.print("x mod y = ");
		System.out.println(x % y);
		System.out.print("x mod z = ");
		System.out.println(x % z);
		
		int l = 4;
		int m = 2;
		int n = 3;
		System.out.println("Nilai l = " + l);
		System.out.println("Nilai m = " + m);
		System.out.print("l + m = ");
		System.out.println(l + m);
		System.out.print("l - m = ");
		System.out.println(l - m);
		System.out.print("l * m = ");
		System.out.println(l * m);
		System.out.print("l / m = ");
		System.out.println(l / m);
		System.out.print("l mod m = ");
		System.out.println(l % m);
		System.out.print("l mod n = ");
		System.out.println(l % n);
		
		int p = 50;
		System.out.println(p);
		p += 3; // p = p + 3
		System.out.println(p);
		p -= 3; // p = p - 3
		System.out.println(x);
		p *= 3; // p = p * 3
		System.out.println(x);
		p /= 3; // p = p / 3
		System.out.println(x);
		p %= 3; // p = p % 3
		System.out.println(p);
		
		int k = 5, w = 6;
		System.out.println(k);
		System.out.println(w);
		System.out.println(k=w);
		System.out.println(k==w);
		System.out.println();
		System.out.println(1 < 2);
		System.out.println(1 > 2);
		System.out.println(2 <= 2);
		System.out.println(3 >= 5);
		System.out.println(3 != 5);
		System.out.println(3 == 5);
		
		int o = 8;
		System.out.println("~ True : " + !True);
		System.out.println("~ False : " + !False);
		System.out.println();
		System.out.println(o > 2 && o < 9);
		System.out.println(o > 2 || o < 5);
		System.out.println(!(o > 2 && o < 9));
		
		int nilai = 80;
		String result;
		result = (nilai > 70) ? "Lulus" : "Remedial";
		System.out.println(result);
		
	}
	
}