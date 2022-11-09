package ch12._01_enum._02;
//本範例使用較複雜的列舉，此列舉有四個列舉常數，一個有參數的建構子
//兩個屬性與兩個方法，其中一個Override了toString()。
public enum SeasonPro {
	SPRING("春光明媚", 1), SUMMER("炎炎夏日", 2), 
	AUTUMN("秋高氣爽", 3), WINTER("天寒地凍", 4);
	public int index = 0;
	String comment;

	private SeasonPro(String comment, int index) {
		System.out.println("觀察列舉:" + index);
		this.comment = comment;
		this.index = index;
	}
	public String getComment() {
		String msg; 
		msg = "第" + index + "季, " + comment; 
		return msg;
	}
	@Override
	public String toString() {
		String msg; 
		msg = "第" + index + "季, " + comment; 
		return msg;
	}
}
