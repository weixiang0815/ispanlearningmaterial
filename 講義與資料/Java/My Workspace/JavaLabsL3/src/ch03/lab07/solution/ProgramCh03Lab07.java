package ch03.lab07.solution;
/*
  請編寫程式ch03.lab07.ProgramCh03Lab07，在main()之內
  請計算89個雞蛋是多少打又多少個。
*/
public class ProgramCh03Lab07 {
    public static void main(String[] args) {
    	int eggs = 89; 
    	int dozen, rem;
    	dozen = eggs / 12;          // 有幾打
    	rem =   eggs % 12;          // 不滿一打的雞蛋數
    	System.out.println(eggs + "個雞蛋是" + dozen + "打又" + rem + "個");          
    }
}
