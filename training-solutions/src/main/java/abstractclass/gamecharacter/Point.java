package abstractclass.gamecharacter;

public final class Point {
    private final long xPos;
    private final long yPos;

    public Point(long xPos, long yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public long getxPos() {
        return xPos;
    }

    public long getyPos() {
        return yPos;
    }

    public long distance(Point point) {
        long xDistance = xPos - point.xPos;
        long yDistance = yPos - point.yPos;
        return (long) Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
