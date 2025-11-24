import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Weather weather = new Weather();

        System.out.print("How many days of weather would you like to simulate: ");
        int days = scan.nextInt();

        if (days <= 0) {
            System.out.println("Number of days must be positive.");
            return;
        }

        System.out.println("Weather Forecast:");

        int totalTemperatureSum = 0;
        int highestWindSpeed = 0;
        int highestTemperature = 0;


        for (int i = 1; i <= days; i++) {
            String condition = weather.getCondition();
            int temp = weather.getTemperature();
            int windSpeed = weather.getWindSpeed();

            System.out.println("Day " + i + ": ");
            System.out.println("Weather Condition: " + condition);
            System.out.println("Temperature: " + temp + "°F");
            System.out.println("Wind Speed: " + windSpeed + " mph");

            if (condition.equals("Stormy")) {
                System.out.println("!!WARNING!! Dangerous storms today stay inside!");
            }

            if (condition.equals("Sunny")) {
                System.out.println("!!WARNING!! Very bright today make sure to apply sunscreen");
            }

            if (condition.equals("Foggy")) {
                System.out.println("!!WARNING!! Low visibility today!");
            }

            if (condition.equals("Rainy")) {
                System.out.println("!!WARNING!! Raining today bring an umbrella!");
            }

            if (temp <= 35) {
                System.out.println("!!WARNING!! Freezing temperatures today wear a coat! ");
            }

            else if (temp >= 85) {
                System.out.println("!!WARNING!! Hot temperatures today stay hydrated!");
            }

            if (windSpeed >= 25) {
                System.out.println("!!WARNING!! Strong winds today.");
            }

            System.out.println();

            totalTemperatureSum += temp;

            if (windSpeed > highestWindSpeed) {
                highestWindSpeed = windSpeed;
            }

            if (temp > highestTemperature) {
                highestTemperature = temp;
            }
        }

        System.out.println("--- Simulation Summary ---");
        double averageTemp = (double) totalTemperatureSum / days;
        System.out.println("Average Temperature over " + days + " days: " + averageTemp + "°F");
        System.out.println("Highest Wind Speed Recorded: " + highestWindSpeed + " mph");
        System.out.println("Highest Temperature Recorded: " + highestTemperature + "°F");
    }
}




