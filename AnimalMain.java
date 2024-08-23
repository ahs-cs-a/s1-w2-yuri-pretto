public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal("cat");
        Animal a1 = new Animal(true, 13.4);

        System.out.println(a.getType());
        System.out.println(a.isMammal());
        a1.setLimbs(10);
        System.out.println(a1.isMammal());
        System.out.println(a1.limbs());
    }
}
