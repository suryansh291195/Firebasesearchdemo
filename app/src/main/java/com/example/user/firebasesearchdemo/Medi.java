package com.example.user.firebasesearchdemo;

/**
 * Created by user on 3/9/2018.
 */

public class Medi {

    private String Name, Content, Brand, Image;
    private Double Price;

    public Medi()
    {}


    public String getName() {
        return Name;
    }

    public Double getPrice() {
        return Price;
    }

    public String getContent() {
        return Content;
    }

    public String getImage() {
        return Image;
    }

    public String getBrand() {
        return Brand;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

   public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public Medi(String Name, Double Price, String Content, String Brand) {
        this.Name = Name;
        this.Price = Price;
        this.Content = Content;
        this.Brand = Brand;
        this.Image = Image;
    }
}
