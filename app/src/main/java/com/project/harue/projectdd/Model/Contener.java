package com.project.harue.projectdd.Model;

public class Contener {

    String imgurl;
    String name_object;
    String price_object;

    public Contener(String imgurl, String name_object, String price_object) {
        this.imgurl = imgurl;
        this.name_object = name_object;
        this.price_object = price_object;
    }

    public Contener() {

    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getName_object() {
        return name_object;
    }

    public void setName_object(String name_object) {
        this.name_object = name_object;
    }

    public String getPrice_object() {
        return price_object;
    }

    public void setPrice_object(String price_object) {
        this.price_object = price_object;
    }
}
