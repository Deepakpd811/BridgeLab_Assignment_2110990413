package java_programming_element.Level_1;

public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);
        System.out.println(
                "The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
