package statements;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height");
	    float height=sc.nextFloat();
	    System.out.println("Enter your weight");
	    float weight=sc.nextFloat();
	    System.out.println("Enter your age");
	    int age=sc.nextInt();
	    if(height>=5.4 && height<=5.8) {
	    	if(weight>=50 && weight<=65) {
	    		if(age>=22 && age<=35) {
	    			System.out.println("Your are eligble to the cometition");
	    		}
	    		else {
	    			if(age<22) {
	    				System.out.println("your age is not satified");
	    			}
	    			else {
	    				System.out.println("your age is more");
	    			}
	    		}
	    		
	    	}
	    	else {
	    		if(weight<50) {
	    			System.out.println("increase your weigth");
	    		}
	    		else {
	    			System.out.println("Decrease your weight");
	    		}
	    	}
	    	
	    }
	    else {
	    	if(height<5.4) {
	    		System.out.println("Height not up to mark");
	    	}
	    	else {
	    		System.out.println("Your height is more");
	    	}
	    }
	}

}
