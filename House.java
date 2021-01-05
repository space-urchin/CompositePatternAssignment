package compositepatternassignment;



import java.util.ArrayList;

public class House extends Shape {

    public House() {
        super("House",new ArrayList<>());
        this.draw(new Square("Building"));
        this.draw(new Triangle("Roof"));
        this.draw(new Rectangle("Door"));
        this.draw(new Circle("Window"));
    }

}