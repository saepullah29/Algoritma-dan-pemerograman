public class Throwexample {
static void checkUmur(int umur) {
if (umur < 18) {
throw new ArithmeticException("Akses ditolak - Anda harusberusia minimal 18 tahun.");
} else {
System.out.println("Akses diberikan - Anda sudah cukupumur!");
}
}
public static void main(String args []) {
checkUmur(20);
}
}