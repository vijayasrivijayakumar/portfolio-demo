import java.util.Scanner;
 class ITdept 
{
   int totaldays=90;
   
   

   void calculatePresentdays(int presentdays)
   {
    double percentage=(presentdays*100)/totaldays;
    displayResult(percentage);
   }
   void calculatePresentdays(int presentdays,int ondutydays)
   {
    double percentage=((presentdays+ondutydays)*100)/totaldays;
    displayResult(percentage);
   }
    void calculatePresentdays(int presentdays,int ondutydays,int ptdays)
   {
    double percentage=((presentdays+ondutydays+ptdays)*100)/totaldays;
    displayResult(percentage);
   }
   void displayResult(double percentage)
   {
    System.out.println("Attendance:"+percentage);
    if(percentage>=75)
    {
        System.out.println("eligible");
    }
    else{
        System.out.println("not eligible");
    }
   }
   
   
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ITdept i = new ITdept();

        System.out.println("enter present days:");
        int presentdays = sc.nextInt();

        System.out.println("do u have od(0/1:");
        int ondutydayschoice= sc.nextInt();

        if(ondutydayschoice==1)
        {
            System.out.println("enter days of od:");
            int ondutydays =sc.nextInt();

            System.out.println("do u have placements(0/1):");
            int ptdayschoice=sc.nextInt();

            if(ptdayschoice==1)
            {
               System.out.println("enter pt days:");
               int ptdays = sc.nextInt();
               i.calculatePresentdays(presentdays,ondutydays,ptdays);

            }
            else{
                i.calculatePresentdays(presentdays,ondutydays);
            }
        }
        else
        {
         i.calculatePresentdays(presentdays);
        }
            
        }



    }
   
   


