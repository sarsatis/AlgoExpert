package com.algoexpert.easy.caesarcipherencryption;

public class Solution2 {

	// For a given stream of alphabets shift by the number given in key
	// Detail description in written in one note
	public static String caesarCypherEncryptor(String str, int key) {
		char[] newLetters = new char[str.length()];
		int newKey = key % 26;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			newLetters[i] = getNewLetter(str.charAt(i), newKey, alphabet);
		}
		return new String(newLetters);
	}

	public static char getNewLetter(char letter, int key, String alphabet) {
		int newLetterCode = alphabet.indexOf(letter) + key;
		return newLetterCode <= 25 ? alphabet.charAt(newLetterCode) : alphabet.charAt(-1 + newLetterCode % 25);
	}
}
