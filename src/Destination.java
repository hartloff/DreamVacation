import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

/**
 * A class used to store the information defining a destination: _id, name, description, latitude, longitude
 */
public class Destination{


    /*** There is no need to edit this file ***/


    private String _id;
    private String name;
    private String description;
    private double latitude;
    private double longitude;


    public Destination(String name, String description, double latitude, double longitude){
        this.name = name;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Instantiate a new Destination from a JSON String in the format:
     * {"_id":"5904071ef7bb478f7d08371d", "name":"University at Buffalo", "description":"Not really a vacation..",
     * "latitude":43.002808, "longitude":-78.787028}
     * @param jsonDest a JSON object representing a Destination
     */
    public Destination(String jsonDest){
        JsonObject obj = Json.parse(jsonDest).asObject();
        this._id = obj.get("_id").asString();
        this.name = obj.get("name").asString();
        this.description = obj.get("description").asString();
        this.latitude = obj.get("latitude").asDouble();
        this.longitude = obj.get("longitude").asDouble();
    }


    /**
     * Use to assist debugging or display Destination information
     */
    public void printDetails(){
        System.out.println("Destination{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}');
    }

    @Override
    public String toString(){
        return name;
    }


    /** Getters and Setters **/

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public String get_id(){
        return _id;
    }

    public void set_id(String _id){
        this._id = _id;
    }


}
