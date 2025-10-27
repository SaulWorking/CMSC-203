/*
 * Class: CMSC203 
 * Instructor: Huseyin Agyun
 * Description: (Give a brief description for each Class)
 * Due: 10/28/2025
 * Platform/compiler: JDK 21
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Thien Dinh 
*/


public class Plot {
    private int x;     
    private int y;     
    private int depth;  
    private int width; 

    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public int getDepth() {return depth;}
    public int getWidth() {return width;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setDepth(int depth) {this.depth = depth; }
    public void setWidth(int width) { this.width = width;}


    //reminder -> fix
    //check coordinates & size for overlap and encompass
    //check if the this.plot overlaps the parameter plot
	public boolean overlaps(Plot P) {
		// Variables
		int TOP_L_X = this.x;
		int TOP_L_Y = this.y;
		
		boolean outOfX = false;
		boolean outOfY = false;


		int TOP_R_X = this.x + this.width;

		int BOT_L_Y = this.y + this.depth; // ending y coord (bottom)
		
		int Px  = P.x;
		int Py = P.y;

		
		if ( TOP_L_X >= Px  || Px <= TOP_R_X) {
			outOfX = true;
		}
		
		if (TOP_L_Y >= Py || Py <= BOT_L_Y) { 
			outOfY = true;
		}

		if(outOfY && outOfX) {
			return false;
		}
		// Return
		return true; 
	}
/*
 * remark
 * to check if a plot encompasses another,
 */
		public boolean encompasses(Plot P) {
			
					boolean leftMostOut = false;
					boolean rightMostOut = false;
					boolean topMostOut = false;
					boolean bottomMostOut = false;
			
			
			// this plot's coordinates
			int TOP_L_X = this.x;
			int TOP_L_Y = this.y;
			int TOP_R_X = TOP_L_X + this.width;
			int BOT_L_Y = TOP_L_Y + this.depth;

			// parameter plot’s coordinates
			int Px = P.x;
			int Py = P.y;

			int Px_R = P.x + P.width;
			int Py_BOT = P.y + P.depth;

			if (Px < TOP_L_X) {
				leftMostOut = true; 
			}

			if (Px_R > TOP_R_X) {
				rightMostOut = true;
			}

			if (Py < TOP_L_Y) {
				topMostOut = true; 
			}

			if (Py_BOT > BOT_L_Y) {
				bottomMostOut = true;
			}

			if(leftMostOut && rightMostOut && topMostOut && bottomMostOut) {
				return false;
			}
			
			return true;
		}
		
	public String toString(){
		
		String cordsAndDimensions =  x+","+y+","+width+","+depth;
		
		return cordsAndDimensions;

		
	}
		
}


		

