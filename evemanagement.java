import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Event{

    String eventName;
    String eventVenue;
    int participants_no;
    String participation_type;
    int eventDay;
    String eventType;
    String eventHead;

    Event(String eventName, int eventDay,String eventType, int participants_no,String participation_type)
    {
        this.eventName = eventName ;
        this.eventDay = eventDay ;
        this.eventType = eventType ;
        this.participants_no = participants_no;
        this.participation_type=participation_type;
    }
     
    public void checktype()
    {
        if (this.participation_type == "Teamof3")
            System.out.println("\n" + eventName+ " requires a team of 3 to participate\n"); 
        else 
        {
            if (this.participation_type == "Pair")
            System.out.println("\n" + eventName+ " requires a team of 2 to participate\n");
            else 
                System.out.println("\n" + eventName+ " requires individual participation\n");
        }
    }

    void assign_venue(int k)
    {
        System.out.println("This is assign venue function taking participation number\n");
        if(k>50)
        {
            if(eventType=="Technical")
                eventVenue="Data Science Lab";
            else
                eventVenue="Mini Auditorium";
        }
        else
        {
           if(eventType=="Technical")
                eventVenue="Junior Computer Lab";
            else
                eventVenue="Seminar Hall" ;
        }
        
    }

    void assign_venue(int k, String type)
    {
        System.out.println("This is assign venue function taking participation number and event type\n");
        if(k>50)
        {
            if(type=="Technical")
                eventVenue="Data Science Lab";
            else
                eventVenue="Mini Auditorium";
        }
        else
        {
           if(type=="Technical")
                eventVenue="Junior Computer Lab";
            else
                eventVenue="Seminar Hall" ;
        }
        
    }


    public void display(String even)
    {
        System.out.println("This is display function showing event head based on event name");
        if(even=="Debugging")
        {
            eventHead="Priyal";
            System.out.println("\nEvent Head is "+ eventHead + ". Venue for the event is "+ eventVenue);
        }
        else
        {
            if(even=="Debate")
            {
                eventHead="Srijan";
                System.out.println("\nEvent Head is "+ eventHead + ". Venue for the event is "+ eventVenue);
            }
        }
    }

    public void display(int d)
    {
        System.out.println("This is display function to give details of event on Days");
        if(d==1)
            System.out.println("\nWe have the following events on Day 1: \n 1. Group Discussion \n 2. Coding \n ");
        else
            System.out.println("\nWe have the following events on Day 2: \n 1. Debate \n 2. Debugging \n ");
    
    }

}

class participants{

    String pName;
    long pPhone; 
    char pGender;
    String pCollege;
    String pevent;
    int pDay;
    String pCourse;


    participants(String pName, long pPhone, char pGender, String pCollege, int pDay, String pCourse)
    {
        this.pName = pName; 
        this.pPhone= pPhone; 
        this.pGender = pGender; 
        this.pCollege=pCollege;
        this.pDay=pDay;
        this.pCourse=pCourse;
    }

    public void eventselect()
    {
        if (pDay==1)
        {
            System.out.println("\nSelect one of the following events: \n 1. Group Discussion \n 2. Coding \n ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if (n==1)
                pevent="Group Discussion";
            else
                pevent="Coding";
        }
        else 
        {
              if (pDay==2)
            {
                System.out.println("\n Select one of the following events: \n 1. Debate \n 2. Debugging \n ");
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                if (t==1)
                    pevent="Debate";
                else
                    pevent="Debugging";
            }
            else
                System.out.println("wdcbhebchd");
        }
    }

    void assign_venue()
    {
        if(pevent=="Coding" || pevent=="Debugging") 
            System.out.println("\nYour reporting Venue would be Main Auditorium, Block 1\n");
        else
        {
            if(pevent=="Group Discussion" || pevent=="Debate") 
            System.out.println("\nYour reporting Venue would be Main Ground, behind Central Block\n");
        }
    }

    void booking_details()
    {
        System.out.println("\nYour booking for " + pevent + " at Technika 2023 has been confirmed. \n Following are the details : \n ");
        System.out.println("Day : " + pDay + "\n Name: " + pName + "\n Gender: " + pGender + "\n College: " + pCollege);
    }


}

class Sponsors{

    String sName; 
    boolean is_company; 
    String emailId;
    String poc; 
    String phoneNumber;
    String promotion_type;
    long Amount;

    Sponsors(String sName, boolean is_company, String emailId, String phoneNumber)
    {
        System.out.println("\nThis is Constructor 1");
        this.sName = sName; 
        this.is_company = is_company; 
        this.emailId = emailId; 
        this.phoneNumber = phoneNumber;
    }

     Sponsors(String sName, String phoneNumber)
    {
        System.out.println("\nThis is Constructor 2");
        this.sName = sName; 
        this.phoneNumber = phoneNumber;
        this.is_company=false;
    }

     Sponsors(String sName, boolean is_company, String emailId)
    {
        System.out.println("\nThis is Constructor 3");
        this.sName = sName; 
        this.is_company = is_company; 
        this.emailId = emailId; 
    }

    boolean MobileValidate() 
    {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher match = pattern.matcher(phoneNumber);
        return (match.matches());
    }

    public void promotion_type()
    {
        System.out.println("\nSelect promotion type according to budget: \n 1. Posters (10,000) \n 2. Pamphlets (15,000) \n 3. Stall (40,000)");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        if(p==1)
        {
            promotion_type="Poster";
            Amount=10000;
        }
        else
        {
            if(p==2)
            {
                promotion_type="Pamphlets";
                Amount=15000;
            }

            else
            {
                promotion_type="Stall";
                Amount=40000;
            }
        }
    }

    void assign_poc()
    {
        if(is_company)
            poc="Aarushi";
        else
            poc="Sahil";
    }

    void thankyou()
    {
        System.out.println("\n------------THANK YOU " + sName + " FOR SPONSORING US!--------------\n \n The details are as follows: \n");
        System.out.format("\nAmount: %d\n Promotion Type: %s \n POC: %s \n", Amount, promotion_type,poc);
    }
}


public class evemanagement
{

    public static void main(String args[]){
        Event h1 = new Event("Debugging", 1 , "Technical" , 40, "Pair"); 
        h1.checktype();
        h1.assign_venue(40,"Debugging");
        h1.display(1);

        Event h2 = new Event("Debate", 2 , "Non-Tech" , 20 , "Individual"); 
        h2.checktype();
        h2.assign_venue(20);
        h2.display("Debate");

        participants e1 = new participants("ram", 92736252, 'M', "St. Joseph",1, "Data Science");
        participants e2 = new participants("rima", 98735453, 'F', "Jain",2, "Computer Science");
        e1.eventselect();
        e1.assign_venue();
        e1.booking_details();

        Sponsors s1 = new Sponsors("Ghorai", false, "ghorai.soumyadi33@gmail.com", "873823712");
        s1.MobileValidate();
        s1.promotion_type();
        s1.assign_poc();
        s1.thankyou();

        Sponsors s2 = new Sponsors("Ghorai", false, "ghorai.soumyadi33@gmail.com");
        s2.promotion_type();
        s2.assign_poc();
        s2.thankyou();

        Sponsors s3 = new Sponsors("Ghorai","23946");
        s3.MobileValidate();
        s3.promotion_type();
        s3.assign_poc();
        s3.thankyou();

    }
}