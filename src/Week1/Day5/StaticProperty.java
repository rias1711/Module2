package Week1.Day5;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Mazda 3", "Skyactiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty car2 = new StaticProperty("Mazda 6", "Skyactiv 6");
        System.out.println(StaticProperty.numberOfCars);
    }
}
