package ch06._09_object.equalsA;
public class Rectangle extends Object {
    int height;
    int width;
    double ratio;
    String code ;
    public Rectangle(int height, int width, double ratio, String code) {
        //super();
        this.height = height;
        this.width = width;
        this.ratio = ratio;
        this.code = code;
    }
    public int hashCode() {
        //建議將參與equals()比較的所有屬性都進行互斥或運算，如果都是整數，直接對屬性進行
        //互斥或運算，如果有其它基本型態(如double,boolean)的屬性則將這些屬性包裝為物件。
        //八大基本型別都有對應的包裝類別，每個包裝類別的物件可以包一份資料參與equals()
        //比較的屬性如果是物件則呼叫該物件的hashCode()，對傳回的整數進行互斥或運算。
        return height ^ width ^ new Double(ratio).hashCode() ^ code.hashCode() ;
    }
    public boolean equals(Object obj) {
  	  // 先判算傳入的物件是否是本類別的物件，因為不同類別的物件應該視為不相等
      if (obj != null && obj instanceof Rectangle) {
          Rectangle re = (Rectangle) obj;    
          if (this.height == re.height 
                  && this.width == re.width 
                  && this.ratio == re.ratio
                  && this.code.equals(re.code) ) {
              return true;
          }else { // 不同類別的物件走這裡
              return false;
          }
      }else{
          return false;
      }
  }
  // 注意，由於參數列的樣式與父代的equals()方法不一致，所以下面的方法無法
  // Override父代方法。
  public boolean equals(Rectangle  obj) {
       boolean same = true;
       //...
	    return same;
  }
}
