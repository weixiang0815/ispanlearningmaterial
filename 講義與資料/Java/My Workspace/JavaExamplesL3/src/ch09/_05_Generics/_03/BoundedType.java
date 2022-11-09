package ch09._05_Generics._03;

public class BoundedType<T extends Number> {
	T[] nums;

	public BoundedType(T[] nums) {
		this.nums = nums;
	}
	public double avg(){
		double sum = 0 ;
		for(int i=0; i<nums.length; i++){
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}
}
