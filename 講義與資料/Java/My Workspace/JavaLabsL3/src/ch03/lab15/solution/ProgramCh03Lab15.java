package ch03.lab15.solution;

public class ProgramCh03Lab15 {
    public static void main(String[] args) {

        double total = 258.5698;
        // 請對 total 的小數點第二位進行四捨五入。
        total = Math.round(total * 100) / 100.0;
        System.out.println("total=" + total);
    }
}
