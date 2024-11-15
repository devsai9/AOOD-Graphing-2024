import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        PolynomialGrapher[] graphs = new PolynomialGrapher[]{new PolynomialGrapherTester1(), new PolynomialGrapherTester2(), new PolynomialGrapherTester3()};
        
        int[] params = new int[]{0, 0, 200, 200};
        
        String input = "";
        while (!input.equals("-1")) {
            System.out.println("Choose a test to run\n-1. Exit\n1. 0.2x^2 * -1.2x + 4.8 \n2. 12x^3 -4x^2 - 3x + 1 \n3. x^3 + 3x^2 + x ");
            
            Scanner magic = new Scanner(System.in);
            
            input = magic.nextLine();
            
            if (input.equals("-1")) System.exit(0);
            else if (input.equals("1")) graphs[0].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("2")) graphs[1].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("3")) graphs[2].drawGraph(params[0], params[1], params[2], params[3]);
            else System.out.println("Invalid input. Please enter either -1, 1, 2, or 3.");
        }
        
    }
}