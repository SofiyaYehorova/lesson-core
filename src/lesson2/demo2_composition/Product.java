package lesson2.demo2_composition;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    protected String name;
    protected double price;
    protected ArrayList<Review> reviews = new ArrayList<>();

    public void showInfo(){
        System.out.println("Name: " + name+ ", price: " + price + "$");
    }
    public void addReviews(String text, int rating){
        Review review = new Review();
        review.setText(text);
        review.setRating(rating);
        reviews.add(review);
    }
    public String toString(){
        return "Name: " + name + ", Price:" + price + "$, Reviews: " + reviews;
    }
}
