
import java.util.*;
class Employee
{
int empid;
long mobile;
String name,address,emailid;
double salary,bp,da,hra,pf,club,net,gross,basic;
Scanner get = new Scanner(System.in);
void getdata()
{
System.out.println("Enter Name of the Employee");
name = get.nextLine();
System.out.println("Enter emailid");
emailid = get.nextLine();
System.out.println("Enter Address of the Employee:");
address = get.nextLine();
System.out.println("Enter Employee id");
empid = get.nextInt();
System.out.println("Enter Mobile number");
mobile = get.nextLong();
}
void display()
{
System.out.println("Employee Name:"+name);
System.out.println("Employee id:"+empid);
System.out.println("Mail id:"+emailid);
System.out.println("Mobile Number:"+mobile);
}
void salary()
{
da=(0.97*basic);
hra=(0.10*basic);
pf=(0.12*basic);
club=(0.1*basic);
gross=(basic+da+hra);
net=(gross-pf-club);

System.out.println("GROSS PAY: Rs."+gross);
System.out.println("NET PAY: Rs."+net);
}
}
class Programmer extends Employee
{
Programmer (int sal){
basic=sal;
}
}
class TeamLead extends Employee{
TeamLead(int sal){
basic=sal;
}
}
class AsstprojManager extends Employee{
AsstprojManager (int sal){
basic=sal;
}
}
class ProjManager extends Employee{
ProjManager(int sal){
basic=sal;
}
}
class Newsalary
{
public static void main(String args[])
{
int choice,cont;
do{
    System.out.println("PAYROLL");
    System.out.println("1.PROGRAMMER \n2.Team Leader \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER");

   Scanner c = new Scanner(System.in);
   System.out.print("Enter your choice:");
   choice=c.nextInt();
 switch(choice){
 case 1:
      Programmer p=new Programmer(30000);
      p.getdata();
      p.display();
      p.salary();
      break;
case 2:
     TeamLead T=new TeamLead(40000);
     T.getdata();
     T.display();
     T.salary();
     break; 
case 3:
     AsstprojManager A = new AsstprojManager(50000);
     A.getdata();
     A.display();
     A.salary();
     break;
case 4:
     ProjManager M=new ProjManager(70000);
     M.getdata();
     M.display();
     M.salary();
     break;
}
     System.out.print("Please enter 0 to quit and 1 to continue:");
     cont = c.nextInt();
     }while(cont==1);
  }
}

