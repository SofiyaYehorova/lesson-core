package hw2.task2.additional;


import java.util.ArrayList;

//        Запакувати всі пости в список,всі коментарі в свій окремий список
//        Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
//
//        В постах додатково потрібно додати поле яке характеризує список комментарів.
public class Main {
    public static void main(String[] args) {
        ArrayList<Posts> posts = new ArrayList<>();
        posts.add(new Posts(1, 1, "sunt aut facere repellat provident", "et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut"));
        posts.add(new Posts(2, 2, "hcsjfcsnksv", "vcahcvjavcja"));
        posts.add(new Posts(3, 3, "gjvcfcsjcnkd", "gfqhgdhqwhce"));
        posts.add(new Posts(4, 4, "fhgvevchc", "gcfhefcyfcyewd"));

        ArrayList<Comments> comments = new ArrayList<>();
        comments.add(new Comments(1, 1, "comment1", "adnib@gmail.com", "shfgsjhfgjs"));
        comments.add(new Comments(1, 2, "comment2", "degb@gmailcom", "chjvjhvvd"));
        comments.add(new Comments(2, 1, "comment3", "aghcaygdcqy@d", "hgfyuwegfyuwe"));
        comments.add(new Comments(2, 2, "comment4", "hjwgfungfe", "ybyfweyfeywt"));
        comments.add(new Comments(3, 1, "comment5", "hjwgfungfe", "ybyfweyfeywt"));
        comments.add(new Comments(3, 2, "comment6", "hjwgfungfe", "ybyfweyfeywt"));
        comments.add(new Comments(4, 1, "comment7", "hjwgfungfe", "ybyfweyfeywt"));
        comments.add(new Comments(2, 2, "comment8", "hjwgfungfe", "ybyfweyfeywt"));

        for (Posts post : posts) {
            for (Comments comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.getComments().add(comment);
                    System.out.println(post);
                }
            }
        }
    }
}
