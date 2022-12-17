import java.io.*;
public class Baperan {
	public static void main(String args[]) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (r);
		System.out.println("masukan nama anda");
		String name=br.readLine();
		System.out.println("selamat datang, "+name);
	}
}