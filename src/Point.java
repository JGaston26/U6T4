public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
        int xS = (other.x -x);
        int yS = (other.y -y);
        double dist = Math.sqrt(Math.pow(xS,xS) + Math.pow(yS,yS));
        return dist;
    }

    // Returns a string in the format: (x, y)
    public String pointInfo() {
        return "(" + x + ", " + y + ")";
    }
}

