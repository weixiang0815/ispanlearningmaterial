package ch12._03_annotation._01;

public class Dog {
	
	@MyAnno(str="Hello, World", val=5)
    public void smile(){
	    System.out.println("Dog, :)");
    }
}
