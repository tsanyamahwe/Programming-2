package PracticalLearning;
import java.util.Scanner;

public class RegexValidateInputTest {
	public static void main(String [] args) {
	   	//Scanner scanner = new Scanner(System.in);
    	//System.out.print("Enter first name: ");
    	String firstName = "Tendai";
    	//System.out.print("Enter last name (surname): ");
    	String lastName = "Sanyamahwe";
    	//System.out.print("Enter address: ");
    	String address = "363 Cabot Avenue";
    	//System.out.print("Enter the surbub: ");
    	String surbub = "Lindhaven";
    	//System.out.print("Enter the city: ");
    	String city = "Roodepoort";
    	//System.out.print("Enter the state: ");
    	String state = "Gauteng";
    	//System.out.print("Enter the zipcode: ");
    	String zip = "17241";
    	//System.out.print("Enter the phone number: ");
    	String phone = "(121) 234-9547";
    	
    	System.out.println("\nValidate Result: ");
    	
    	if(!RegexValidateInput.validateFirstName(firstName)) {System.out.println("Invalid name");}
    	else if (!RegexValidateInput.validateLastName(lastName)) {System.out.println("Invalid surname");}
    	else if (!RegexValidateInput.validateAddress(address)) {System.out.println("Invalid address");}
    	else if (!RegexValidateInput.validateCity(surbub)) {System.out.println("Invalid surbub");}
    	else if (!RegexValidateInput.validateCity(city)) {System.out.println("Invalid city name");}
    	else if (!RegexValidateInput.validateState(state)) {System.out.println("Invalid state");}
    	else if (!RegexValidateInput.validateZip(zip)) {System.out.println("Invalid zip code");}
    	else if (!RegexValidateInput.validatePhone(phone)) {System.out.println("Invalid phone number");}
    	else {System.out.println("Valid input. Thank you");}
    }
}
