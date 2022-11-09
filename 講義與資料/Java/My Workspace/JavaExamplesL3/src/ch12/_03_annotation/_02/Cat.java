package ch12._03_annotation._02;

public class Cat { 
	public String voice="(無言)";
	//1. 先試下面的註釋
	//@CatAnno(meow="喵喵喵", count=5)
	//2. 再試試這一行 
	@CatAnno(meow="汪汪汪", count=2)
	//3. 前兩個都不加, 再試一次
    public void smile(){
	    System.out.println("Cat:" + voice);
    }
}
