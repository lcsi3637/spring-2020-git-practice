package pojo;

import lombok.*;

//TODO Country POJO class that have same encapsulated field as Countries table
@Getter @Setter
@NoArgsConstructor
@ToString
public class Countries {

    private String country_id;
    private String country_name;
    private int region_id;

    public Countries(String country_id, String country_name, int region_id) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.region_id = region_id;
    }
}
