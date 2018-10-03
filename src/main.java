
public class main {

	
	public static void main(String[] args) {
		
		String s = "AAAAAAAAAAAAAAAAAAA";
		
		ChaineCrypter c = new ChaineCrypter(s, 3 );
		System.out.println(c.decrypte());
		System.out.println(c.crypte());

	}

}
