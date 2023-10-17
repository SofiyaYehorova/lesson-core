package lesson2.demo9_generics;

import lombok.Data;

@Data
public class User<ID> {
    private ID id;
    private String name;
}
