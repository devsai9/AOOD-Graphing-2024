import java.util.Scanner;

public class MyProgram_ParametricGrapherTesting {
    public static void main(String[] args) {
        XYGrapher[] graphs = new ParametricGrapher[]{new ParametricGrapherTester1(), new ParametricGrapherTester2()};
        
        int[] params = new int[]{0, 0, 200, 200};
        
        String input = "";
        while (!input.equals("-1")) {
            System.out.println("Choose a test to run\n-1. Exit\n1. x = cos(t)\n   y = sin(t)\n   π/2 ≤ t ≤ 3π/2\n2. x = 3cos(t)\n   y = 0.5sin(t)\n   0 ≤ t ≤ 2π");
            
            Scanner magic = new Scanner(System.in);
            
            input = magic.nextLine();
            
            if (input.equals("-1")) System.exit(0);
            else if (input.equals("1")) graphs[0].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("2")) graphs[1].drawGraph(params[0], params[1], params[2], params[3]);
            else System.out.println("Invalid input. Please enter either -1, 1, 2, or 3.");
        }
    }
}