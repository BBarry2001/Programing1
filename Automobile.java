public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;

    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (this.make.equals(autoMake) && this.model.equals(autoModel) && this.color.equals(autoColor) && this.year == autoYear) {
            this.make = null;
            this.model = null;
            this.color = null;
            this.year = 0;
            return "Vehicle removed successfully.";
        } else {
            return "Vehicle information mismatch.";
        }
    }

    // Additional methods like getters, setters, etc., can be added here
}
