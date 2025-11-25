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
        int highestTemperature = 0;
        int totalHumiditySum = 0;
        int highestHumidity = 0;
        int highestWindSpeed = 0;

        for (int i = 1; i <= days; i++) {
            String condition = weather.getCondition();
            int temp = weather.getTemperature();
            int windSpeed = weather.getWindSpeed();
            int humidity = weather.getHumidity();

            int tempFeelsLike = temp;
            int randomNumber = (int)(Math.random() * 11);
            int addOrMinus = (int)(Math.random() * 2);

            if (addOrMinus == 0) {
                tempFeelsLike += randomNumber;
            }

            if (addOrMinus == 1) {
                tempFeelsLike -= randomNumber;
            }

            System.out.println("Day " + i + ": ");
            System.out.println("Weather Condition: " + condition);
            System.out.println("Temperature: " + temp + "°F (Feels Like " + tempFeelsLike + "°F)");
            System.out.println("Wind Speed: " + windSpeed + " mph");
            System.out.println("Humidity: " + humidity + "%");

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

            if (humidity >= 85) {
                System.out.println("!!WARNING!! Very high humidity today. Potential for mold.");
            }

            if (humidity <= 15) {
                System.out.println("!!WARNING!! Very low humidity today. Dry air may cause irritation.");
            }

            System.out.println();

            totalTemperatureSum += temp;
            totalHumiditySum += humidity;

            if (temp > highestTemperature) {
                highestTemperature = temp;
            }

            if (humidity > highestHumidity) {
                highestHumidity = humidity;
            }

            if (windSpeed > highestWindSpeed) {
                highestWindSpeed = windSpeed;
            }
        }

        System.out.println("--- Simulation Summary ---");
        double averageTemp = (double) totalTemperatureSum / days;
        System.out.println("Average Temperature over " + days + " days: " + averageTemp + "°F");
        System.out.println("Highest Temperature Recorded: " + highestTemperature + "°F");

        double averageHumidity = (double) totalHumiditySum / days;
        System.out.println("Average Humidity over " + days + " days: " + averageHumidity + "%");
        System.out.println("Highest Humidity Recorded: " + highestHumidity + "%");

        System.out.println("Highest Wind Speed Recorded: " + highestWindSpeed + " mph");
    }
}




