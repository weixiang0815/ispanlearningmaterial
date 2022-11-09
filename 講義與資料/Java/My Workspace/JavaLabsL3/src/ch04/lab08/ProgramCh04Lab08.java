package ch04.lab08;

// 本程式會產生無窮迴圈，請更正

public class ProgramCh04Lab08 {
    public static void main(String[] args) {
        int sum = 0, n = 1;
        while (n <= 10) {
            sum += n++;
            System.out.println("sum=" + sum);
        }
    }
}
