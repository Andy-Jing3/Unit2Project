public class Weather {
    public String getCondition() {
        double random = Math.random();
        String condition;

        if (random < 0.15) {
            condition = "Sunny";
        } else if (random < 0.30) {
            condition = "Rainy";
        } else if (random < 0.45) {
            condition = "Cloudy";
        } else if (random < 0.60) {
            condition = "Stormy";
        } else if (random < 0.75) {
            condition = "Snowy";
        } else if (random < 0.90) {
            condition = "Foggy";
        } else {
            condition = "Windy";
        }

        return condition;
    }

    public int getTemperature() {
        return (int)(Math.random() * 111) - 10;
    }

    public int getWindSpeed() {
        return (int)(Math.random() * 41);
    }
}

