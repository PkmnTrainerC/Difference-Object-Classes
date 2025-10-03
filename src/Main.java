
/**
 * This program demonstrates the conceptual differences between CLASSES and OBJECTS.
 *
 * - Car (class): a blueprint/type with fields and methods.
 * - carA, carB (objects): two distinct runtime instances with separate state.
 */
public class Main {
    public static void main(String[] args) {
        // Create two OBJECTS from the Car CLASS (each with its own state/identity)
        Car carA = new Car("Honda", "Civic", 2018, 50_000);
        Car carB = new Car("Toyota", "Corolla", 2020, 25_000);

        // A static (class) member is shared across all objects, so it reports '2' here.
        System.out.println("Cars built: " + Car.getBuiltCount());

        // Show each object's independent state
        System.out.println("Car a -> " + carA);
        System.out.println("Car b -> " + carB);

        // Mutate carA only. carB remains unchanged, proving per-object state.
        System.out.println("After driving car a...");
        carA.drive(50);
        System.out.println("Car a miles: " + carA.getMiles());
        System.out.println("Car b miles: " + carB.getMiles());

        // Each object has a unique identity at runtime (different identity hash codes)
        int idA = System.identityHashCode(carA);
        int idB = System.identityHashCode(carB);
        System.out.println("Identity a != b: " + (idA != idB));
    }
}
