package day25;

class Test<T1,T2>
{
	T1 id;
	T2 name;
}
public class GenericsDemo2 {

	public static void main(String[] args) {
		Test<Integer,String> object = new Test<>();
		object.id = 100;
		System.out.println(object.id);
		object.name = "Swaroop";
		System.out.println(object.name);
	}

}
