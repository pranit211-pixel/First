
import java.util.Scanner;
interface Vehicle{
void gearUP();
void speedUP();
void applyBrakes();
void displayStatus();
}
class Bicycle implements Vehicle{
int gear;
int speed;
Bicycle(){
gear=1;
speed = 10;
}
public void gearUP(){
gear++;
System.out.println("Bicycle speed increased to : "+speed+"km/h");
}
public void speedUP(){
speed +=5;
System.out.println("Bicycle speed increased to : "+speed+"km/h");
}
public void applyBrakes(){
speed -=5;
if (speed<0){
speed = 0;
}
System.out.println("Bicycle speed after applying brakes : "+speed+"km/h");
}
public void displayStatus(){
System.out.println("Bicycle gear : "+gear);
System.out.println("Bicycle speed : "+speed+"km/h");
}
}
class Bike implements Vehicle{
int gear;
int speed;
Bike(){
gear=1;
speed = 20;
}
public void gearUP(){
gear++;
System.out.println("Bike speed increased to : "+speed+"km/h");
}
public void speedUP(){
speed +=10;
System.out.println("Bike speed increased to : "+speed+"km/h");
}
public void applyBrakes(){
speed -=10;
if (speed<0){
speed = 0;
}
System.out.println("Bike speed after applying brakes : "+speed+"km/h");
}
public void displayStatus(){


System.out.println("Bike gear : "+gear);
System.out.println("Bike speed : "+speed+"km/h");
}
}
class Car implements Vehicle{
int gear;
int speed;
Car(){
gear=1;
speed = 30;
}
public void gearUP(){
gear++;
System.out.println("Car speed increased to : "+speed+"km/h");
}
public void speedUP(){
speed +=20;
System.out.println("Car speed increased to : "+speed+"km/h");
}
public void applyBrakes(){
speed -=20;
if (speed<0){
speed = 0;
}
System.out.println("Car speed after applying brakes : "+speed+"km/h");
}
public void displayStatus(){
System.out.println("Car gear : "+gear);
System.out.println("Car speed : "+speed+"km/h");
}
}
public class Interface121
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("---------- VEHICLE MENU ----------");
System.out.println("1.Bicycle");
System.out.println("2.Bike");
System.out.println("3.Car");
System.out.print("Enter your choice : ");
int choice = sc.nextInt();
Vehicle vehicle;
switch (choice){
case 1:
vehicle = new Bicycle();
break;
case 2:
vehicle = new Bike();
break;
case 3:
vehicle = new Car();
break;
default:
System.out.println("invalid choice");
sc.close();
return;
}
System.out.println("\n----------VEHICLE OPERATIONS----------");

vehicle.displayStatus();
vehicle.gearUP();
vehicle.speedUP();
vehicle.applyBrakes();
System.out.println("\n----------FINAL STATUS----------");
vehicle.displayStatus();
sc.close();
}
}
