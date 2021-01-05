
package compositepatternassignment;

import java.util.ArrayList;

public class WaterSource extends Shape {

    public WaterSource() {
        super("Water Source", new ArrayList<>());
        this.draw(new Circle("Pond"));
        this.draw(new Tree());
    }

}
