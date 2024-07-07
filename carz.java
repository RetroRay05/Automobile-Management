import java.util.ArrayList;
import java.util.Scanner;

class carz{
	public static void main(String [] args){
		ArrayList<String> model = new ArrayList<String>();
		ArrayList<String> edi = new ArrayList<String>();
		ArrayList<Integer> make = new ArrayList<Integer>();
		ArrayList<Integer> vin = new ArrayList<Integer>();
		
		model.add("Dodge Challenger");
		make.add(2022);
		edi.add("Standard");
		vin.add(11);
		
		model.add("911 GT3 RS");
		make.add(2024);
		edi.add("Sports");
		vin.add(12);
		
		model.add("Zonda R");
		make.add(2022);
		edi.add("Standard");
		vin.add(11);
		
		model.add("Mazda 787b");
		make.add(1990);
		edi.add("Endurance");
		vin.add(13);
		
		Scanner sc = new Scanner(System.in);
		
		String modelin, ediin, in;
		int makein, vinin, pos, intin;
		
		while (true) {
			System.out.println("----------MENU----------");
			System.out.print("1. View all\n"
					+ "2. Add car\n"
					+ "3. Remove car\n"
					+ "4. Exit\n"
					+ "Option....");
			intin = sc.nextInt();
			if (intin == 1) {
				if (vin.isEmpty()) {
					System.out.println("\nZero records to display\n");
				}
				else {
					System.out.println("\nMake, Model, Edition, VIN no.");
					for (int i = 0 ; i<vin.size() ; i++) {
						System.out.println(make.get(i)+" | "+model.get(i)+" | "
						+edi.get(i)+" | "+vin.get(i));
					}
					System.out.print("\n");
				}
			}
			else if (intin == 2 ) {
				System.out.println("-------ADD MENU-----");
				sc.nextLine();
				System.out.print("Make (year)....");
				makein = sc.nextInt();
				System.out.print("VIN....");
				vinin = sc.nextInt();
				sc.nextLine();
				System.out.print("Model....");
				modelin = sc.nextLine();
				System.out.print("Edition....");
				ediin = sc.nextLine();
				model.add(modelin);
				make.add(makein);
				edi.add(ediin);
				vin.add(vinin);

			}
			else if (intin == 3) {
				System.out.println("----REMOVE MENU----");
				System.out.println("VIN >>>");
				sc.nextLine();
				vinin = sc.nextInt();
				pos = vin.indexOf(vinin);
				if (pos < 0) {
					System.out.println("VIN does not exist!");
					System.out.println("Existing VINs : " + vin);
				}
				else {
					System.out.println("\nConfirm details");
					System.out.print(make.get(pos)+" "
					+model.get(pos)+" "+edi.get(pos)+ "[y/n]....");
				}
				sc.nextLine();
				in = sc.nextLine();
				if (in.toLowerCase().equals("y")) {
					make.remove(make.get(pos));
					model.remove(model.get(pos));
					edi.remove(edi.get(pos));
					vin.remove(vin.get(pos));
					System.out.println("RECORD REMOVED!\n");
				}
				else {
					continue;
				}
				
				
			}
			else if (intin == 4) {
				break;
			}
		}
		
	}
}