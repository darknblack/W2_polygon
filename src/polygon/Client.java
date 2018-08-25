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
public class Client {
    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        
        Polygon triangle = polygonFactory.getPolygon(3);
        System.out.println(triangle.getType());
        
        Polygon square = polygonFactory.getPolygon(4);
        System.out.println(square.getType());
        
        Polygon pentagon = polygonFactory.getPolygon(5);
        System.out.println(pentagon.getType());
    }
}
