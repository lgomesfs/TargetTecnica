package _4Distribuidora;

public class Main {

	public static void main(String[] args) {
		double spFat = 67836.46, rjFat = 36678.66, mgFat = 29229.88, esFat = 27165.48, outrosFat = 19849.53;
		double total = spFat + rjFat + mgFat + esFat + outrosFat;

		double spPercent, rjPercent, mgPercent, esPercent, outrosPercent;

		// Cálculo da percentagem
		spPercent = (100 * spFat) / total;
		rjPercent = (100 * rjFat) / total;
		mgPercent = (100 * mgFat) / total;
		esPercent = (100 * esFat) / total;
		outrosPercent = (100 * outrosFat) / total;

		// Exibição
		System.out.println("Porcentagem nos lucros:");
		System.out.println("SP: " + String.format("%.2f", spPercent) + "%");
		System.out.println("RJ: " + String.format("%.2f", rjPercent) + "%");
		System.out.println("MG: " + String.format("%.2f", mgPercent) + "%");
		System.out.println("ES: " + String.format("%.2f", esPercent) + "%");
		System.out.println("Outros: " + String.format("%.2f", outrosPercent) + "%");
	}

}
