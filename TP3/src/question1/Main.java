package question1;

public class Main {
	public static void main(String[] args){
		String file1 = "operand1.dat";
		String file2 = "operand2.dat";
		String file3 = "operateur.dat";
		int[] arr1 = {10, 23, 15};
		int[] arr2 = {24, 99, -1};
		char[] char1 = {'+', '-', '*'};
		GenerateurFic gF = new GenerateurFic();
		gF.stockerNombres(file1, arr1);
		gF.stockerNombres(file2, arr2);
		gF.stockerCar(file3, char1);
		
		CalculFic cF = new CalculFic();
		cF.calculFic(file1, file2, file3);
		
	}

}
