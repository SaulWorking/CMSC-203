import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

	public final class TwoDimRaggedArrayUtility {

	private static final int MAX_ROW = 10;
	private static final int MAX_COL = 10;

public static double[][] readFile(File file) throws FileNotFoundException {
    String[][] fileInfo = new String[MAX_ROW][MAX_COL];

	//check for number of rows
    int rowNum = 0;

	//set up fileInfo in preparation for conversion to double array
    try (Scanner fileReader = new Scanner(file)) {
        while (fileReader.hasNextLine()) {

            String line = fileReader.nextLine();
            String[] data = line.split(" ");

            for (int col = 0; col < data.length; col++) {
                fileInfo[rowNum][col] = data[col];
            }

            rowNum++;
        }
    }

    double[][] parkData = new double[rowNum][];

	//for each row, determine length of that row (number of columns per row)
    for (int i = 0; i < rowNum; i++) {

        int currentLength = 0;
        while (currentLength < MAX_COL){

			if(fileInfo[i][currentLength] != null) {
				currentLength++;
			} else {
				break;
			}
		}

		//create jagged array based on current row length
        parkData[i] = new double[currentLength];

		//fill jagged array with double values
        for (int j = 0; j < currentLength; j++) {
            parkData[i][j] = Double.parseDouble(fileInfo[i][j]);
        }
    }

    return parkData;
}

public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

	
    try (PrintWriter fileWrite = new PrintWriter(outputFile)) {

		//for every row in data, create a string of the row's value seperated by spaces
        for (int row = 0; row < data.length; row++) {

            if (data[row].length == 0) {
                fileWrite.print('\n');
                continue;
            }

            StringBuilder costRow = new StringBuilder();

            for (int col = 0; col < data[row].length; col++) {
				//add value to line
                costRow.append(data[row][col]);

				//check if not last value to avoid space at end of line
                if (col < data[row].length - 1) {
                    costRow.append(" ");
                }
            }
			//write line to file
            fileWrite.println(costRow.toString());
        }

    }
}

	public static double getTotal(double[][] data){
		double sum = 0.0;

		for(int row=0; row<data.length;row++){

			for(int col =0; col<data[row].length; col++){
				sum+= data[row][col];
			}	
		}

		return sum;
	}

	public static double getAverage(double[][] data){
		double sum = 0;
		int count  =0;

		for(int row=0; row<data.length;row++){
			for(int col =0; col<data[row].length; col++){
					sum+= data[row][col];
					count++;
			}	
		}
		double average = sum/count;
		return average;
	}

	public static double getRowTotal(double[][] data, int row){
		double sum =0;	
		
		for(int col = 0; col<data[row].length;col++){
			sum += data[row][col];
		}
		return sum;
	
	}

	public static double getColumnTotal(double[][] data, int col){
		double sum =0;

		for(int row = 0; row<data.length; row++){
			if(col < data[row].length){ 
				sum += data[row][col];
			}	
		}
	
		return sum;
	}

	public static double getHighestInRow(double[][] data, int row){
		double highest = 0;
		for(int col = 0; col < data[row].length; col++){
			if(highest < data[row][col]){
				highest = data[row][col];
			}
		}

		return highest;	
	}

	public static int getHighestInRowIndex(double[][] data, int row){
		int index = 0;
		for(int col = 0; col < data[row].length; col++){
			if(data[row][index] < data[row][col]){
				index = col;
			}
		}

		return index;	
	}

	public static double getLowestInRow(double[][] data, int row){
		double lowest = 0;
		for(int col = 0; col < data[row].length; col++){
			if(lowest > data[row][col]){
				lowest = data[row][col];
			}
		}
		return lowest;	
	}

	public static int getLowestInRowIndex(double[][] data, int row){
		int index = 0;
		for(int col = 0; col < data[row].length; col++){
			if(data[row][index] > data[row][col]){
				index = col;
			}
		}
		return index;	
	}

	public static double getHighestInColumn(double[][] data, int col){
		double highest = Double.MIN_VALUE;
		for(int row = 0; row < data.length; row++){
			if(col < data[row].length && highest < data[row][col]){
				highest = data[row][col];
			}
		}
		return highest;	
	}

	public static int getHighestInColumnIndex(double[][] data, int col){
		int index = 0;
		for(int row = 0; row < data.length; row++){
			if(col < data[row].length && data[index][col] < data[row][col]){
				index = row;
			}
		}
		return index;	
	}

	public static double getLowestInColumn(double[][] data, int col){
		double lowest = Double.MAX_VALUE;
		for(int row = 0; row < data.length; row++){
			if(col < data[row].length && lowest > data[row][col]){
				lowest = data[row][col];
			}
		}
		return lowest;	
	}

	public static int getLowestInColumnIndex(double[][] data, int col){
		int index = 0;
		for(int row = 0; row < data.length; row++){
			if(data[row].length > col && data[row][col] < data[index][col]){
				index = row;
			}
		}
		return index;	
	}

	public static double getHighestInArray(double[][] data){
		double highest = Double.MIN_VALUE;
		for(int row = 0; row < data.length; row++){
			for(int col = 0; col < data[row].length; col++){
				if(highest < data[row][col]){
					highest = data[row][col];
				}
			}
		}
		return highest;
	}

	public static double getLowestInArray(double[][] data){
		double lowest = Double.MAX_VALUE;
		for(int row = 0; row < data.length; row++){
			for(int col = 0; col < data[row].length; col++){
				if(lowest > data[row][col]){	
					lowest = data[row][col];
				}
			}
		}
		return lowest;	
	}
}
