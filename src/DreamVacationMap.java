import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DreamVacationMap implements TileServer{

    /*** Complete and submit this file in AutoLab ***/


    /**
     * 5 points
     *
     * Given a tile, return a new URL at the link for the tile using the openstreetmap.org tile server a:
     * The prefix should be "http://a.tile.openstreetmap.org/"
     * <p>
     * See: http://wiki.openstreetmap.org/wiki/Slippy_map_tilenames for details on map tiles and constructing URLs
     *
     * @param tile Te tile to be retrieved from the API
     * @return The URL corresponding to the requested tile
     */
    public URL getTileURL(Tile tile){

        return null;

    }


    /**
     * 10 points
     *
     * Returns a Tile object for a tile containing the provided destination at the provided zoom level. The
     * destination contains a latitude and longitude which can be used in conjunction with the zoom level
     * to compute the x and y values for the tile containing that latitude and longitude.
     * <p>
     * See: http://wiki.openstreetmap.org/wiki/Slippy_map_tilenames for details on map tiles and computing x and y
     * (The link contains example java code to compute x and y. DO NOT COPY THIS EXAMPLE! Copying this code would be
     * an academic integrity violation and since it contains many techniques that are beyond this course it
     * would be very obvious that it was copied. It is not worth the risk.)
     *
     * @param destination The destination that must be contained in the tile
     * @param zoom        The zoom level for the tile
     * @return The tile containing the destination at this zoom level
     */
    public Tile getTileObject(Destination destination, int zoom){


        return null;
    }


    @Override
    public ImageIcon getTile(Destination destination, int zoom){
        // This interfaces method is implemented by calling the above 2 methods. No addition code is needed here.
        return new ImageIcon(getTileURL(getTileObject(destination, zoom)));
    }

}
