package adv_java_training.StaticInit;

import adv_java_training.StaticInit.OliveJar;

public class MemberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OliveJar oliveJar = new OliveJar();
		 //ArrayList<Olive> olives = oliveJar.olives;
		
		 oliveJar.reportOlives();
		 oliveJar.addOlive("new olive", 0x000000);
		 oliveJar.reportOlives();

		
		

		/*for (int i = 0;i<olives.size();i++ ){
			System.out.println();
			//System.out.println(olives.get(i).OliveName);
		}*/
	}

}

