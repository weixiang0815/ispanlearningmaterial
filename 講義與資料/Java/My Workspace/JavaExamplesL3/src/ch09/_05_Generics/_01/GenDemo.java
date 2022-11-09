package ch09._05_Generics._01;

public class GenDemo {
	public static void main(String[] args) throws Exception {
        //使用Gen<T>時必須以真實的型態取代T。
        Gen<Integer>  gi = new  Gen<Integer>(100);
        gi.showData();
        gi.showType();
        System.out.println("------------");
        Gen<String>  gs = new  Gen<String>("HelloSnoopy");
        gs.showData();
        gs.showType();
        System.out.println("------------");
        Gen<Cat>  gc = new  Gen<Cat>(new Cat());
        gc.showData();
        gc.showType();
	}
}
