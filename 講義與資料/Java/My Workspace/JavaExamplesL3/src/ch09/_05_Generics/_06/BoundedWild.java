package ch09._05_Generics._06;
import java.util.*;

public class BoundedWild {
    public double addListShape(List<Shape> list) {
    	double totalArea = 0 ;
    	for( Shape sh: list){
    		totalArea += sh.getArea();
    	}
    	return totalArea;
    }
    public double addWildcard(List<?> list) {
    	double totalArea = 0 ;
//    	for( Shape sh: list){    // NG
//    		totalArea += sh.getArea();
//    	}
    	return totalArea;
    }
    public double addBoundedWildcard(List<? extends Shape> list) {
    	double totalArea = 0 ;
    	for( Shape sh: list){
    		totalArea += sh.getArea();
    	}
    	return totalArea;
    }
    public static void main(String[] args) {
    	BoundedWild bw = new BoundedWild();
    	Circle c1 = new Circle(10);
    	Circle c2 = new Circle(20);
    	Rectangle r1 = new Rectangle(6, 10);
    	Rectangle r2 = new Rectangle(6, 10);
    	List<Shape> ls = new ArrayList<>();
    	ls.add(c1);
    	ls.add(c2);
    	ls.add(r1);
    	ls.add(r2);
		bw.addListShape(ls);       // OK    
		bw.addBoundedWildcard(ls); // OK
		List<Circle> lc = new ArrayList<>();
		List<Rectangle> lr = new ArrayList<>();
		List<String> lstr = new ArrayList<>();
//		bw.addListShape(lc);       // NG    
		bw.addBoundedWildcard(lc); // OK
//		bw.addListShape(lr);       // NG    
		bw.addBoundedWildcard(lr); // OK
//		bw.addBoundedWildcard(lstr); // NG
	}
}

