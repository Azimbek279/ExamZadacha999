package peaksoft.dao;

import peaksoft.model.Car;
import peaksoft.model.Person;

public interface CarDao {
    void createTables();

    void deleteById(Long id);

    void saveCar(Car car);

}
