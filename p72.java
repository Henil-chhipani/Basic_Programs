public class p72 {
    public static double convertMetersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double convertKilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double convertMetersToInches(double meters) {
        return meters / 0.0254;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Additional conversion methods can be added as needed

    public static void main(String[] args) {
        double distanceInMeters = 5000;

        double distanceInKilometers = convertMetersToKilometers(distanceInMeters);
        double distanceInInches = convertMetersToInches(distanceInMeters);

        System.out.println("Distance in Meters: " + distanceInMeters);
        System.out.println("Distance in Kilometers: " + distanceInKilometers);
        System.out.println("Distance in Inches: " + distanceInInches);
    }
}
