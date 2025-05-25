package co.edu.umanizales.myfiproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor

public class SaleDTO {
    private String seller;
    private String store;
    private List<ProductSale> products;
    private LocalDate dateSale;
}