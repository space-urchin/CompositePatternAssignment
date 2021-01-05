
package compositepatternassignment;

import java.util.List;


public class Shape {
    private String name;
    private List<Shape> constituentShapes;

    public Shape(String name,List<Shape> constituentShapes) {
        this.name = name;
        this.constituentShapes = constituentShapes;
    }
    
    public void draw(Shape shape) {
        constituentShapes.add(shape);
    }
    
    public String getName() {
        return name;
    }




    public void display(int subset) {
        String details = "Name: " + getName();
        for(int i = 0; i<subset; i++){
            System.out.print(" ");
        }
        System.out.println("-" + details);

        if (constituentShapes.size() > 0) {
   
            for (Shape shape : constituentShapes) {
                shape.display(subset+1);
            }
        }
    }
}
