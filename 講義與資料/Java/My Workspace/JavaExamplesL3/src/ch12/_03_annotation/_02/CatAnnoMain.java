package ch12._03_annotation._02;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//本範例將讀取Cat類別內的smile()方法前的註釋:CatAnno
public class CatAnnoMain {
	public static void processCatAnno() {
		try {
			//準備處理Cat類別，所以先載入它
			Class<Cat> catClass = Cat.class;
			//取出Cat類別內的smile()方法，存放在Method型別的物件m之內			
			Method m = catClass.getMethod("smile");
			//取出Cat類別內的voice欄位，存放在Field型別的物件fVoice之內			
			Field fVoice = catClass.getDeclaredField("voice");
			//將Cat類別實例化為物件:kitty
			Cat kitty = catClass.newInstance();
			int cnt = 1;
			String voice = null;
			//讀取加在Cat類別之smile()方法前面的註釋:CatAnno
			CatAnno ma = m.getAnnotation(CatAnno.class);
			//如果Cat類別之smile()方法前面有加上註釋CatAnno
			if (ma != null) {
				//取出該註釋成員的設定值
				cnt = ma.count();
				voice = ma.meow();
				//將註釋內的某一份資料倒塞回kitty物件的欄位voice內
				fVoice.set(kitty, voice);  // <---重要喔....
			}
			//印出來看看吧...
			System.out.println("讀到的註釋, count=" + cnt + ", voice=" + voice);
			//利用使用者設定之註釋的值來改變kitty物件的行為
			for (int n = 0; n < cnt; n++) {
				//呼叫kitty物件的smile()方法(由下ㄧ行的變數m來表示smile()方法)，迴圈執行的次數(cnt)由註釋來決定
				m.invoke(kitty, new Object[] {});
			}
		} catch (NoSuchMethodException e) {
			System.out.println("找不到指定的方法:" + "smile");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		processCatAnno();
	}

}
