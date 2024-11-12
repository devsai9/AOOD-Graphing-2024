public class GrapherTester3 extends XYGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(0.5, 0.5);
    }

    @Override
    public double xRange() { return 7.0; }

    @Override
    public double yRange() { return 6.0; }

    @Override
    public Coordinate getPoint(int pointNum) {
        switch (pointNum) {
            case 0:
                return new Coordinate(1, 1);
            case 1:
                return new Coordinate(4, 6);
            case 2:
                return new Coordinate(7, 1);
            case 3:
                return new Coordinate(1, 1, false, true);
            case 4:
                return new Coordinate(2.5, 2, true, false);
            case 5:
                return new Coordinate(4, 4.5);
            case 6:
                return new Coordinate(5.5, 2);
            case 7:
                return new Coordinate(2.5, 2);
            default:
                return null;
        }
    }
}