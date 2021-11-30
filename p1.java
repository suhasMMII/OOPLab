package ooplab8;
import java.util.Scanner;
abstract class Diagram
{
        public int d1,d2;
        abstract public void areaCalculation();

public void readData()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the two dimensions:");
d1=s.nextInt();
d2=s.nextInt();
}
public void displaydata()
{
    System.out.println("D1="+d1+" D2="+d2);
}
public int getD1()
{
    return d1;
}
public int getD2()
{
    return d2;
}
}
class Square extends Diagram
{
    private int area;
    @Override
    public void areaCalculation()
    {
        int x=super.getD1();
        area=x*x;
    }
    @Override
    public void displaydata()
    {
        super.displaydata();
        System.out.println("Area:"+area);
    }
}
class Triangle extends Diagram
{
    private int area;
    @Override
    public void areaCalculation()
    {
        int x=super.getD1();
        int y=super.getD2();
        area = (1/2)*x*y;
    }
    @Override
    public void displaydata()
    {
        super.displaydata();
        System.out.println("Area:"+area);
    }
 }
public class p1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Diagram D = null;
        int ch;
        do
        {
            System.out.print("Enter your choice:");
            System.out.println("1.Square(only first dimension counts)");
            System.out.println("2.Triangle");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    D= new Square();
                    break;
                case 2:
                    D=new Triangle();
                    break;
                default:
                   System.out.println("Enter correct Choice");
                   break;
            }
            D.readData();
            D.areaCalculation();
            D.displaydata();
            System.out.print("Do you want to continue(yes-1)(no-0):");
            ch=s.nextInt();
        }while(ch==1);
        
    }
}
         