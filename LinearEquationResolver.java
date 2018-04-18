public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        double number_a = sc.nextInt();
        System.out.println("Enter b:");
        double number_b = sc.nextInt();
        if (number_a != 0) {
            double answer = - number_b / number_a;
            System.out.printf("Equation pass with x = %f!\n :", answer);
        } else {
            if (number_b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
