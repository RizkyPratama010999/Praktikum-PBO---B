package project2;

import java.text.*;
public class DemoEnkapsulasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Demo Enkapsulasi");
		System.out.println("================");
		HitungGaji tony = new HitungGaji();
		tony.setGaji(25000000);
		tony.HitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("Besar Gaji Kotor : "+df.format(tony.getGajiKotor()));
		System.out.println("Besar Gaji Yang Dibawa Pulang : "+df.format(tony.getGajiBersih()));
	}

}
