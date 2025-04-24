package co.edu.umanizales.myfiproject.service;

import co.edu.umanizales.myfiproject.model.Location;
import com.sun.source.tree.WhileLoopTree;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;
import java.nio.file.Path;
import java.nio.file.Paths;
import jakarta.annotation.PostConstruct;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
@Getter


public class LocationService {

    private List<Location> locations;

    @Value("${locations_filename}")
    private String locationsFilename;

    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException, URISyntaxException {
        locations = new ArrayList<>();
        locations.add(new Location("05", "ANTIOQUIA"));
        locations.add(new Location("17", "CALDAS"));
        locations.add(new Location("66", "RISARALDA"));
        locations.add(new Location("91", "AMAZONAS"));
        locations.add(new Location("08", "ATLANTICO"));
        locations.add(new Location("11", "BOGOTA"));
        locations.add(new Location("13", "BOLIVAR"));
        locations.add(new Location("15", "BOYACA"));
        locations.add(new Location("18", "CAQUETA"));
        locations.add(new Location("19", "CAUCA"));
        locations.add(new Location("85", "CASANARE"));
        locations.add(new Location("20", "CESAR"));
        locations.add(new Location("70", "SUCRE"));
        locations.add(new Location("73", "TOLIMA"));
        locations.add(new Location("76", "VALLE"));
        locations.add(new Location("99", "VICHADA"));
        locations.add(new Location("97", "VAUPES"));
        locations.add(new Location("81", "ARAUCA"));
        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());


        try (CSVReader csvReader = new CSVReader(new FileReader(pathFile.toString()))) {
            String[] line;
            csvReader.skip(1);

            while ((line = csvReader.readNext()) != null) {
                locations.add(new Location(line[2], line[3]));

            }

        } catch (IOException e) {
            e.printStackTrace();
            throw e;

        } catch (CsvValidationException e) {
            throw new RuntimeException(e) ;
        }

    }

    public Location getLocationByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code)) {
                return location;
            }
        }
        return null;
    }


}


