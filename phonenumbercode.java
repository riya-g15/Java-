import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class phonenumbercode{

	StringBuffer s= new StringBuffer(12);
	//Function to decode phone number
	void phonecode(String phone)
	{
		for(int i=0;i<phone.length();i++)
		{
			//checking if it is a number
			char ch=phone.charAt(i);
			if(Character.isDigit(ch))
			s.append(ch);
			else
			{
				//checking if it is a '-'
				if(ch=='-')
					s.append(ch);
				else
				{
					//decoding the alphabets to numbers
					switch(ch)
					{
						case 'A':
						case 'B':
						case 'C':
							s.append('2');
							break;
						case 'D':
						case 'E':
						case 'F':
							s.append('3');
							break;
						case 'G':
						case 'H':
						case 'I':
							s.append('4');
							break;
						case 'J':
						case 'K':
						case 'L':
							s.append('5');
							break;
						case 'M':
						case 'N':
						case 'O':
							s.append('6');
							break;
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
							s.append('7');
							break;
						case 'T':
						case 'U':
						case 'V':
							s.append('8');
							break;
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
							s.append('9');
							break;
					}
			
				}
			}
		}
		System.out.println("Your phone number is : "+ s);
			
		}

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			phonenumbercode p1=new phonenumbercode();
			System.out.println("Enter the coded phone number");
			String ph=sc.nextLine();
			//Using regex to match the pattern of string with how we want it
			Pattern pattern = Pattern.compile("[A-Z0-9]{3}-[A-Z0-9]{3}-[A-Z0-9]{4}");
    		Matcher matcher = pattern.matcher(ph);
    		boolean matchFound = matcher.find();
    		//if pattern matched, then pass to function
    		if(matchFound)
    			p1.phonecode(ph);
			else
			{ 
				//else exit the function
      		System.out.println("Incorrect output.\n");
      		System.exit(0);
      		}
		}
}