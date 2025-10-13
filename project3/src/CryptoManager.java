import java.util.ArrayList;


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
    private static final String ALPHABET64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 !\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_";

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
    String encryption = "";
    int length = plainText.length();

    for (int i = 0; i < length; i++) {
        int keyShift = key.charAt(i) - 'A';
        char encryptedChar = (char)(plainText.charAt(i) + keyShift);
		encryption += ("" + encryptedChar);
    }

    return encryption;
}

public static String vigenereDecryption(String encryptedText, String key) {
    String decrpytion = "";
    int length = encryptedText.length();

    for (int i = 0; i < length; i++) {
        int keyShift = key.charAt(i) - 'A';
        char decryptedChar = (char)(encryptedText.charAt(i) - keyShift);
		decrpytion += ("" + decryptedChar);
    }

    return decrpytion;
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

public static String playfairEncryption(String plainText, String key)
{
	//rows and columns for cInfo array
	final int row = 0;
	final int col = 1;
	//matrix length;
	final int playFairLength = 8;

    ArrayList<String> cPairs = getPairs(plainText);
    char [][]cypherMatrix = new char[8][8];  
    setMatrix(cypherMatrix, key);

    String encryptedString = "";

	for(int  i=0; i<cPairs.size(); i++)
	{

		String pair = cPairs.get(i);
		
		char c1 = pair.charAt(row);
		char c2 = pair.charAt(col);

		int[] c1Info = findRowCol(cypherMatrix, c1);    
		int[] c2Info = findRowCol(cypherMatrix, c2);


		if(sameRow(cypherMatrix, c1, c2))
		{
				int rowC1 = c1Info[row];
				int rowC2 = c2Info[row];	

				int newCol1 = (c1Info[col] + 1) % playFairLength;
				int newCol2 = (c2Info[col] + 1) % playFairLength;

		    c1 = cypherMatrix[rowC1][newCol1];
		    c2 = cypherMatrix[rowC2][newCol2];
		}
		else if(sameCol(cypherMatrix, c1, c2))
		{
				int newRow1 = (c1Info[row]+1) % playFairLength;
				int newRow2 = (c2Info[row]+1) % playFairLength;

				int colC1 = c1Info[col];
				int colC2 = c2Info[col];

		    c1 = cypherMatrix[newRow1][colC1];
		    c2 = cypherMatrix[newRow2][colC2];
		}
		else if(isRect(cypherMatrix, c1, c2))
		{
				int rowC1 = c1Info[row];
				int rowC2 = c2Info[row];
				int colC1 = c1Info[col];
				int colC2 = c2Info[col];

		    c1 = cypherMatrix[rowC1][colC2];
		    c2 = cypherMatrix[rowC2][colC1];
		}

		encryptedString += ("" + c1 + c2);
	}

    return encryptedString;
}

    // Vigenere Decryption
public static String playfairDecryption(String encryptedText, String key) {
    final int row = 0;
    final int col = 1;
    final int playFairLength = 8;

    char[][] cypherMatrix = new char[8][8];
    setMatrix(cypherMatrix, key);

    ArrayList<String> cPairs = getPairs(encryptedText); 
    String decryptedString = "";
	for(int  i=0; i<cPairs.size(); i++)
	{
		String pair = cPairs.get(i);
		char c1 = pair.charAt(row);
		char c2 = pair.charAt(col);

		int[] c1Info = findRowCol(cypherMatrix, c1);
		int[] c2Info = findRowCol(cypherMatrix, c2);

		if(sameRow(cypherMatrix, c1, c2))
		{
			int rowC1 = c1Info[row];
			int rowC2 = c2Info[row];	

			int originalCol1 = (c1Info[col] + 7) % playFairLength;
			int originalCol2 = (c2Info[col] + 7) % playFairLength;

			c1 = cypherMatrix[rowC1][originalCol1]; 
			c2 = cypherMatrix[rowC2][originalCol2];

		}else if(sameCol(cypherMatrix, c1, c2))
		{
			int originalRowC1 = (c1Info[row] + 7) % playFairLength;
			int originalRowC2 = (c2Info[row] + 7) % playFairLength;	

			int colC1 = c1Info[col];
			int colC2 = c2Info[col];

			c1 = cypherMatrix[originalRowC1][colC1]; 
			c2 = cypherMatrix[originalRowC2][colC2];

		}else if (isRect(cypherMatrix, c1, c2))
		{
				int rowC1 = c1Info[row];
				int rowC2 = c2Info[row];
				int colC1 = c1Info[col];
				int colC2 = c2Info[col];

		    c1 = cypherMatrix[rowC1][colC2];
		    c2 = cypherMatrix[rowC2][colC1];
		}

	//If character is duplicate, let c2 be null char
		if(c2 == 'X'){
			c2 = '\0';
		}
	
	//add "" to create a string w/ multiple chars
        decryptedString += ("" + c1 + c2);
    }

    return decryptedString;
}


	/**
	 * This is used in setting up the encryption and decrpytion for the playfair cypher.
	 * First, we get rid of all the duplicates in the key.
	 * Then, we add those words to teh amtrix 
	 * 
	 */

    public static void setMatrix(char[][] matrix, String key) {
        String tempKey = rmDuplicate(key);
        ArrayList<Character> matrixString = new ArrayList<>();

	

	for(int i =0; i< tempKey.length(); i++){
		char keyChar = tempKey.charAt(i);
		if(matrixString.contains(keyChar) == false){
			matrixString.add(keyChar);
		}
	
	}

	for(int j=0; j<ALPHABET64.length(); j++){
		char alphaChar = ALPHABET64.charAt(j);
		if(matrixString.contains(alphaChar) == false){
			matrixString.add(alphaChar);
		}
	
	} 


        int index = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = matrixString.get(index);
				index++;
            }
        }
    }

