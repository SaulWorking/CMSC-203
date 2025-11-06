import java.util.Scanner;
import java.io.File;

	public final class TwoDimRaggedArrayUtilty {

	private final int MAX_ROW = 10;
	private final int MAX_COL = 10;

	public static double[][] readFile(File file) throws IOException {
		double arrayInfo = new double[MAX_ROW][];

		try(Scanner fileReader = new Scanner(file)){
			int rowNum = 0;
			
			while(fileReader.hasNextLine()){
				StringBuilder costs = new StringBuilder(fileReader.nextLine());
				String[] data = costs.split();
				for(int col=0; col<data.length; col++){
					arrayInfo[rowNum][col] = data[col];
									
				}

				rowNum++;
			}		
		}

		return arrayInfo;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws IOException{
	
	}

	public static double getTotal(double[][] data){
		double sum = 0;

		for(int row=0; row<data.length;i++){
			for(int col =0 ; col<data[row].length; col++){
				sum+= Double.parseDouble(data[row][col]);	
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
		
		for(int col = 0; col<data[row][].length;col++){
		
			sum += Double.parseDouble(data[row][col]);	
			
		}	

		return sum;
	
	}

	public static double getColumnTotal(double[][] data, int col){
		double sum =0 ;

		for(int row =0; row<data[][col].length; row++){
		
			sum += Double.parseDouble(data[row][col]);	
		
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
