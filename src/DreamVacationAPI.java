import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import java.io.IOException;
import java.util.ArrayList;

public class DreamVacationAPI{

    /*** Call these static methods to connect to the Dream Vacation API ***/

    /*** There is no need to edit this file ***/


    private static final String API_LINK = "http://fury.cse.buffalo.edu/dreamVacation/";

    /**
     * Connects to the API to retrieve a list of all destinations
     * @return and ArrayList containing every Destination from the API
     */
    public static ArrayList<Destination> getDestinations(){
        ArrayList<Destination> allDestinations = new ArrayList<>();
        String response = getRequest(API_LINK + "getAllDestinations");
        JsonArray array = Json.parse(response).asArray();
        for(JsonValue value : array){
            allDestinations.add(new Destination(value.toString()));
        }
        return allDestinations;
    }


    /**
     * Adds a Destination to the API
     * @param destination The Destination to be added
     */
    public static void addDestination(Destination destination){
        JsonObject jsonDestination = new JsonObject();
        jsonDestination.add("name", destination.getName());
        jsonDestination.add("description", destination.getDescription());
        jsonDestination.add("latitude", destination.getLatitude());
        jsonDestination.add("longitude", destination.getLongitude());

        String response = postRequest(API_LINK + "addDestination", jsonDestination.toString());
        System.out.println(response);
    }


    /**
     * Returns all the comments for a destination
     * @param id the _id of the destination
     * @return An ArrayList containing all the chat messages as elements
     */
    public static ArrayList<String> getComments(String id){
        ArrayList<String> comments = new ArrayList<>();
        String response = getRequest(API_LINK + "getChat?id=" + id);
        JsonArray commentsArray = Json.parse(response).asArray();
        for(JsonValue commentValue : commentsArray){
            comments.add(commentValue.asString());
        }
        return comments;
    }


    /**
     * Adds a comment to the API
     * @param id The _id of the destination being commented
     * @param username The username of the user posting the comment
     * @param comment The comment being posted
     */
    public static void postComment(String id, String username, String comment){
        JsonObject jsonComment = new JsonObject();
        jsonComment.add("_id", id);
        jsonComment.add("username", username);
        jsonComment.add("comment", comment);

        postRequest(API_LINK + "addComment", jsonComment.toString());
    }



    private static String getRequest(String url){
        String response = "";

        try{
            response = Request.Get(url).execute().returnContent().asString();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        return response;
    }


    private static String postRequest(String url, String params){
        String response = "";

        try{
            response = Request.Post(url)
                    .bodyString(params, ContentType.APPLICATION_JSON)
                    .execute().returnContent().asString();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        return response;
    }


}
