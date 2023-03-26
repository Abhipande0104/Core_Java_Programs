package dayy20;

public @interface MyAnno 
{
	String name();
	int value() default 10;
}
