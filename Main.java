/*In java, functions are called methods and they are declared within a class. Methods in java are used to perform certain actions.
 * In java, classes are objects that have attributes and methods. For example, a car class has attributes such as its color and it has methods such as driving forward.
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        //input scanner
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        
        //creates a circle object 
        Circle circle1 = new Circle(); 
        
        //creates a rectangle object
        Rectangle rect1 = new Rectangle();

        //creates a rectangle object
        Triangle tri1 = new Triangle(); 

        //creates a rectangle object
        Trapezoid trap1 = new Trapezoid(); 
        
        //keeps asking if you want to calculate area until you say no
        do {
            System.out.println("Would you like calculate the area for a circle, rectangle, triangle or trapezoid? (circle/rectangle/triangle/trapezoid/no)"); 
            String shape = input.nextLine().toLowerCase();
            //if you input that you want to see the area of a rectangle it asks you for the length and width
            if(shape.equals("rectangle")){
                System.out.println("What is the length of the rectangle? ");
                //input length
                rect1.length = input.nextDouble();
                input.nextLine();

                System.out.println("What is the width of the rectangle? ");
                //input width
                rect1.width = input.nextDouble();
                input.nextLine();
                
                //uses the method from the Rectangle class to get the area based on the user input
                rect1.getArea();
            }
            //if you input that you want to see the area of a circle it asks you for the radius
            else if(shape.equals("circle")){
                System.out.println("What is the radius of the circle?");
                //input radius
                circle1.radius = input.nextDouble();
                input.nextLine();
                //uses method from Circle class to get the area based on user input
                circle1.getArea();
            }
            //if you input that you want to see the area of a triangle it asks you for the base and height
            else if(shape.equals("triangle")){
                System.out.println("What is the base of the triangle? ");
                //input the base
                tri1.base = input.nextDouble();
                input.nextLine();

                System.out.println("What is the height of the triangle? ");
                //input the height
                tri1.height = input.nextDouble();
                input.nextLine();
                
                //uses the method from the Triangle class to get the area based on the user input
                tri1.getArea();
            }
            //if you input that you want to see the area of a trapezoid it asks you for the base of the top and bottom and the height
            else if(shape.equals("trapezoid")){
                System.out.println("What is the length of the top of the trapezoid? ");
                //input the first base
                trap1.base1 = input.nextDouble();
                input.nextLine();

                System.out.println("What is the length of the bottom of the trapezoid? ");
                //input the second base
                trap1.base2 = input.nextDouble();
                input.nextLine();

                //input the height 
                System.out.println("What is the height of the trapezoid? ");
                trap1.height = input.nextDouble();
                input.nextLine();
                
                //uses the method from the Trapezoid class to get the area based on the user input
                trap1.getArea();
            }
            //if you say you don't want to see the area of either the loop ends
            else{
                repeat = false;
            }


        } while (repeat);

        input.close(); //closes scanner
        System.out.println("End of program");
    }    
}

