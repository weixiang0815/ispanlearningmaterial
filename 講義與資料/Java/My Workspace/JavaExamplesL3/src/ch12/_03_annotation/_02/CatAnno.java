package ch12._03_annotation._02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//下一行一定要加，否則有嚴重後果   
@Retention(RetentionPolicy.RUNTIME)
public @interface CatAnno {
	String meow();
	int count();
}
