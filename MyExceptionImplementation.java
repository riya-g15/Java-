//Write a class called MyException() which has 2 methods: 
//1- 'Count the letters' which takes in a String and returns back number of English alphabets in the string.
//Ensure that only letter are counted and user defined Exception is raised if a non English letter is encountered.
//2- Takes in a arithmetic expression and returns the result. Use a user defined exception to check whether the given
//expression is a valid expression or not.
// Driver class MyExceptionImplementation and call the two methods in it.

class NotLetterException extends Exception  
{  
  public String getMessage()
  {
  	return ("NotLetterException!");
  	  }  
}  

class MyException
{
	public static void CountLetters(String s)
	{
		int count=0;
			for(int i=0;i<s.length();i++)
			{
				try
				{
				if(Character.isLetter(s.charAt(i))==false)
					throw new NotLetterException();
				else
					count+=1;
				}

				catch (NotLetterException ex)  
       			{  
            	System.out.println("Caught the exception, found a non-alphabet character. "+ ex.getMessage());
        		}  
			}		
		
		System.out.println("Cool, no problem. You have "+ count + " alphabets!");
        
	}
}

class MyExceptionImplementation
{
	public static void main(String[] args)
	{
		MyException.CountLetters("riya$3m");
	}
}