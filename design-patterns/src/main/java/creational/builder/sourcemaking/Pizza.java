package creational.builder.sourcemaking;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";
}
