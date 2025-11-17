import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

	public final class TwoDimRaggedArrayUtilty {

	private static final int MAX_ROW = 10;
	private static final int MAX_COL = 10;

	public static double[][] readFile(File file) throws FileNotFoundException {
		double [][] arrayInfo = new double[MAX_ROW][];

		try(Scanner fileReader = new Scanner(file)){
			int rowNum = 0;
			
			while(fileReader.hasNextLine()){
				String costs = fileReader.nextLine();
				String[] data = costs.split(" ");

				for(int col=0; col<data.length; col++){
					double val = Double.parseDouble(data[col]);
					arrayInfo[rowNum][col] = val;
					System.out.println(arrayInfo[rowNum][col]);
									
				}

				rowNum++;
			}		
		}

		return arrayInfo;
	}
	

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{

		//for however many rows,

		//read one row of array
		//write to file for one line
		//
		//do this
		
	
	}

	public static double getTotal(double[][] data){
		double sum = 0.0;

		for(int row=0; row<data.length;row++){

			for(int col =0 ; col<data[row].length; col++){
				sum+= data[row][col];
			}	
		}

		return sum;
	}

	public static double getAverage(double[][] data){
		double sum = 0;

		return sum;
	}

	public static double getRowTotal(double[][] data, int row){
		double sum =0;	
		
		for(int col = 0; col<data[row].length;col++){
		
			sum += data[row][col];
			
		}	

		return sum;
	
	}

	public static double getColumnTotal(double[][] data, int col){
		double sum =0 ;

		for(int row =0; row<data[col].length; row++){
		
			sum += data[row][col];
		
		}	
	
		return sum;
	}

	public static double getHighestInRow(double[][] data, int row){
		double highest = 0;
		return highest;	
	}

	public static int getHighestInRow(double[][] data, int row){
		int index = 0;
		return index;	
	}

	public static double getLowestInRow(double[][] data, int row){
		double lowest = 0;
		return lowest;	
	}

	public static int getLowestInRowIndex(double[][] data, int row){
		int index = 0;
		return index;	
	}

	public static double getHighestInColumn(double[][] data, int col){
		double highest = 0;
		return highest;	
	}

	public static double getHighestInColumnIndex(double[][] data, int col){
		double index = 0;
		return index;	
	}

	public static double getLowestInColumn(double[][] data, int row){
		double lowest = 0;
		return lowest;	
	}

	public static int getLowestInColumnIndex(double[][] data, int row){
		int index = 0;
		return index;	
	}

	public static double getHighestInArray(double[][] data){
		double highest = 0;
		return highest;
	}

	public static double getLowestInArray(double[][] data){
		double lowest = 0;
		return lowest;	
	}


}
