package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository // класс, который является ДАО
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Lada", "Violet", "15"));
        allCars.add(new Car("UAZ", "Lavender", "756"));
        allCars.add(new Car("BMW", "Red", "333"));
        allCars.add(new Car("Lamborghini", "Blue", "34"));
        allCars.add(new Car("Toyota", "Orange", "432"));
        return allCars;
    }
}
