package ch09._05_Generics._01.afterCollection;
import java.util.*;
public class Gen<T> {
    private T data;
    Collection<T> container =  new ArrayList<T>();
    public Gen(T data){
    	this.data = data;
    }
    public Gen(){
    }
    public T getData() {
    	return data;
    }
    public void add(T data) throws Exception{
    	container.add(data);    	
    }
    public void list(){
    	for(T o : container) {
    		System.out.println(o);
    	}
    }
}
