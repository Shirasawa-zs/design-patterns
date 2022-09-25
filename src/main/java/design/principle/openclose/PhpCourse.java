package main.java.design.principle.openclose;

public class PhpCourse implements ICourse{

    Integer id;
    String name;
    Double price;

    public PhpCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
