
public class Pertemuan13 {
	public static void Coba(int pembilang, int penyebut) {
		try {
			int hasil = pembilang/penyebut;
			System.out.println("Hasil Bagi : "+hasil);
		}catch(ArithmeticException ekspresi1){
			System.out.println("Terdapat pembagian dengan 0");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coba(4,0);
		System.out.println();
		Coba(12,4);
	}

}
