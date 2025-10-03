
/**
 * Car is a CLASS. It is a blueprint/type that describes what Car OBJECTS look like
 * (their fields) and what they can do (their methods).
 */
public class Car {
    // ===== Per-object (instance) state =====
    private String make;
    private String model;
    private int year;
    private int miles;

    // ===== Shared (class-level) state/behavior =====
    // This counter belongs to the CLASS, not to any single object.
    private static int builtCount = 0;

    /**
     * Constructor: runs when an OBJECT is created with `new Car(...)`.
     * It initializes that object's state.
     */
    public Car(String make, String model, int year, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
        builtCount++; // increments the shared class counter
    }

    public void drive(int addedMiles) {
        if (addedMiles < 0) throw new IllegalArgumentException("Miles must be non-negative");
        this.miles += addedMiles; // mutates ONLY THIS object's state
    }

    // Getters (behavior common to all Car objects)
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getMiles() { return miles; }

    // A CLASS method operating on shared data
    public static int getBuiltCount() {
        return builtCount;
    }

    @Override
    public String toString() {
        return String.format("make=%s, model=%s, year=%d, miles=%d", make, model, year, miles);
    }
}
