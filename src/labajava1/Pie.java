package labajava1;

public class Pie extends Food{
	private String filling;
	
	public Pie(String filling) {
		
		super("пирог");
		this.filling = filling;
	}
	public boolean equals(Object arg0) {
        if (super.equals(arg0)) { 
            if (!(arg0 instanceof Pie)) return false; 
            return filling.equals(((Pie)arg0).filling); 
        } else
            return false;
    }
	public String get_filling() {
		return this.filling;
	}
	public void set_filling(String filling) {
		this.filling = filling;
	}
	public void consume() {
		System.out.println(  this.toString()+  " съеден");
	}
	public String toString() {
		return "пирог с начинкой '" + filling + "'";
	}
}
