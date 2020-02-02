
public class Decrypter {
	
	public void getDecrypt(int decryptNum) {
		
		int a, b, c, d;
		//split the 4 digit number into separate numbers
		a = (decryptNum % 10);
		b = (decryptNum / 10) % 10;
		c = (decryptNum / 100) % 10;
		d = (decryptNum / 1000) % 10;
		
		
		
		int x, y, z, g;
		//decryption algorithm 
		x = (a + 3) % 10;
		y = (b + 3) % 10;
		z = (c + 3) % 10;
		g = (d + 3) % 10;
		
		
		System.out.println("The decrypted number is: " + y + x + g + z);
		
	}

}
