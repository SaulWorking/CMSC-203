public class Plot {
    private int x;     
    private int y;     
    private int depth;  
    private int width; 

    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.depth = 0;
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
    public int getWidth() { return width;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setDepth(int depth) {this.depth = depth; }
    public void setWidth(int width) { this.width = width;}


    //reminder -> fix
    //check coordinates & size for overlap and encompass
    //check if the this.plot overlaps the parameter plot
    public boolean overlaps(Plot plot){
        boolean pointInPlot = false;

        int PlotX = this.plot.x;
        int PlotY = this.plot.y; 
        int plotWidth = this.plot.width;
        int plotDepth = this.plot.depth;
  
        int newPlotX =  plot.x;
        int newPlotY = plot.y;
        int newPlotWidth = plot.width;
        int newPlotDepth = plot.depth;
           
         

        //check if this.plot coordinate is in parameter plot
 

  
        //placeholder
        return false;
    }

    //this checks if the parameter plot is wtihin this.plot

    public boolean encompasses(Plot plot){
        boolean isInXRange = false;
        boolean isInYRange = false;

        

        if(plot.x >= this.plot.x && (plot.x + plot.width) <= (this.plot.x + this.plot.width)){
            isInXRange = true;
        }

        if(plot.y >= this.plot.y && (plot.y + plot.depth) <= (this.plot.y + this.plot.depth)){
            isInXRange = true;
        }


        if(isInXRange && isInYRange){
            return true;
        }
             

        return false;
    }



    

}