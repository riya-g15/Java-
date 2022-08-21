public class monkey {
public static void main(String args[]) {
boolean aSmile=false;
boolean bSmile=true;
//checking if both monkeys are smiling
if(aSmile && bSmile)
System.out.println("Both of you are smiling, TROUBLE!!");
else
//checking if none of them is smiling
if(aSmile==false && bSmile==false)
System.out.println("None of you is smiling, TROUBLE!!");
else
System.out.println("Well, no trouble!");
}
}


