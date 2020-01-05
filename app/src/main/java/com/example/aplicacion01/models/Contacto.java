package com.example.aplicacion01.models;

import java.util.ArrayList;

public class Contacto {
    public String phone;
    public String nickname;
    public String image;

    public  String getSmallImage(){
        return  this.image;
    }

    public Contacto(String _phone, String _nickname, String _image) {
        this.phone = _phone;
        this.nickname = _nickname;
        this.image = _image;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("981992353", "Ave","https://mymodernmet.com/wp/wp-content/uploads/2019/10/audubon-birds-of-america-Louisiana-Heron.png"));
        collection.add(new Contacto("985936923", "IguanaGrafity","https://mymodernmet.com/wp/wp-content/uploads/2019/12/ROA-2012-Puerto-Rico-Courtesy-the-artist-1024x683.jpg"));
        collection.add(new Contacto("981004293", "CocodriloGrfity","https://mymodernmet.com/wp/wp-content/uploads/2019/12/ROA-2011-Atlanta-Courtesy-the-artist-1024x768.jpg"));
        collection.add(new Contacto("994014213", "SerpienteGrfity","https://mymodernmet.com/wp/wp-content/uploads/2019/12/ROA-2014-Perth-Courtesy-the-artist-1024x683.jpg"));
        return collection;
    }
}