import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter a 4 digit number to encrypt: ");
		int encryptNum = input.nextInt();//Store input for encrypt
		
		Encrypter number1 = new Encrypter();
		number1.getEncrypt(encryptNum);//call encrypt method
		
		
		
		System.out.println("\nEnter a 4 digit number to decrypt: ");
		int decryptNum = input.nextInt();//Store input for decrypt
		
		Decrypter number2 = new Decrypter();
		number2.getDecrypt(decryptNum);//call decrypt method
		
	

	}

}
