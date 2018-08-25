/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 *
 * @author ianoderon
 */
public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        
        if(numberOfSides == 3)
            return new Triangle();
        
        if(numberOfSides == 4)
            return new Square();
       
        if(numberOfSides == 5)
            return new Pentagon();
        
    }
}
