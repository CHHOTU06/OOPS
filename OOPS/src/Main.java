import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real part of 1st equation : ");
        int a=sc.nextInt();
        System.out.print("Enter the imaginary part of 1st equation : ");
        int ai=sc.nextInt();
        System.out.print("Enter the real part of 2nd equation : ");
        int b=sc.nextInt();
        System.out.print("Enter the imaginary part of 2nd equation : ");
        int bi=sc.nextInt();
        Complex arithmetic=new Complex();
        arithmetic.sumOfTwo(a,b,ai,bi);
        arithmetic.diffOfTwo(a,b,ai,bi);
        arithmetic.multOfTwo(a,b,ai,bi);
    }
}
 // Print the sum,difference and product of two complex numbers by creating a class
class Complex{
    void sumOfTwo(int a,int b,int ai,int bi){
        int sum=a+b;
        int sumi=ai+bi;
        if(sumi>=0){
            System.out.println("Sum :"+sum+"+"+sumi+"i");
        }
        else{
        System.out.println("Sum :"+sum+sumi+"i");
        }
    }
     void diffOfTwo(int a,int b,int ai,int bi){
         int diff=a-b;
         int diffi=ai-bi;
         if(diffi>=0){
             System.out.println("Difference :"+diff+"+"+diffi+"i");
         }
         else{
             System.out.println("Difference :"+diff+diffi+"i");
         }
     }
     void multOfTwo(int a,int b,int ai,int bi){
         int mult=a*b;
         int sum=(a*bi+b*ai);
         int multi=-(ai*bi);
         System.out.println("Multiplication : "+mult+","+sum+"i ,"+multi);
     }
 }
// Interface
interface Carnivore{
    String eat="meat";
    void walk();
    void cruel();
}
interface Harnivore{
    String eat ="grass";
    void age();
}
class Bear implements Carnivore,Harnivore{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    public void cruel(){
        System.out.println("Bear is a cruel animal");
    }
    public void age(){
        System.out.println("may be short as compare to harnivore");
    }
    void run(){
        System.out.println("Can't run fast");
    }
}
//Function or Method overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//Inheritance (Parent or Base class )
class Animal{
    String size;
    String breathe;
    String skinColor;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// Inheritance (Derived or child Class)
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
class Shark extends Fish{
    void canEat(){
        System.out.println("can eat another smaller fish");
    }
}
class Dog extends Animal{
    int legs;
    void canWalk(){
        System.out.println("Can walks");
    }
}
class Student{
    String Name;
    int roll;
    int[] marks=new int[3];
    Student(){    // Non parameterized constructor

    }
    Student(Student s1) {
        this.Name=s1.Name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    // parameterized constructor
//    Student(String name){
//        this.Name=name;
//    }
//    Student(int roll){
//        this.roll=roll;
//    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}