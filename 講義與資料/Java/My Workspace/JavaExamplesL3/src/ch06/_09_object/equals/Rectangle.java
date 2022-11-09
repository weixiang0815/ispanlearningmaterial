package ch06._09_object.equals;

import java.util.Objects;

public class Rectangle extends Object {
	int height;
	int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
//	public int hashCode() {
		//建議將參與equals()比較的所有屬性都進行互斥或運算，如果都是整數，直接對
        //屬性進行互斥或運算，如果有其它基本型態(如double,boolean)的屬性，
        //則將這些屬性包裝為物件。八大基本型別都有對應的包裝類別，
        //每個包裝類別的物件可以包一份資料
        //參與equals()比較的屬性如果是物件則呼叫該物件的hashCode()，
        //對傳回的整數進行互斥或運算。
        //return height ^ width ;
//      JDK 1.8 以前的寫法		
//		return new Integer(height).hashCode() ^ 
//				new Integer(width).hashCode();
//      JDK 9 以前的寫法		
//		return Integer.valueOf(height).hashCode() ^ 
//			   Integer.valueOf(width).hashCode();
//	}

//	public boolean equals(Object obj) {
//		// 先判算傳入的物件是否是本類別的物件，因為不同類別的物件應該視為不相等
//		if (obj != null && obj instanceof Rectangle) {
//			Rectangle re = (Rectangle) obj;
//			if (this.height == re.height && this.width == re.width) {
//				return true;
//			} else {
//				return false;
//			}
//		} else { // 不同類別的物件走這裡
//			return false;
//		}
//	}
}
