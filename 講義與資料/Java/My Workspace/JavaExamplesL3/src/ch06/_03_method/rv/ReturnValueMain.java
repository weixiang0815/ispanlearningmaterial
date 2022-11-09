package ch06._03_method.rv;

public class ReturnValueMain
{
  public static void main(String[] args)
  {
    ReturnValueDemo rvd = new ReturnValueDemo();
    System.out.println("0.--------沒有傳回值---------------");
    rvd.returnValue0(); // 執行順序會移轉到該方法，等到它做完才會回到此敘述繼續執行未完部分
    System.out.println("1.--------傳回值為一個整數---------");
    int num = rvd.returnValue1();  // 同上
    System.out.println("亂數是" + num);
    System.out.println("2.--------傳回值為一個陣列---------");
    int[] arr = rvd.returnValue2();  // 同上
    System.out.println("year=" + arr[0]);
    System.out.println("month=" + arr[1]);
    System.out.println("day=" + arr[2]);
    System.out.println("3.--------傳回值為一個物件---------");
    Message msg = rvd.returnValue3();
    System.out.println("物件的msg屬性：" + msg.msg);
    System.out.println("物件的code屬性：" + msg.code);
    System.out.println("物件的now屬性："+msg.now);
  }
}
