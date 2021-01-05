/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatternassignment;

import java.util.ArrayList;

public class Tree extends Shape{
    public Tree() {
        super("Tree",new ArrayList<>());
        this.draw(new Rectangle("Trunk"));
        this.draw(new Line("Branches"));
        this.draw(new Circle("Leaves"));
        this.draw(new Circle("Fruits"));
    }
}
