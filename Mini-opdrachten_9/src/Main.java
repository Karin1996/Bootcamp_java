public class Main {
    public static void main(String[] args) {
        makeThingFly(new Airplane());
    }

    static void makeThingFly(CanFly flyable) {
        flyable.fly();
    }
}
