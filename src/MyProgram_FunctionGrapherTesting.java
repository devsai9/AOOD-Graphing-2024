import java.util.Scanner;

public class MyProgram_FunctionGrapherTesting {
    public static void main(String[] args) {
        FunctionGrapher[] graphs = new FunctionGrapher[]{new FunctionGrapherTester1(), new FunctionGrapherTester2(), new FunctionGrapherTester3(), new FunctionGrapherTester4()};
        
        int[] params = new int[]{0, 0, 200, 200};
        
        String input = "";
        while (!input.equals("-1")) {
            System.out.println("Choose a test to run\n-1. Exit\n1. Sine Wave\n2. Cosine Wave\n3. Tangent Graph\n4. Graph of x/sin(x)");
            
            Scanner magic = new Scanner(System.in);
            
            input = magic.nextLine();
            
            if (input.equals("-1")) System.exit(0);
            else if (input.equals("1")) graphs[0].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("2")) graphs[1].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("3")) graphs[2].drawGraph(params[0], params[1], params[2], params[3]);
            else if (input.equals("4")) graphs[3].drawGraph(params[0], params[1], params[2], params[3]);
            else System.out.println("Invalid input. Please enter either -1, 1, 2, or 3.");
        }
    }
}