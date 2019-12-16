package logic;

import java.io.Serializable;

public class Car implements Serializable {
    private String mark;
    private String number;
    private Person owner;

    public Car(String mark, String number) {
        this.mark = mark;
        this.number = number;
    }

    public Car(String mark, String number, Person owner) {
        this.mark = mark;
        this.number = number;
        this.owner = owner;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", number='" + number + '\'' +
                ", owner=" + owner +
                '}';
    }

}
