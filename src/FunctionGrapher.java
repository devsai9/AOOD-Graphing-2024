public abstract class FunctionGrapher extends XYGrapher {
    // public abstract Coordinate xyStart();
    // public abstract double xRange();
    // public abstract double yRange();
    // public abstract Coordinate getPoint(int pointNum);
    
    public abstract double xIncrement();
    
    public double xValue(int pointNum) { 
        if (pointNum == 0) return xyStart().getX();
        return ((double) pointNum) * xIncrement(); 
    }
    
    public abstract double yValue(double xValue);
    
    public Coordinate getPoint(int pointNum) {
        double x = xValue(pointNum);
        if (x > xyStart().getX() + xRange()) return null;
        
        return new Coordinate(x, yValue(x));
    }
}