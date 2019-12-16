package data;

import logic.Car;
import logic.Person;

import java.io.Serializable;
import java.util.List;

public class Memento implements Serializable {
    private List<Car> cars;
    private List<Person> people;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
