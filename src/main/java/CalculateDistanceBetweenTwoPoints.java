public class CalculateDistanceBetweenTwoPoints {
    public double calculateDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance between two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
        return distance;
    }

    public static void main(String[] args) {
        CalculateDistanceBetweenTwoPoints obj = new CalculateDistanceBetweenTwoPoints();
        obj.calculateDistanceBetweenTwoPoints(1, 2, 3, 4);
    }
}
