import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MyOverloadingClass
{
	String message;
	String[] fruitlist;
	int lowerlt;
	int upperlt;
	String ticket;

	MyOverloadingClass(String message)
	{
		this.message=message;
	}

	MyOverloadingClass(String[] fruitlist)
	{
		this.fruitlist=fruitlist;
	}

	MyOverloadingClass(int lowerlt, int upperlt, String ticket)
	{
		this.lowerlt=lowerlt;
		this.upperlt=upperlt;
		this.ticket=ticket;
	}	

	boolean validate(String k)
	{	
		boolean vstring=false;
		List<String> allMatches = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(\\d+[a-zA-Z]+)");
		Matcher matcher = pattern.matcher(k);
		while(matcher.find())
		{
			allMatches.add(matcher.group());
		}
		if(allMatches.size()==0)
		vstring=false;
		else
		{
			System.out.println(allMatches);
			for(int v=0;v<allMatches.size();v++)
			{
				String check=allMatches.get(v);
				int t=Character.getNumericValue(check.charAt(0));
				if(check.length()==(t+1))
				vstring=true;
				else
				vstring=false;
				break;
			}
		}
	System.out.println(vstring);
	return vstring;
	}
	
	void validate(String[] list1)
	{
		int flag=0;
		for(int i=0;i<list1.length;i++)
		{
			String st=list1[i];
			if (st.indexOf("rotten")==0)
			{
				String st1=st.replace("rotten","");
				System.out.println("You have rotten "+ st1);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("You do not have rotten fruits!");
	}

	boolean validate(int llimit, int ulimit, String tik)
	{
		boolean k;
		String[] arrSplit = tik.split(",");
		Set<String> s = new HashSet<String>(Arrays.asList(arrSplit));
 
        // If all elements are distinct, size of
        // HashSet should be same array.
        boolean len=(s.size() == arrSplit.length);
        if (len==false)
        {
        	System.out.println("\nThe ticket has duplicate numbers!");
        	k=false;
        }
        else
    	{
    		if(arrSplit.length<llimit || arrSplit.length>ulimit)
    		{
    			System.out.println("\nTicket number does not contain allowed number of unique numbers");
    			k=false;
    		}
    		else
        	{

				System.out.println("YAY, validated");
				k=true;
			}
			
		}
	return k;
		
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter message for your object!");
		String mes=sc.nextLine();
		MyOverloadingClass oc=new MyOverloadingClass(mes);

		System.out.println("\nThe message for your object oc has been assigned as : " + oc.message);

		if(oc.validate(mes)==true)
			System.out.println("Validated!");
		else 
			System.out.println("Not Validated!");


		System.out.println("\nLet us validate our fruitlist to see if we have rotten vegetables!\n");

		String[] fruitarray = new String[]{"Apple","Banana","Grapes"};

		MyOverloadingClass oc1=new MyOverloadingClass(fruitarray);

		System.out.println("\nThe fruit list for oc1 is as follows: " + Arrays.toString(oc1.fruitlist));

		oc1.validate(fruitarray);

		System.out.println("\nEnter the lower limit: ");
		int l=sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter the upper limit: ");
		int u=sc.nextInt();
		sc.nextLine();
		String tiklot="empty";

		if(l>u)
		{
			System.out.println("\nLower limit should be less than upperlimit!\n Enter again!");
			System.out.println("\nEnter the lower limit: ");
			l=sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter the upper limit: ");
			u=sc.nextInt();
			sc.nextLine();
		}
		else{
		System.out.println("\nEnter the ticket number with various comma separated numbers!: ");
		tiklot=sc.nextLine();
		}

		MyOverloadingClass oc2=new MyOverloadingClass(l,u,tiklot);

		System.out.format("\nLower Limit for oc2 is : %d \n Upper limit is : %d \n Lottery Ticket number is: %s \n ",oc2.lowerlt,oc2.upperlt,oc2.ticket);

		oc2.validate(l,u,tiklot);
	}

}