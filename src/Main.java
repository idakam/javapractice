
import java.util.Scanner;

public class Main {

 
  public static void main(String[] args) {
	  System.out.println("Hello, I am practicing Java!");
	  System.out.println("None of this will make sense! Just practicing!");
	  String name = "Ida";
			  System.out.println("My name is " + name);
	  int numb = 10;
	  int nummy = 15;
	  final int num = 26;
	  System.out.println(numb);
	  System.out.println(nummy);
	  System.out.println(num);
	  numb = 11;
	  System.out.println(numb);
	  System.out.println(numb + nummy + num);
	 
	  
	  float floaty = 786.87f;
	  char myFavLetter = 'G';
	  boolean javaIsCool = true;
	  
	  System.out.println("My favorite letter is " + myFavLetter);
	  System.out.println(floaty);
	  System.out.println(javaIsCool);
	  
	  int notFloaty = (int) floaty;
	  notFloaty += 10;
	  System.out.println(notFloaty);
	  
	  int a = 10;
	  int b = 10;
	  int c = 20;
	  int d = 30;
	  int e = c + d;
	  
	  System.out.println(e);
	  System.out.println(a == b);
	  System.out.println(b == c);
	  System.out.println(c < d);
	  System.out.println(b != c);
	  System.out.println(a == b && a < c);
	  System.out.println(a == b || d < c);
	  System.out.println(d % c);
	  System.out.println(a++);
	  
	  
	  String x = "10";
	  String y = "10";
	  
	  System.out.println(x + y);
	  
	  String alphabet = "abcdefghijklmnopqrstuvwxyz";
	  System.out.println("The length of the alphabet is " + alphabet.length());
	  System.out.println(alphabet.indexOf("i"));
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number and then I will double it");
	  int newNumb = Integer.parseInt(input.nextLine());
	  System.out.printf("Your number doubled is %d!\n", newNumb *= 2);

	  System.out.println("Do you like Java?");
	  String likeJava = input.nextLine();
	  
	  if (likeJava.equalsIgnoreCase("yes")) {
		  System.out.println("Great, you are at the right place.");
	  } else {
		  System.out.println("Maybe you should try python instead...");
	  }
	  input.close();
  }
}

