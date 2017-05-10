package complex;

public class main {

	public static void main(String[] args) {
		Complex test = new Complex(3,4);
		Complex test2 = new Complex(3,4);
		System.out.println(test.division(test2).real + " " +test.division(test2).imaginary+"i");
}

}
