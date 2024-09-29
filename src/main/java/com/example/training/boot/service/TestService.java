package com.example.training.boot.service;

import com.example.training.boot.repository.JdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestService {

    private PropertyService propertyService;

    private final CarService carService;

    private final JdbcRepository jdbcRepository;

    /*
     * @Autowired requires the dependency to be there.
     * So if we use injection like in this example, we define that the PropertyService
     * must be in the ApplicationContext.
     * If it's not then we're going to throw an Exception. So The context won't start and at runtime,
     * it throws an Exception.
     * !!! To avoid that you can use the required attribute!!!.
     * */
    @Autowired(required = false)
    public TestService(PropertyService propertyService, @Qualifier("bmw") CarService carService, JdbcRepository jdbcRepository) {
        this.propertyService = propertyService;
        this.carService = carService;
        this.jdbcRepository = jdbcRepository;

        carService.printName();

//        jdbcRepository.getUsername(4);   //Return username
//        jdbcRepository.insertUser(123, "gogo@abv", "Georgi");
        jdbcRepository.getserAsMap(2);
    }

    @Autowired
    public void setPropertyService(Optional<PropertyService> propertyService, @Qualifier("audi") CarService carService) {
        this.propertyService = propertyService.orElseGet(null);
        /* Another way to inject optional dependencies Optional<T>
        introduced to reduce null pointer errors */

        carService.printName();
    }
}
