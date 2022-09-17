package Java_testing_code;
//using equals(), clone() by overriding2

class Cclass implements Cloneable {
	
	String cString;
    public boolean equals(Object obj) {
    	Cclass Aobj = (Cclass) obj;
        return (this.cString == Aobj.cString);
    }
    
    public Object clone() throws CloneNotSupportedException {
		return super.clone();
    }
    
    public String showMessage() {
    	return "==";
    }
}


public class P_200225_equals_clone2 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cclass cl1 = new Cclass();
		Cclass cl2 = (Cclass)cl1.clone();
		System.out.println(cl1.showMessage());
		System.out.println(cl2.showMessage());
		System.out.println(cl1.equals(cl2));
	}

}
