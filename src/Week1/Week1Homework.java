package Week1;

import java.util.Scanner;

public class Week1Homework {
    public static void main(String[] args) {
        System.out.println("Please enter base salary: ");
        Scanner scanner = new Scanner (System.in);
        double baseSalary = scanner.nextInt();
        System.out.println("Please enter the weekday time: ");
        double weekdayTime = scanner.nextInt();
        System.out.println("Please enter the weekend time: ");
        double weekendTime = scanner.nextInt();
        scanner.close();
        double totalTime=weekendTime+weekdayTime;
        double unitCharge=baseSalary/40;
        double x=unitCharge*1.5*(weekdayTime-40);
        double y=unitCharge*2*weekendTime;
        double z=unitCharge*2*(totalTime-40);
        double totalSalary=0;
        if(baseSalary<1000)
        {
            System.out.println("You entered the base salary less than 1000 euros");
        }
        else if(weekdayTime<0 || weekendTime<0 )
        {
            System.out.println("The total weekly working hours cannot be less than at least zero hours.");
        }
        else if(40>totalTime && totalTime>=0)
        {
            System.out.println("Your salary is "+(baseSalary*totalTime)/40+" euros.1");
        }
        else if((weekdayTime<40 || weekendTime<40) && totalTime==40)
        {
            System.out.println("Your salary is "+baseSalary+" euros.2");
        }
        else if(weekdayTime>=120 || weekendTime>=48 )
        {
            System.out.println("Please enter consistent working hours.");
        }
        else if((weekdayTime==40 && weekendTime==0)||(weekdayTime==0 && weekendTime==40) )
        {
            System.out.println("Your salary is "+baseSalary+" euros.3");
        }
        else if(totalTime>40)
        {
           if(weekdayTime>40 && weekendTime>10) // 1 2 3
           {
               totalSalary=x+y+baseSalary+500;
               System.out.println("Your salary is "+totalSalary+" euros.4");
           }
           else if(weekdayTime>40 && 10>=weekendTime) // 1 2
           {
               totalSalary=x+y+baseSalary;
               System.out.println("Your salary is "+totalSalary+" euros.5");
           }
           else if(weekdayTime>40 && weekendTime==0) // 1
           {
               totalSalary=x+baseSalary;
               System.out.println("Your salary is "+totalSalary+" euros.6");
           }
           else if(weekdayTime<40 && weekendTime>10) //2
           {
               totalSalary=z+baseSalary;
               System.out.println("Your salary is "+totalSalary+" euros.7");
           }
           else if(weekdayTime==40 && weekendTime>10) //  2 3
           {
               totalSalary=z+baseSalary+500;
               System.out.println("Your salary is "+totalSalary+" euros.8");
           }
        }
    }
}
