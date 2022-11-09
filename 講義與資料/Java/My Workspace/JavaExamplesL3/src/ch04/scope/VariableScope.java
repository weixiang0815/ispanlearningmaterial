package ch04.scope;

public class VariableScope {
	public static void main(String[] args) {
		int x = 0;
		{
			int y = 0;
			{
				int z = 100;
				{
					// 這裡不能再定義變數 x, y, z
					int a = 10;
					System.out.println(x + y + z + a); // OK
				}
				// 這裡不能使用變數a

			}
			// 這裡不能使用變數z

		}
		// 這裡不能使用變數y
	}
}
