package adv_java_training.StaticInit;

import java.util.ArrayList;

public class OliveJar {
	
	public  ArrayList<Olive> olives;
	
	 {
		System.out.println("initializing...");
		
		olives = new ArrayList<>();
		
		olives.add(new Olive("Kalamata"));
		
		olives.add(new Olive("Black"));
		
		olives.add(new Olive("Green"));
		
	}
	 
	 public void addOlive(String name, long color){
		 olives.add(new Olive(name, color));
	 }

	public void reportOlives(){
		 /*class JarLid {
			public void open(){
				System.out.println("Twist, twist, twist...");
				System.out.println("Open");
			 }
		 }*/
		 //new JarLid().open();
		 
		 new Object(){
			public void open() {
					System.out.println("Twist, twist, twist...");
					System.out.println("Open");
				 }
		 }.open();
		 
		 for (Olive o : olives) {
			 System.out.println(o.toString());
		}
	 }
	class Olive {
		
		public String oliveName;
		
		public static final long BLACK = 0x000000;
		public long color = BLACK;
		
		public Olive(){
			
		}
		public Olive(String name){
			this.oliveName = name;
		}
		public Olive(String name, long color){
			this.oliveName = name;
			this.color = color;
		}
		
		public String toString(){
			return "Olive name:" + this.oliveName + " Color:" + this.color;
		}
		
		

	}
}
