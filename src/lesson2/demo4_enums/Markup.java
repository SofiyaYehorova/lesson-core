package lesson2.demo4_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Markup {
    CELL("клітинка"),
    LINE("лінійка"),
    NONE("буз розмітки");

    private String name;

    public String getName() {
        return name;
    }
}
