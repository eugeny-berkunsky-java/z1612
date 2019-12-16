package main;

import data.Memento;
import logic.Car;
import logic.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Memento memento;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("cars.dat")))) {
            memento = (Memento) ois.readObject();
            List<Car> cars = memento.getCars();
//            List<Person> people = memento.getPeople();
            printCars(cars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void run0() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivaniv", 25));
        people.add(new Person("Ivanova", 24));
        people.add(new Person("Petroff", 31));
        people.add(new Person("Kotov", 25));
        people.add(new Person("Kotovsky", 55));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mers", "ab1111cd"));
        cars.add(new Car("BMW", "aa2222cd", people.get(1)));
        cars.add(new Car("Audi", "be1111cd", people.get(2)));

        Memento memento = new Memento();
        memento.setCars(cars);
        memento.setPeople(people);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("cars.dat")))) {
            oos.writeObject(memento);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        printCars(cars);
    }

    private void printCars(List<Car> cars) {
        cars.forEach(System.out::println);
    }
}
