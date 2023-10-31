package hw2.task2.additional;

import lombok.*;

import java.util.ArrayList;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;
    private ArrayList<Comments> comments = new ArrayList<>();


    public Posts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public ArrayList<Comments> getComment(){
        return comments;
    }
}
