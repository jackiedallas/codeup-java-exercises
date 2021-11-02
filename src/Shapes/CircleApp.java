package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        boolean confirm;
        do {
            Input input = new Input();
            System.out.print("Enter a radius for your circle: ");
            double userCircleRadius = input.getDouble();
            Circle userCircle = new Circle(userCircleRadius);
            System.out.println("The circumference of your circle is: " + userCircle.getCircumference() + "\n" +
                    "The area of your circle is: " + userCircle.getArea());

            System.out.print("Do you want to make another circle? [Y/N] ");
            confirm = input.yesNo();

        } while (confirm);
    }
}
