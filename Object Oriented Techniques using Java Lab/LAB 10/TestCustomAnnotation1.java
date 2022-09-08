//create, apply and access annotation
//Create annotion having value 10 in class hello
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	int value();
}
class Hello{

@MyAnnotation(value=10) 
public void sayHello(){
	System.out.println("hello annotation");
}
}
//Create class and access the defined annotation 
class TestCustomAnnotation1{
	public static void main(String args[])throws Exception{
		Hello h=new Hello();
		Method m=h.getClass().getMethod("sayHello");
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
		//Use manno as Object
	System.out.println("value is: "+manno.value());
	}
}

