package ch09._05_Generics._04._01;

public class WildcardMain {
	public static void main(String[] args) {
        Integer[] inum = {1, 2, 3, 4, 5};
        Wildcard<Integer> bti = new Wildcard<Integer>(inum);
        double v = bti.avg();
        System.out.println("inum的平均值=" + v);        
        Double[] dnum = {1.1, 2.2, 3.3, 4.4, 5.5};
        Wildcard<Double> btd = new Wildcard<>(dnum);
        double u = btd.avg();
        System.out.println("dnum的平均值=" + u);

	}
}
