import java.util.*;
class deepak
{
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	char ch;
	String str;
	int k=0,i;
	System.out.print("Enter the word: ");
	str = s.nextLine();
	for (i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
		}
		else{
		k++;
		}
	}
	System.out.print("No.of Consonants:"+k);
	}
}

