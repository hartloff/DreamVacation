/**
 * A class used to store the three values defining a tile: zoom, x, and y
 */
public class Tile{


    /*** There is no need to edit this file ***/


    private int zoom;
    private int x;
    private int y;

    public Tile(int zoom, int x, int y){
        this.zoom = zoom;
        this.x = x;
        this.y = y;
    }


    public int getZoom(){
        return zoom;
    }

    public void setZoom(int zoom){
        this.zoom = zoom;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}
