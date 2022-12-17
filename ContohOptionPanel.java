import javax.swing.*;
public class ContohOptionPanel{
	public static void main (String[] args) {
		JFrame kontak;
		kontak=new JFrame();
		String name = JOptionPane.showInputDialog(kontak,"masukan nama anda");
		JOptionPane.showMessageDialog(kontak,"selamat datang, "+name);
	}

}
