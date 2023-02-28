/*"2. Design a class for a basic shape. The class should have the following features:
         - An instance variable for the shape's type (e.g. triangle, rectangle, circle).
         - An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
         - A constructor that allows the user to create a shape with a given type and dimensions.
         - A method that calculates and returns the perimeter of the shape.
         - A method that calculates and returns the area of the shape."*/

import java.util.*;
class myexception extends Exception
{

}
class calculation
{
  double base,side,length,width,radius;
  float height;
  //constructors
  calculation(double base,float height,double side)
  {
    this.base=base;
    this.height=height;
    this.side=side;
    System.out.println("Triangle created successfully.");
  }
  calculation(double length,double width)
  {
    this.length=length;
    this.width=width;
    System.out.println("Rectangle created successfully.");
  }
  calculation(double radius)
  {
    this.radius=radius;
    System.out.println("Circle created successfully.");
  }
  //methods for perimeter
  double perimeter(double base,double height, double side)
    {
     return (this.base +this.height+this.side);
    }
  double perimeter(double length, double width)
    {
      return (2*(this.length+this.width));
    }
  double perimeter(double radius) 
    {
      return (2*3.14115*this.radius);
    }
  //methods for area
  double triangle(double base,Float height)
    {
      return (0.5 *this.base *this.height);
    }
  double area(double length, double width)
    {
      return (this.length*this.width);
    }
  double area(double radius) 
    {
      return (3.14115* this. radius * this.radius);
    }
}
//main class
class shape
{
  public static void main(String args[])
  {
    int ch=0;
    double base,side,length,width,radius;
    float height;
    Scanner sc=new Scanner(System.in);
    while(ch!=4)
  {
    System.out.println("SHAPES");
    System.out.println("Select one shape");
    System.out.println("1.Triangle        2.Rectangle          3.Circle           4.Exit");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1:
      {
        try{
      System.out.println("VALUES FOR TRIANGLE");
      System.out.println("Enter the base value:");
      base=sc.nextInt();
      System.out.println("Enter the height value:");
      height=sc.nextInt();
      System.out.println("Enter the side value:");
      side=sc.nextInt();
      if(base<0||height<0||side<0)
      throw new  myexception();
      else
      {
      calculation t=new calculation(base, height, side);
      System.out.println("Perimeter of Triangle :"+t.perimeter(base,height,side));
      System.out.println("Area of Triangle :"+t.triangle(base,height));
      }
        }
        catch(myexception e)
        {
          System.out.println("Negative value is not allowed!!");
        }
      }
      break;
      case 2:
      {
        try{
      System.out.println("VALUES FOR RECTANGLE");
      System.out.println("Enter the length value:");
      length=sc.nextInt();
      System.out.println("Enter the width value:");
      width=sc.nextInt();
      if(length<0||width<0)
      throw new  myexception();
      else{
      calculation t=new calculation(length,width);
      System.out.println("Perimeter of Rectangle :"+t.perimeter(length,width));
      System.out.println("Area of Rectangle :"+t.area(length,width));
      }
        }
        catch(myexception e)
        {
          System.out.println("Negative value is not allowed!!");
        }
      }
      break;
      case 3:
      {
        try{
      System.out.println("VALUES FOR CIRCLE");
      System.out.println("Enter the radius value:");
      radius=sc.nextInt();
      if(radius<0)
      throw new  myexception();
      else{
      calculation t=new calculation(radius);
      System.out.println("Perimeter of Circle :"+t.perimeter(radius));
      System.out.println("Area of Circle :"+t.area(radius));
      }
        }
        catch(myexception e)
        {
          System.out.println("Negative value is not allowed!!");
        } 
      }
      break;
      case 4:
      {
        System.exit(0);
      }
      default:
      {
        System.out.println("INVALID CHOICE!!!");
      }
    }
  }
  }
}