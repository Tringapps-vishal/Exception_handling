// "2. Design a class for a basic point in 2D space. The class should have the following features:
//     - Instance variables for the x and y coordinates of the point.
//     - A constructor that allows the user to create a point with given x and y coordinates.
//     - An equals method that returns true if the given object is a point with the same x and y coordinates, and false otherwise.
//     - A clone method that creates and returns a new point with the same x and y coordinates as the original point.
// "
import java.util.*;
class myexception extends Exception{

}
class point implements Cloneable {
    int x2, y2;
    boolean result;
    point(int x1, int y1) {
        x2 = x1;
        y2 = y1;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    boolean equals(int x1, int y1) {
        if ((x2 == x1) && (y2 == y1)){
        result=true;}
        else{
        result=false;}
        return result;
    } 
}

class eh_space {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" ------1st point-------  \n");
        try{
        System.out.printf("\n Enter X value : ");
        int x1 = sc.nextInt();
        System.out.printf(" Enter Y value : ");
        int y1 = sc.nextInt();
        
        point p = new point(x1, y1);
        point p1 = (point) p.clone();
        System.out.printf("\n --------2nd poind------ \n");
        System.out.printf("\n Enter X value: ");
        int x2 = sc.nextInt();
        System.out.printf(" Enter Y value : ");
        int y2 = sc.nextInt();
        if(x2<=0||y2<=0||x1<=0||y1<=0)
        throw new myexception();
        else{
        boolean ans = p1.equals(x2, y2);
        System.out.printf("" + ans); 
        }
        }catch(myexception e)
        {
            System.out.println("Negative value is not allowed!!");
        }
    }
}