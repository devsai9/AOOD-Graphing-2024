public class PolynomialGrapherTester3 extends PolynomialGrapher {
    public double[] coefficients() { return new double[]{0, 1, 3, 1}; }
    
    public Coordinate xyStart() { return new Coordinate(-5, -5); }
    public double xRange() { return 10.0; }
    public double yRange() { return 10.0; }
    public double xIncrement() { return 0.2; }
}