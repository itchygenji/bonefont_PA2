import java.util.Scanner;

public class BMICalculator {

	
	Scanner input = new Scanner(System.in);

	
	private double height, weight, bmi;
	private int answer, a, category, b;
	
	
	

	//determines whether using imperial or metric system
	private int readUnitType() {
	
		while(true) {
		System.out.println("Please select whether you want imperial or metric system:\nType 1 for metric, 2 for imperial: ");
		answer = input.nextInt();
		
		if(answer == 1) {
			System.out.println("You chose metric.\n");
			break;
		}else if(answer == 2) {
			System.out.println("You chose imperial.\n");
			break;
		}else {
			System.out.println("Please try again, input correct answer.\nPlease input any number to try again: ");
			answer = input.nextInt();
			continue;
		}
		
	
		}
		return answer;
	}
	

	//takes weight and height inputs from user
	public void readUserData() {
		 
		a = readUnitType();
		//metric
		if(a == 1) {
			//System.out.println("worked");
			System.out.println("Please enter your weight in kilograms: ");
			weight = input.nextDouble();
			System.out.printf("The weight is : %.2f\n", weight);
			
			
			System.out.println("\nPlease enter your height in meters: ");
			height = input.nextDouble();
			System.out.printf("The height is : %.2f\n", height);
			
		//imperial
		}else if(a == 2) {
			
		
		System.out.println("Please enter your weight in pounds: ");
		weight = input.nextDouble();
		System.out.printf("The weight is : %.2f\n", weight);
		
		
		System.out.println("\nPlease enter your height in inches: ");
		height = input.nextDouble();
		System.out.printf("The height is : %.2f\n", height);
		
		
		}
		

		
		
	}
	
	
	public void calculateBmi() {
		//metric
		if(a == 1) {

		bmi = (weight / (height * height));
		
		//imperial
		}else if(a == 2) {
			
			bmi = (weight *703 / (height * height));
			
		}
		
	}
	//determines bmi category
	private int calculateBmiCategory() {
		if(bmi < 18.5) {
			category = 1;
		}else if(bmi > 18.5 && bmi < 24.9) {
			category = 2;
		}else if(bmi > 25 && bmi < 29.9) {
			category = 3;
		}else if(bmi >= 30) {
			category = 4;
		}
		return category;
		
	}
	//prints out bmi category and bmi
	public void displayBmi() {
		b = calculateBmiCategory();
		if( b == 1) {
			System.out.printf("\nYour BMI is : %.2f", bmi);
			System.out.println("\nYour BMI determines that you are underweight.");
			
		}else if(b == 2) {
			System.out.printf("\nYour BMI is : %.2f", bmi);
			System.out.println("\nYour BMI determines that you are at Normal weight.");
			
		}else if(b == 3) {
			System.out.printf("\nYour BMI is : %.2f", bmi);
			System.out.println("\nYour BMI determines that you are Overweight.");
			
		}else if(b == 4) {
			System.out.printf("\nYour BMI is : %.2f", bmi);
			System.out.println("\nYour BMI determines that you are Obese.");
		}
	}
}
	

