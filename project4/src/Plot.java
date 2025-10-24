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
    public boolean overlaps(Plot plot){
        return true;
    }

    public boolean encompases(Plot plot){
        return true;
    }

}