/**
 * 
 */

  public static String rmDuplicate(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean foundLater = false;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    foundLater = true;
                    break;
                }
            }

            if (foundLater == false) {
                result += c;
            }
        }
        return result;
    }



public static ArrayList<String> getPairs(String plainText) {
    ArrayList<String> pairList = new ArrayList<>();
    int index = 0;

    for(;index < plainText.length();)
	{		
        char firstChar = plainText.charAt(index);
        char secondChar;

		//out of bounds for getting Char
        if(index + 1 < plainText.length()){

            secondChar = plainText.charAt(index + 1);
		//if they are duplicates -> add X to make pair usuable
            if(firstChar == secondChar){ 
                secondChar = 'X';
                index++;
            }else{
				//move on to next pair
                index += 2; 
            }

		//odd string length -> add X to make pair usuable
        }else{ 
            secondChar = 'X';
            index++; 
        }

          pairList.add("" + firstChar + secondChar);
    //    System.out.println("Pairs: " + tChar1 + tChar2);
    }

    return pairList;
}




    public static int[] findRowCol(char [][]matrix, char c1)
	{
	    
		int []rowColInfo = new int[2];
		for(int row =0; row<8; row++){
			for(int col = 0; col<8; col++)
			{
				if(matrix[row][col] == c1)
				{

					rowColInfo[0] = row;
					rowColInfo[1] = col;

				return rowColInfo;
				}
			}
		} 
		return rowColInfo;
    }

    public static boolean sameRow(char[][] matrix, char c1, char c2)
	{
		final int row = 0;

		int []c1Info = findRowCol(matrix, c1);
		int []c2Info = findRowCol(matrix, c2);
		if(c1Info[row] == c2Info[row])
		{
			return true;
		}
		return false;
    }

    public static boolean sameCol(char[][] matrix, char c1, char c2)
    {
		final int col = 1;

		int []c1Info = findRowCol(matrix, c1);
		int []c2Info = findRowCol(matrix, c2);
		if(c1Info[col] == c2Info[col])
		{
			return true;
		}
		return false;
    }

    public static boolean isRect(char[][] matrix, char c1, char c2)
    {
    	if(!sameRow(matrix,c1,c2) && !sameCol(matrix,c1,c2))
	{
		return true;	
	}
	return false;
    }



    /**
     * Caesar Cipher is a simple substitution cipher that replaces each letter in a message 
     * with a letter some fixed number of positions down the alphabet. 
     * For example, with a shift of 3, 'A' would become 'D', 'B' would become 'E', and so on.
     */    
 
    public static String caesarEncryption(String plainText, int key)
	{
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
    public static String caesarDecryption(String encryptedText, int key)
	{
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
