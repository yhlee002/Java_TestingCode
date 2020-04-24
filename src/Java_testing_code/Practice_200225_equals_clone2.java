package Java_testing_code;
//using equals(), clone() by overriding2

class Cclass implements Cloneable {
	
	String Cstring;
    public boolean equals(Object obj) {
    	Cclass Aobj = (Cclass) obj;
        return (this.Cstring == Aobj.Cstring);
    }
    
    public Object clone() throws CloneNotSupportedException {
		return super.clone();
    }
    
    public String showingmeth() {
    	return "==";
    }
}


public class Practice_200225_equals_clone2 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cclass cl1 = new Cclass();
		Cclass cl2 = (Cclass)cl1.clone();
		System.out.println(cl1.showingmeth());
		System.out.println(cl2.showingmeth());
		System.out.println(cl1.equals(cl2));
	}

}
