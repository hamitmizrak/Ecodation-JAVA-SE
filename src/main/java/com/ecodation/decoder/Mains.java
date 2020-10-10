package com.ecodation.decoder;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Mains {
	public static void main(String[] args) {

		String kelime = "Java SE";
		System.out.println(kelime);

		Encoder enc = Base64.getEncoder();
		String title = enc.encodeToString(kelime.getBytes());
		System.out.println(title);

		Decoder dnc = Base64.getMimeDecoder();
		String str = new String(dnc.decode(title));
		System.out.println(str);

	}
}
