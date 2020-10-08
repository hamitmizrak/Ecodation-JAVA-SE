package com.ecodation.inner;

public class Ulke {

	private String ulkeAdi = "Türkiye";

	public String getName() {
		return ulkeAdi;
	}

	public void setName(String name) {
		this.ulkeAdi = name;
	}

	public void UlkeMethod() {
		System.out.println("Ulke metot");
	}

	// Şehir innerClass
	public class Sehir {

		private String sehir;

		public String getSehir() {
			return sehir;
		}

		public void setSehir(String sehir) {
			this.sehir = sehir;
		}

		// şehir metod
		public void sehirMetot() {
			String sehirDegiskeni = ulkeAdi;
			System.out.println(sehirDegiskeni);
		}

		// Mahalle
		public class Mahalle {
			private String no;

			public String getNo() {
				return no;
			}

			public void setNo(String no) {
				this.no = no;
			}

			// mahalle metod
			public void mahalleMetot() {
				String sehirDegiskeni = getSehir();
				System.out.println(sehirDegiskeni);
			}

		}
	}

}
