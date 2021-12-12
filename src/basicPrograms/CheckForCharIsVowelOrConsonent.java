package basicPrograms;

public class CheckForCharIsVowelOrConsonent {
	public static boolean code(char alphabet) {
		boolean b=false;
		char c=Character.toLowerCase(alphabet);
		if(c>='a'&&c<='z') {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') b=true;
		}
		
		return b;
	} 
	public static void main(String[] args) {
		boolean vowelOrNot=CheckForCharIsVowelOrConsonent.code('k');
		if(vowelOrNot==true) System.out.print("its a vowel");
		else System.out.print("its a consonent");

	}

}
