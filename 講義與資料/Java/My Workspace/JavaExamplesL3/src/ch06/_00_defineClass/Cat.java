package ch06._00_defineClass;
// Cat 類別有weight(double)與IQ(int)兩個屬性 
// 以及下列兩個方法:
// 1. public void eat(int foodWeight) 
//     Cat進食時, Cat的體重將會增加食物重的10%
// 2. public void study(int hours) 
//     Cat每讀書一小時, IQ會增加0.1 

public class Cat {
	public double weight;
	public int IQ;
	
	public void eat(int foodWeight) {
		weight = weight + foodWeight * 0.1;
	}
	public void study(int hours) {
		IQ = (int) (IQ + hours * 0.1);
	}
}
