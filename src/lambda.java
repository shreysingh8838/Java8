import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Print rectangle");
    }
}
// using lambda
//         Shape rectangle =  () -> System.out.println("Print rectangle");
//          rectangle.draw();

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Print square");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Print circlek");
    }
}
// New changes for new branch
class Shrey{
    // check
    // checking if have raised a Pr but it is not merged and now we have to make changes in it

    // now making changes again for the same PR to check how to get in to origin/master

    // testing again
}
public class lambda {
    List<String> cars;
    lambda(){
        cars = new ArrayList<>();
        cars.add("MG");
        cars.add("WagonR");
        cars.add("Baleno");
    }

    public static void createCars(List<String> car, String newCarName){
        car.add(newCarName);
    }
    public void display(List<String> car){
        System.out.println(car);
    }

    public static void main(String [] args){
        lambda c = new lambda();
        createCars(c.cars, "hyundai");
        c.display(c.cars);
        // For single lambda expression
        Shape rectangle =  () -> System.out.println("Print rectangle");
        rectangle.draw();

        // For multiple lambda expression
        Shape square = () -> {
            System.out.println("Print Square 223");
        };
        square.draw();

        // How to pass lambda expression as method parameter (II)
        print(rectangle);
        print(square);
        System.out.println("testing can we make a commit after a merge in a PR");
    }

    // How to pass lambda expression as method parameter (I)
    private static void print(Shape shape){
        shape.draw();
    }
}

