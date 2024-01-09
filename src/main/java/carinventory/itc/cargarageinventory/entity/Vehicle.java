package carinventory.itc.cargarageinventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vid")
    private int vid;

    @Column(name = "model_year")
    private int model_year;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "mileage")
    private String mileage;

    @Column(name = "registation_number")
    private String registation_number;

    @Column(name = "price")
    private String price;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Vehicle(int vid, int model_year, String manufacturer, String model, String color, String mileage,
            String registation_number, String price, Integer stockQuantity) {
        this.vid = vid;
        this.model_year = model_year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.registation_number = registation_number;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Vehicle() {
        this.model_year = 0;
        this.manufacturer = null;
        this.model = null;
        this.color = null;
        this.mileage = null;
        this.registation_number = null;
        this.price = null;
        this.stockQuantity = 0;
    }

}
