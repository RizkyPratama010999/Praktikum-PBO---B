package ControlStatementProject;
import java.util.*;

public class leapYearCalculator {
	public static void main (String []args ) {
		Scanner in = new Scanner (System.in);
		System.out.print("Masukan Bulan (1-12) : ");
		int bulan = in.nextInt();
		if(bulan<12 && bulan>1) {
			System.out.print("Masukan Tahun : ");
			int tahun = in.nextInt();
			
			String jawaban = bulan%2 == 0 ? "Bulan Genap" : "Bulan Ganjil ";
			if (tahun % 400 == 0) {
				System.out.println("Kesimpulannya adalah Tahun " +tahun+ " Merupakan Tahun Kabisat" + " Dan Bulannya Adalah " + jawaban);
			    }
			else if (tahun % 100 == 0) {
				System.out.println("Kesimpulannya adalah Tahun " +tahun+ " Bukan Merupakan Tahun Kabisat" + " Dan Bulannya Adalah " + jawaban);
			    }
			else if (tahun % 4 == 0) {
				System.out.println("Kesimpulannya adalah Tahun " +tahun+ " Merupakan Tahun Kabisat" + " Dan Bulannya Adalah " + jawaban);
			    }
			else {
				System.out.println("Kesimpulannya adalah Tahun " +tahun+ " Bukan Merupakan Tahun Kabisat" + " Dan Bulannya Adalah " + jawaban);
			}
		}
		else {
			System.out.println("Input Data Tidak Valid");
		}
	}
}
