package co.edu.umanizales.myfiproject.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Store {
    private String name_store;
    private String code;
    private String address;
    Location city;


}
