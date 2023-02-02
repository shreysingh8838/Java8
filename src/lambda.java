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

public class lambda {

    List<String> cars = new ArrayList<>();
    public  void createCars(){
        this.cars.add("MG");
        this.cars.add("WagonR");
        this.cars.add("Baleno");
    }

    public static void main(String [] args){
        String str = "hello";

        // For single lambda expression
        Shape rectangle =  () -> System.out.println("Print rectangle");
        rectangle.draw();

        // For multiple lambda expression
        Shape square = () -> {
            System.out.println("Print Square");
        };
        square.draw();

        // How to pass lambda expression as method parameter (II)
        print(rectangle);
        print(square);
    }

    // How to pass lambda expression as method parameter (I)
    private static void print(Shape shape){
        shape.draw();
    }
}

