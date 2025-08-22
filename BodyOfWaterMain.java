public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Michigan", 10, 10, false);
        BodyOfWater b1 = new BodyOfWater ("Pacific Ocean",  5);
        b.printState();
        b1.printState();
        b1.setName("Atlantic Ocean");
        b1.printState();
    }
}
