package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    ArrayList<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Toyota", "Vitz", "Black"));
        cars.add(new Car("Honda", "Civic", "Blue"));
        cars.add(new Car("Subaru", "Forester", "Green"));
        cars.add(new Car("Suzuki", "Jimny", "Grey"));
        cars.add(new Car("Mazda", "CX7", "Red"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        ArrayList<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}
