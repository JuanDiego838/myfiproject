package co.edu.umanizales.myfiproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product {
    private String code;
    private String name;
    private double price;
    private TypeProduct type;
}
