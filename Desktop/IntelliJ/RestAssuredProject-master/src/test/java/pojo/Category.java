package pojo;

import lombok.*;

@Getter // This annotation will add getters for all fields
@Setter // This annotation will add setters for all fields
@NoArgsConstructor // will add no argument constructor
@ToString // will add toString method for the class
public class Category {

    private String id;
    private String name;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
