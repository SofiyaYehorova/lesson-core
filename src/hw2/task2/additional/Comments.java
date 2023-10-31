package hw2.task2.additional;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
     private int postId;
     private int id;
     private String name;
     private String email;
     private String body;
}
