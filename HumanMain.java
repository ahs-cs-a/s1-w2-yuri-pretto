public class HumanMain {
    public static void main(String[] args) {
        Human h = new Human("Sean", "Green");
        //I could so this to see the state of both fields
        h.printState();
    
        //OR just look at name
        String hName = h.name();
        System.out.println(hName);
    }
}
