package testers;

public class GrapherTester2 extends XYGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(0.5, 4);
    }

    @Override
    public double xRange() { return 7; }

    @Override
    public double yRange() { return 6.5; }

    @Override
    public Coordinate getPoint(int pointNum) {
        switch (pointNum) {
            case 0:
                return new Coordinate(4, 10);
            case 1:
                return new Coordinate(3, 8);
            case 2:
                return new Coordinate(1, 8);
            case 3:
                return new Coordinate(2.5, 6.5);
            case 4:
                return new Coordinate(2, 4.5);
            case 5:
                return new Coordinate(4, 5.5);
            case 6:
                return new Coordinate(6, 4.5);
            case 7:
                return new Coordinate(5.5, 6.5);
            case 8:
                return new Coordinate(7, 8);
            case 9:
                return new Coordinate(5, 8);
            case 10:
                return new Coordinate(4, 10);
            default:
                return null;
        }
    }
}