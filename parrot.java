public class parrot {
public static void main(String args[]) {
int hr = 12;
boolean t=false;
//checking whether the hour is in the desired range
if(hr<0 || hr>23)
{
System.out.println("Wrong hour input");
}
else
//checking if hour is in 'trouble' range
{
if(hr<7 || hr>20)
{
//checking if parrot is talking or not talking in 'trouble' hour
if(t)
System.out.println("Oops, you are in trouble");
else
System.out.println("Glad you are not talking in this hour");
}
else
{
//checking if parrot is talking or not in 'safe' hours
if(t)
System.out.println("You are not in trouble, but stop talking!");
else
System.out.println("You are not in trouble at all, such a quiet parrot!");
}
}
}
}
