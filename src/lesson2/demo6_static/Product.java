package lesson2.demo6_static;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    public static int count;
    protected String name;
    protected double price;
    protected ArrayList<Review> reviews = new ArrayList<>();

    public Product(){
        count++;
    }
    public void showInfo() {
        System.out.println("Name: " + name + ", price: " + price + "$");
    }

    public void addReviews(String text, int rating) {
        Review review = new Review();
        review.setText(text);
        review.setRating(rating);
        reviews.add(review);
    }

    public String toString() {
        return "Name: " + name + ", Price:" + price + "$, Reviews: " + reviews;
    }
}
