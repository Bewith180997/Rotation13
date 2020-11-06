import java.lang.Character;

/**
 * Rot 13 Program
 * @author Bewith180997
 *
 */
public class Rot13
{
	private static final char MINIMUM_ROTATION_VALUE = (char) 1;
	private static final char MAXIMUM_ROTATION_VALUE = (char) 25;
	
	/**
	 * Main method
	 * @param args Two arguments allowed, text for the message and then the number of rotations
	 */
	public static void main(String[] args) 
	{
			
		//Initialise values
		String message = "";
		char rotation = 13;
		
		
		//If arguments were passed
		if (args.length != 0) 
		{
			message = args[0];
			
			if(args.length == 2) 
			{
				try 
				{
					rotation = (char) Integer.parseInt(args[1]);
					if(rotation < MINIMUM_ROTATION_VALUE) 
					{
						System.out.println("Entered number too low (Must be between 1-25). Defaulting to 1.");
						rotation = MINIMUM_ROTATION_VALUE;
					}
					else if (rotation > MAXIMUM_ROTATION_VALUE) 
					{
						System.out.println("Entered number too high (Must be between 1-25). Defaulting to 25.");
						rotation = MAXIMUM_ROTATION_VALUE;
					}
				}
				catch(NumberFormatException e) 
				{
					System.out.println(e.getMessage() + ". Number format not accepted (Must be between 1-25). Defaulting to 13.");
					rotation = 13;
				}
				
			}
		}
		else 
		{
			message = "Hello World";
		}
		
		System.out.println("Entered Message: " + message);
		
		System.out.println("Result Message: " + rotate(message, rotation));

		

		//For debugging with various inputs
		/*
		//String testString =  "Uryyb Jbeyq";
		//String testString = "Gur Ahzore 16.";
		//String testString = "Axeeh Phkew!";
		
		String returnedString =  rotate(message, rotation;
		
		if(returnedString.equalsIgnoreCase(testString)) 
		{
			System.out.println("\n" + "PASS");
		}
		else 
		{
			System.out.println("\n" + "FAIL");
			
		}*/
		
	}
	
	
	/**
	 * 
	 * @param message The text to encrypt
	 * @param rotation The number representing how many characters each letter is shifted by
	 * @return The encrypted message
	 */
	public static String rotate(String message, char rotation) 
	{
				
		//For debugging with various inputs
		
		//message = "Hello World";
		//String message = "The Number 16.";
		//String message = "Hello World!";
		
		char[] messageArray= message.toCharArray();
		
		//Go through each letter
		for(int i = 0; i < message.length(); i++) 
		{
			
			//Ignore any numbers or punctuation
			if((Character.isAlphabetic(messageArray[i]))) 
			{
			
				//To handle case sensitivity
				if(Character.isUpperCase(messageArray[i])) 
				{
					messageArray[i] = (char) (((messageArray[i] + rotation)) % ('Z'+1));
					//If the rotation leaves the character outside of the alphabetic range
					if(messageArray[i] < 'A') 
					{
						messageArray[i] += 'A';
					}
				}
				else 
				{
					messageArray[i] = (char) (((messageArray[i] + rotation) )% ('z'+1));
					//If the rotation leaves the character outside of the alphabetic range
					if(messageArray[i] < 'a') 
					{
						messageArray[i] += 'a';
					}
				}				
			}
		}
		return String.valueOf(messageArray);
			
	}
}
