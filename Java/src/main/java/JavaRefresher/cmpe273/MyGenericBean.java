package JavaRefresher.cmpe273;

public class MyGenericBean<A,B> {
	
	A object1;
	B object2;
	
	public MyGenericBean(A object1, B object2)
	{
		this.object1 = object1;
		this.object2 = object2;
	}

	public A getObject1() {
		return object1;
	}

	public void setObject1(A object1) {
		this.object1 = object1;
	}

	public B getObject2() {
		return object2;
	}

	public void setObject2(B object2) {
		this.object2 = object2;
	}

	
}
