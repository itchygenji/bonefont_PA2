//import java.util.Scanner;

public class Encrypter {
	
	
	
	public void getEncrypt(int encryptNum) {
		
		
		int a, b, c, d;
		//split the 4 digit number into separate numbers
		a = (encryptNum % 10);
		b = (encryptNum / 10) % 10;
		c = (encryptNum / 100) % 10;
		d = (encryptNum / 1000) % 10;
		
		int x, y, z, g;
		//encryption algorithm
		x = (a + 7) % 10;
		y = (b + 7) % 10;
		z = (c + 7) % 10;
		g = (d + 7) % 10;
		
		System.out.println("The encrypted number is: " + y + x + g + z);
		
		
	}
	
	
	
	

}
