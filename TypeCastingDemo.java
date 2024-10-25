public class TypeCastingDemo {

    public static void main(String[] args) {
        // 1. Widening Casting (automatic) - Smaller type to larger type
        int num1 = 10;
        long longNum = num1; // Widening (int to long) - no explicit cast needed
        float floatNum = longNum; // Widening (long to float) - no explicit cast needed
        double doubleNum = floatNum; // Widening (float to double) - no explicit cast needed

        System.out.println("Original int: " + num1);
        System.out.println("Widened to long: " + longNum);
        System.out.println("Widened to float: " + floatNum);
        System.out.println("Widened to double: " + doubleNum);

        // 2. Narrowing Casting (manual) - Larger type to smaller type (potential data loss)
        double salary = 12345.67;
        float bonus = (float) salary; // Narrowing (double to float) - explicit cast required

        System.out.println("\nOriginal double: " + salary);
        System.out.println("Narrowed to float: " + bonus); // May lose precision

        // 3. Integer casting (narrowing) - Potential truncation
        long population = 1234567890L;
        int populationInCity = (int) population; // Narrowing (long to int) - explicit cast required

        System.out.println("\nOriginal long: " + population);
        System.out.println("Narrowed to int: " + populationInCity); // May lose higher-order digits
    }
}

