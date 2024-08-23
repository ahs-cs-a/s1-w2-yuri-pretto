public class Restaurant{
    private String name;
    private int numSeats;

    public Restaurant(){
        numSeats = 10;
    }

    public Restaurant(String n, int seats){
        name = n;
        numSeats = seats;
    }

    public void setName(String n){
        name = n;
    }

    public void setNumSeats(int s){
        numSeats = s;
    }

    public String name(){
        return name;
    }

    public int seats(){
        return numSeats;
    }
}