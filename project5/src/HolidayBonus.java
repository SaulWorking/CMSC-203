public class HolidayBonus{

	public static double[] calculateHolidayBonus(double[][] data){
		double[] array = new double[data.length];

		for(int row = 0; row < data.length; row++){

			for(int col = 0; col < data[row].length; col++){
				if(data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)){
					array[row] += 5000.0;
				}else if(data[row][col] < 0){
					array[row] += 0.0;
				}else if(data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col)){
					array[row] += 1000.0;
				}else{
					array[row] += 2000.0;
				}
			}
		}

		return array;	
	}

	public static double calculateTotalHolidayBonus(double[][] data){
		double holidayBonus = 0.0;
		double[] bonuses = calculateHolidayBonus(data);

		for(int i=0; i < bonuses.length; i++){
			holidayBonus += bonuses[i];
		}
		return holidayBonus;	
	}
}
