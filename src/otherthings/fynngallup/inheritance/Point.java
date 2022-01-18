package otherthings.fynngallup.inheritance;

public class Point {
    private int x;
    private int y;


    public Point() {

    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int squareX = this.x * this.x, squareY = this.y * this.y;
        double distance = Math.sqrt(squareX + squareY);

        return distance;
    }

    public double distance(int x, int y) {
        int disX = (this.x - x), disY = (this.y - y);
        int sqaureX = (disX * disX), squareY = (disY * disY);
        double distance =  Math.sqrt(sqaureX + squareY);

        return distance;
    }

    public double distance(Point point) {
        int x = point.getX();
        int y = point.getY();
        double distance = distance(x, y);

        return distance;
    }
    



}