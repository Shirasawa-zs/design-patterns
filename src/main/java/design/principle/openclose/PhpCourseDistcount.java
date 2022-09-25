package main.java.design.principle.openclose;

public class PhpCourseDistcount extends PhpCourse{

    public PhpCourseDistcount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOrigin(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
