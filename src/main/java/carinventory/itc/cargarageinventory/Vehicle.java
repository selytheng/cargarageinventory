package carinventory.itc.cargarageinventory;

public class Vehicle {
    int vid;
    int model_year;
    String manufacturer;
    String model;
    String color;
    String mileage;
    String registation_number;
    int price;

    public Vehicle(int vid, int model_year, String manufacturer, String model, String color, String mileage,
            String registation_number, int price) {
        this.vid = vid;
        this.model_year = model_year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.registation_number = registation_number;
        this.price = price;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getRegistation_number() {
        return registation_number;
    }

    public void setRegistation_number(String registation_number) {
        this.registation_number = registation_number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
