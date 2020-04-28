package com.algoexpert.easy.caesarcipherencryption;

public class Solution1 {

	//For a given stream of alphabets shift by the number given in key
	//Detail description in written in one note
	public static String caesarCypherEncryptor(String str, int key) {
	    int newKey=key%26;
			char[] newLetters=new char[str.length()];
			for(int i=0;i< str.length();i++){
				newLetters[i]=getNewLetter(str.charAt(i),newKey);
			}
	    return new String(newLetters);
	  }
		
		public static char getNewLetter(char letter,int key){
			int newLetterCode=letter+key;
			return newLetterCode <= 122 ? (char) newLetterCode : (char) (96+newLetterCode%122);
		}
}
