// Program to Find all Roots of a Quadratic Equation
public class Quadratic {
    public static void main(String[] args){
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if(discriminant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
