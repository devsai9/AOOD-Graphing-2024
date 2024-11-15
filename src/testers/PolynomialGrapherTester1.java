package tester;

public class PolynomialGrapherTester1 extends PolynomialGrapher {
    public double[] coefficients() { return new double[]{4.8, -1.2, .2}; }
    
    public Coordinate xyStart() { return new Coordinate(0, 0); }
    public double xRange() { return 6.0; }
    public double yRange() { return 10.0; }
    public double xIncrement() { return 0.2; }
}