package Java_testing_code;
//using equals(), clone() by overriding

//Overriding equals()
class Aclass {
	
	String aString;

	public Aclass(String aString) {
		this.aString = aString;
	}
    public boolean equals(Object obj) {
    	Aclass Aobj = (Aclass) obj;
        return (this.aString == Aobj.aString);
    }
}


//using clone() by overriding, throws Exception, implements Cloneable interface
class Bclass implements Cloneable{
	
	public String show() {
		return "해당 객체는 Bclass의 instance입니다.";
	}
	
//	protected native Object clone() throws CloneNotSupportedException;
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); //super은 상위 클래스인 Object를 의미.
	}
}


public class P_200225_equals_clone {

	public static void main(String[] args) throws CloneNotSupportedException{
//		Aclass클래스를 통해 A1, A2라는 인스턴스 생성
		Aclass A1 = new Aclass("a");
		Aclass A2 = new Aclass("a");
		System.out.println(A1.equals(A2));
		
		Bclass B1 = new Bclass();
//		B1.clone(); --> B1을 clone(복제)해서 생성되는 객체의 이름과 데이터 타입을 다시 명시해줘야함
		Bclass B2 = (Bclass)B1.clone(); //B1.clone()의 결과는 Object이기 때문에 강제 형변환
		System.out.println(B1.show());
		System.out.println(B2.show());
		System.out.println(B1.equals(B2));
		
	}

}
