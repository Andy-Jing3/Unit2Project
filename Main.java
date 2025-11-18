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

        for (int i = 1; i <= days; i++) {
            String condition = weather.getCondition();
            int temp = weather.getTemperature();
            int windSpeed = weather.getWindSpeed();

            if (condition == ) {
                System.out.println();
            }

        }
    }
}




