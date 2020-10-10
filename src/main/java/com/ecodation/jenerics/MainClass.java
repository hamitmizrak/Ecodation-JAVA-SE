package com.ecodation.jenerics;

import java.util.Base64;
import java.util.UUID;

public class MainClass {

	public static void main(String[] args) {
		// Generics_003_Constructors<Integer> g2 = new
		// Generics_003_Constructors<Integer>();
		// g2.

		String kelime = "Hamit444";

		java.util.Base64.Encoder encoder = Base64.getEncoder();
		String title_encoder = encoder.encodeToString(kelime.getBytes());
		System.out.println(title_encoder);

		Base64.Decoder decoder3 = java.util.Base64.getMimeDecoder();
		String dStr = new String(decoder3.decode(title_encoder));
		System.out.println(dStr);

		// Generate time-based UUID

		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);

	}

}
