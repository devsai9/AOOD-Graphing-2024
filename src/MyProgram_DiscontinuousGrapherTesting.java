import java.util.Scanner;

public class MyProgram_DiscontinuousGrapherTesting {
    public static void main(String[] args) {
        XYGrapher[] graphs = new DiscontinuousFunctionGrapher[]{new DiscontinuousTester1(), new DiscontinuousTester2()};
        
        int[] params = new int[]{0, 0, 200, 200};
        
        String input = "";
        while (!input.equals("-1")) {
            System.out.println("Choose a test to run\n-1. Exit\n1. (x^2 - 1)(x - 1)\n2. 1/x");
            
            Scanner magic = new Scanner(System.in);
            
            input = magic.nextLine();
            
            if (input.equals("-1")) System.exit(0);
            else if (input.equals("1")) graphs[0].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("2")) graphs[1].drawGraph(params[0], params[1], params[2], params[3]);
            else System.out.println("Invalid input. Please enter either -1, 1, 2, or 3.");
        }
    }
}