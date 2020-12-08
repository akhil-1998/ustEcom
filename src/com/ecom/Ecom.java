package com.ecom;

public class Ecom implements Comparable<Ecom> {
        private String title;
        private String brand;
        private int price;
        private double rating;
        private Type type;

        public Ecom(String title, String brand, int price, int rating, Type type){
            this.title = title;
            this.brand = brand;
            this.price = price;
            this.rating = rating;
            this.type = type;
        }

        public String  getBrand() {

            return brand;
        }

        public String getTitle() {

            return title;
        }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    @Override
        public int compareTo(Ecom o) {

            return 0;
        }
        public Type getType(){

            return type;
        }


}
