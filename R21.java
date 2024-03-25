package quizzes.q2.ana_kurua_2.saw.sub;
import quizzes.q2.ana_kurua_2.backpack.A22;
import quizzes.q2.ana_kurua_2.saw.A21;
public class R21 {
    public static void main(String[] args) {
        // Create an instance of A21 with rectangle dimensions
        A21 rectangle = new A21(5.0, 10.0);

        // Calculate and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        // Create an instance of A22 with the month number
        int monthNumber = 3; // Example month number
        A22 month = new A22(monthNumber);

        // Print the name of the month
        System.out.println("Month name: " + month.getMonthName());
    }
}
