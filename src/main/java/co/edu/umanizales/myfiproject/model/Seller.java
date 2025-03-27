package co.edu.umanizales.myfiproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String name;
    private String identification;
    private String lastName;
    private char gender;
    private byte age;
    private Location city;
}
