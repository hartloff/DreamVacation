import javax.swing.*;


/*** There is no need to edit this file ***/


/**
 * An interface defining a tile server
 */
public interface TileServer{

    /**
     * Returns an ImageIcon containing the provided location at the the provided zoom level. This method will be
     * called by the GUI to obtain the image to be displayed
     * @param destination The destination that must be containing in the tile
     * @param zoom The zoom level for the requested tile
     * @return The requested tile as an ImageIcon
     */
    ImageIcon getTile(Destination destination, int zoom);
}