/**
 * This is a utility class that encrypts and decrypts a phrase using three
 * different approaches. 
 * 
 * The first approach is called the Vigenere Cipher.Vigenere encryption 
 * is a method of encrypting alphabetic text based on the letters of a keyword.
 * 
 * The second approach is Playfair Cipher. It encrypts two letters (a digraph) 
 * at a time instead of just one.
 * 
 * The third approach is Caesar Cipher. It is a simple replacement cypher. 
 * 
 * @author Huseyin Aygun
 * @version 8/3/2025
 */

public class CryptoManager { 

    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;
    // Use 64-character matrix (8X8) for Playfair cipher  
    private static final String ALPHABET64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_";

    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (!(plainText.charAt(i) >= LOWER_RANGE && plainText.charAt(i) <= UPPER_RANGE)) {
                return false;
            }
        }
        return true;
    }

	/**
	 * Vigenere Cipher is a method of encrypting alphabetic text 
	 * based on the letters of a keyword. It works as below:
	 * 		Choose a keyword (e.g., KEY).
	 * 		Repeat the keyword to match the length of the plaintext.
	 * 		Each letter in the plaintext is shifted by the position of the 
	 * 		corresponding letter in the keyword (A = 0, B = 1, ..., Z = 25).
	 */   

    public static String vigenereEncryption(String plainText, String key) {
	   String vigenereString = "";
	   int length = plainText.length();
	   char newChar;
	   char keyChar;
	   for(int i =0; i<length; ++i){
	   	newChar = plainText.charAt(i);
		keyChar = (char)((int)key.charAt(i) - (int)('A'));
		vigenereString += (char)(newChar + (int)(keyChar));
	   } 
         //to be implemented by students
	 return vigenereString;
    } 

    // Vigenere Decryption
    public static String vigenereDecryption(String encryptedText, String key) {
	   String decryptedString = "";
	   int length = encryptedText.length();
	   char stringChar;
	   char keyChar;
	   for(int i =0; i<length; ++i){
	   	stringChar= encryptedText.charAt(i);
		keyChar = (char)((int)key.charAt(i) - (int)('A'));
		decryptedString += (char)(stringChar - (int)(keyChar));
	   } 
	   return decryptedString;
    }


	/**
	 * Playfair Cipher encrypts two letters at a time instead of just one.
	 * It works as follows:
	 * A matrix (8X8 in our case) is built using a keyword
	 * Plaintext is split into letter pairs (e.g., ME ET YO UR).
	 * Encryption rules depend on the positions of the letters in the matrix:
	 *     Same row: replace each letter with the one to its right.
	 *     Same column: replace each with the one below.
	 *     Rectangle: replace each letter with the one in its own row but in the column of the other letter in the pair.
	 */    

    public static String playfairEncryption(String plainText, String key) {
	
	char [][]cypherMatrix = new char[8][8];	
	
	int matrixNum = 0;
	for(int i=0; i<8; ++i)
	{
		for(int j =0; j<8; ++j)
		{

			cypherMatrix[i][j] = ALPHABET64.charAt(matrixNum);
			++matrixNum;

		}
		
	}
	System.out.println(cypherMatrix[0][0]);


	 return "Among Gus" + plainText;
    }

    // Vigenere Decryption
    public static String playfairDecryption(String encryptedText, String key) {
         //to be implemented by students
	 return "empty" + encryptedText;
    }

    public static char[] checkSameRow(char [][]matrix, int [][]indexes)
    {
    	char [] characters = new char[2];

    	return characters;
    }


    public static char[] checkSameColumn(char [][]matrix, int [][]indexes)
    {
    	char [] characters = new char[2];

    	return characters;
    }


    public static char[] checkRectangle(char [][]matrix, int [][]indexes)
    {
    	char [] characters = new char[2];

    	return characters;
    }

    /**
     * Caesar Cipher is a simple substitution cipher that replaces each letter in a message 
     * with a letter some fixed number of positions down the alphabet. 
     * For example, with a shift of 3, 'A' would become 'D', 'B' would become 'E', and so on.
     */    
 
    public static String caesarEncryption(String plainText, int key) {
	String caesarString = "";	
	int length = plainText.length();
	char newChar;
	for(int i =0; i<length; ++i){
		newChar = plainText.charAt(i);
		caesarString += (char)(newChar + key);
	}
	 return caesarString;
    }

    // Caesar Decryption
    public static String caesarDecryption(String encryptedText, int key) {

	String decryptedString = "";	
	int length = encryptedText.length();
	char newChar;
	for(int i =0; i<length; ++i){
		newChar = encryptedText.charAt(i);
		decryptedString += (char)(newChar - key);
	}
	 return decryptedString; 
    }    

}
