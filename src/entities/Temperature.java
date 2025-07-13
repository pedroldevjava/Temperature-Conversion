package entities;

public class Temperature {
    private Double celsius;
    private final Integer k = 32;

    public Temperature() {
    }

    public Temperature(Double celsius) {
        this.celsius = celsius;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Integer getK() {
        return k;
    }

    public double convertTemperature() {
        return (this.celsius - this.k) * 5 / 9;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + celsius +
                ", k=" + k +
                '}';
    }
}
