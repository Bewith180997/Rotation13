Rot13 Program - Benjamin Thomas
Language - Java

Before running the program, compile the source file using the following command:
	javac Main.java
This creates a new file Main.class

Then run the resulting file using:
	java Main

This will run and exit using pre-defined values. Namely, "Hello World" with a rotation value of 13.
Alternative text can be found in the source code, along with a string comparison for whether these values match the expected output.

You can enter your own arguments for the program to encrypt, using the following command:
	java Main "Text" Number
	- Where Text is a string encapsulated with ", and
	- Number is a positive integer between 1 and 25
	- Example: java Main "Hello World" 13

To test the code using the provided examples, the JUnit file 'Tester.java' was made. 
Here, test cases were made to compare the inputs with their expected outputs.
However, the limiation is that this Tester file may not compile or work without the JUnit library installed on the machine it is running on.
Eclipse IDE was used for developing this program.