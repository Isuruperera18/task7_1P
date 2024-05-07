package sit707_week7;

public class TemperatureReading {
    private Customer customer;
    private String readingTime;
    private double bodyTemperature;

    // Default constructor
    public TemperatureReading() {}

    // Constructor with body temperature
    public TemperatureReading(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
}
