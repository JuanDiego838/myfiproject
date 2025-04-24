package co.edu.umanizales.myfiproject.service;

import co.edu.umanizales.myfiproject.model.Location;
import co.edu.umanizales.myfiproject.model.Store;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class StoreService {

    private List<Store> stores = new ArrayList<>();

    @Value("${stores_file}")
    private String storesFilename;

    @Autowired
    private LocationService locationService;

    @PostConstruct
    public void loadStoresFromCSV() throws IOException, URISyntaxException {
        Path pathFile = Paths.get(ClassLoader.getSystemResource(storesFilename).toURI());

        try (CSVReader csvReader = new CSVReader(new FileReader(pathFile.toString()))) {
            String[] line;
            csvReader.skip(1); // Saltar encabezado
            while ((line = csvReader.readNext()) != null) {
                String name = line[0];
                String code = line[1];
                String address = line[2];
                String cityCode = line[3];

                Location city = locationService.getLocationsCode(cityCode);
                if (city != null) {
                    stores.add(new Store(name, code, address, city));
                }
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException("Error al leer el archivo de tiendas", e);
        }
    }

    public List<Store> getAllStores() {
        return stores;
    }

    public Store getStoreCode(String code) {
        return stores.stream().filter(store -> store.getCode().equals(code)).findFirst().orElse(null);
    }


}
