public class BodyOfWater {
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater (String n, double l, double a, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = a;
        isSaltWater = s;
    }

    public BodyOfWater (String n, double a){
        name = n;
        avgDepth = a;
    }

    public void setName(String n){
        name = n;
    }

    public void setLargestDiameter(double l){
        largestDiameter = l;
    }

    public void printState(){
        System.out.println("Name: "+ name);
        System.out.println("Largest Diameter: " + largestDiameter + " miles");
        System.out.println("Average Depth: " + avgDepth + " feet");
        System.out.println("Salt Water? " + isSaltWater);
    }
}
