package EEIT157_14_王威翔_第五章作業;

public class Ex4 {

	public static void main(String[] args) {
		String[] ca = {"snoopy", "micky", "lucky", "kitty", "derby"};
		int n = 0;
		for(int i = 0; i < ca.length; i ++) {
			for(int j = 0; j < ca[i].length(); j ++) {
				switch(ca[i].charAt(j)) {
				case 'a':
					n ++;
					continue;
				case 'e':
					n ++;
					continue;
				case 'i':
					n ++;
					continue;
				case 'o':
					n ++;
					continue;
				case 'u':
					n ++;
					continue;
				default:
					continue;
				}
			}
		}
		System.out.println("母音字母共" + n + "個");

	}

}
