package ch12._03_annotation._05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//此註釋沒有定義任何方法
public @interface Marker {
	String str() default "OK";
	int val() default 120 ;
}
