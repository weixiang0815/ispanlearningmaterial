package ch09._05_Generics._04._01;

public class Wildcard<T extends Number> {
	T[] nums;

	public Wildcard(T[] nums) {
		this.nums = nums;
	}
	public double avg(){
		double sum = 0 ;
		for(int i=0; i<nums.length; i++){
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}
	public boolean sameAvg(Wildcard<?> w){
		if (avg()== w.avg()){
			return true;
		}
		return false;
	}
}
