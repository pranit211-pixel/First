/* Name : Ajay Shewale
Roll no : 71 */
import java.util.*;
import java.lang.System;
class Publication
{
    protected String title;
    protected int price,copies;
    protected double total;
            
    Scanner sc=new Scanner(System.in);       
    void readData()
    {
        System.out.println("Enter title : ");
        title = sc.next();
                  
        System.out.println("Enter price : ");
        price = sc.nextInt();
                  
        System.out.println("Enter copies : ");
        copies = sc.nextInt();
    }
    void saleCopy(int number)
    {
        if(number<=copies)
        {
            copies-=number;
            double amount=number*price;
            total+=amount;
            System.out.println(number+"copies sold.Amount="+amount);
        }else{
        
        System.out.println("Insufficient stock!");
        }
    }
            
    void saleCopy(int number,double discount)
    {
        if(number<=copies)
        {
            copies-=number;
            double amount=number*price;
                
            amount = amount - (amount*discount/100);
            total += amount;
                
            System.out.println(number+"copies sold with "+discount+"%discount.Amount="+amount);
        }else{
            System.out.println("Insufficient stock!");
        }
    }
        
    double getTotalSale()
    {
        return total;
    }
}
    

class Book extends Publication
{
  private String author;
  
  void readBook()
  {
    readData();
    System.out.println("Enter author : ");
    author = sc.next();
  }
  
  
  void display()
  {
    System.out.println("\n---Book Details---");
    System.out.print("Title : "+title);
    System.out.print("Author : "+author);
    System.out.print("Price : "+price);
    System.out.print("Copies available : "+copies);
  }
}
   
          
class Magazine extends Publication
{
    private String issueDate;
    void readMagazine()
    {
        readData();
        System.out.print("Enter issue date : ");
        issueDate = sc.next();
    }
            
    void receiveNewIssue(String date,int qty)
    {
        issueDate=date;
        copies = qty;

        System.out.print("\n New issue received : "+date+"|Copies ="+qty);
    }
            
    void display()
    {
        System.out.print("\n---Magazine Details---");
        System.out.print("Title : "+title);
        System.out.print("Issue Date : "+issueDate);
        System.out.print("Price : "+price);
        System.out.print("Copies available : "+copies);
    }
}
          
 
        
public class Polymorphism
{
    public static void main(String[] args)
    {
        Book b = new Book();
                    
        Magazine m = new Magazine();
                    
        Scanner sc = new Scanner(System.in);
                                          
        System.out.print("\n Enter Book Details : ");
        b.readBook();

        System.out.print("\n Enter Magazine Details : ");
        m.readMagazine(); 
                                       
        System.out.print("\n Enter Book Sales");
        b.saleCopy(2);
        b.saleCopy(2,5);                                  
        b.display();
        m.display();                                
        m.receiveNewIssue("25/09/2025",10);        
                    
        System.out.print("\n Total Sales = "+(b.getTotalSale()+m.getTotalSale()));
                    
        sc.close();
    }
}
            
            
