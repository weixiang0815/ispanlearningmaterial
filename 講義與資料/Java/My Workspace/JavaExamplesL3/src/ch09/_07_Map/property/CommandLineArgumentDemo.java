package ch09._07_Map.property;

public class CommandLineArgumentDemo {
	// 本程式示範命令列參數
	// MM->Run->Run Configurations->Arguments
	// java -classpath c:\temp ch09._07_Map.property.CommandLineArgumentDemo Mary John "Bill Clinton"
	public static void main(String[] args) {
		
		System.out.println("本程式有" + args.length + "個命令列");
		
		for (int n = 0; n < args.length; n++) {
			System.out.println(args[n]);
		}

	}

}
