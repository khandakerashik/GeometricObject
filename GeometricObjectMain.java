/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;

/**
 *
 * @author ashik
 */
public class GeometricObjectMain {
    public static void main(String args[])
    {
        ResizableCircle rc =new ResizableCircle(5);
        System.out.println("Perimeter:"+rc.getPerimeter());
        System.out.println("Area:"+rc.getArea());
        rc.resize(9);
        System.out.println("Perimeter:"+rc.getPerimeter());
        System.out.println("Area:"+rc.getArea());
    }
    
}
