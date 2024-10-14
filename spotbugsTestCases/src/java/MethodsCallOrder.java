/**
 * @author Tomas Polesovsky
 */
public class MethodsCallOrder {

	static {
		staticMethod1();
	}

	public static void staticMethod1(){
		staticMethod2();
	}
	public static void staticMethod2(){
		staticMethod3();
	}
	public static void staticMethod3(){
		staticMethod4();
	}
	public static void staticMethod4(){
		new MethodsCallOrder();
	}

	public MethodsCallOrder() {
		this(null);
	}

	public MethodsCallOrder(Object o) {
		method1();
	}

	public void method1() {
		method2();
	}
	public void method2() {
		method3();
	}
	public void method3() {
		method4();
	}
	public void method4() {
		System.out.println("HERE WE GO!");
	}
}