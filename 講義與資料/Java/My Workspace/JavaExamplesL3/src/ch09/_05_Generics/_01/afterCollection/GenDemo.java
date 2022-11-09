package ch09._05_Generics._01.afterCollection;

public class GenDemo {
	public static void main(String[] args) throws Exception {
        Gen<Integer>  gi = new  Gen<Integer>();
        gi.add(100);
        gi.add(300);
        gi.add(500);
        for(int n =0 ; n < 47; n++){
        	gi.add(n);
        }
        gi.list();
        System.out.println("------------");
        Gen<String>  gs = new  Gen<String>();
        gs.add("Kitty");
        gs.add("Micky");
        gs.add("Pinky");
        gs.list();

	}
}

