
public abstract class AbstractDemo 
implements Interface1, Interface2, Interface3 {
 
	// common required implementation we can write inside the abstract class
	// the uncommon ones ==> don't override them becoz that Impl will be done 
	// by the respective child class(s)
	
	@Override
	public void method1() {
		System.out.println("method1");
	}
	
	@Override
	public void method2() {
		System.out.println("method2");
	}
	
	// since both have same method (they share the same method), any one of the methods gets executed 
	public static void main(String[] args ) {
		Interface1 interface1 = new Demo();
		Interface3 interface3 = new Demo();
		interface1.method1();
		interface3.method1();
		
	}
}

// here we dont find method1 since its common
// uncommon ones are overridden by concrete class Demo
// if we override few other classes in above code 
// then this below code will not force us to override it again since it's already overridden in anstract class




class Demo extends AbstractDemo {

	
	// can we override a method which is already overriden in abstract class? 
	// YES
	// But now since same method is overridden in both abstract & concrete
	// from where will it be called?
	// Method will be called from the concrete class ie. demo here
	
	
	// if two methods are of same name and is overridden any one of them will be executed whem that method is called
	
	
@Override
public void method2() {
	// TODO Auto-generated method stub
	
}

@Override
public void method3() {
	// TODO Auto-generated method stub
	
}

@Override
public void method4() {
	// TODO Auto-generated method stub
	
}

@Override
public void method5() {
	// TODO Auto-generated method stub
	
}

@Override
public void method6() {
	// TODO Auto-generated method stub
	
}

@Override
public void method7() {
	// TODO Auto-generated method stub
	
}

@Override
public void method8() {
	// TODO Auto-generated method stub
	
}

@Override
public void method9() {
	// TODO Auto-generated method stub
	
}

@Override
public void method10() {
	// TODO Auto-generated method stub
	
}

@Override
public void method12() {
	// TODO Auto-generated method stub
	
}

@Override
public void method13() {
	// TODO Auto-generated method stub
	
}

@Override
public void method14() {
	// TODO Auto-generated method stub
	
}

@Override
public void method15() {
	// TODO Auto-generated method stub
	
}
}