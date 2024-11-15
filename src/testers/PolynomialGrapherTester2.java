public class PolynomialGrapherTester2 extends PolynomialGrapher {
    public double[] coefficients() { return new double[]{1, -3, -4, 12}; }
    
    public Coordinate xyStart() { return new Coordinate(-4, -2); }
    public double xRange() { return 8.0; }
    public double yRange() { return 16.0; }
    public double xIncrement() { return 0.1; }
}