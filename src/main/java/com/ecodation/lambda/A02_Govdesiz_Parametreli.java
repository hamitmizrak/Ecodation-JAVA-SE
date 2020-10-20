package com.ecodation.lambda;

interface IEcodation {
	public String govdeliMethod(String lamba);
}

public class A02_Govdesiz_Parametreli {

	public static void main(String[] args) {
		IEcodation ie = new IEcodation() {

			@Override
			public String govdeliMethod(String lamba) {
				// lamba = "Tükiyenin Güzel Yazılımcıları";
				return lamba;
			}
		};

		System.out.println(ie.govdeliMethod("XYZ"));

		/////////////////////////////////////////////////////
		// IEcodation ie3 = ( kelime) -> {};
		IEcodation ie3 = (String kelime) -> {
			return kelime;
		};

		System.out.println(ie3.govdeliMethod("44"));

	}

}
