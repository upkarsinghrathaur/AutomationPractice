package com.Test.utilities;
import java.util.Random;

public class RandomGenerator {

	public static String getStringForEmail()
	{
		String emailChar= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder builder= new StringBuilder();
		Random random= new Random();
		while(builder.length() < 12)
		{
			int index = (int) (random.nextFloat() * emailChar.length());
			builder.append(emailChar.charAt(index));
		}
		String emailString= builder.toString();
		return emailString;
	}
}
