package labajava1;
//import java.util.Arrays;
//import java.util.Scanner;
public class program {
	public static void main(String[] args) throws Exception {
		 
		Food[] breakfast = new Food[20];
		 
		int itemsSoFar = 0;
		for (String arg: args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("Pie")) {
                breakfast[itemsSoFar] = new Pie(parts[1]);
            } else {
            	System.out.println(arg);
            }
		
			itemsSoFar++;
		}
		
		//System.out.println(Arrays.toString(breakfast));
		
		//Scanner s = new Scanner(System.in);
		String st = "пирог";
		
		countFood(breakfast, st);
		for (int i = 0; i < breakfast.length; i++) {
			if (breakfast[i] != null)
				breakfast[i].consume();
			else
				break;
		}
		System.out.println("Всего хорошего!");
		}
		

	public static void countFood(Food[] foods, String food) {
	    int count = 0;
	    for (int i = 0;i<foods.length;i++) { 
	    	if(foods[i]!=null) {
	    		//System.out.println("foods.name"+foods[i].name);
		        if (foods[i].name==food) {
		            count++;
		        }
	    	}
	    }
	    System.out.println("всего " + count + " продукта заданного типа содержатся в завтраке");
    }
}

