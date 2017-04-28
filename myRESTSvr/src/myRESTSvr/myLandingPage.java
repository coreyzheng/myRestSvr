package myRESTSvr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/landing-page")
public class myLandingPage 
{
 	  @GET
	  @Produces("application/json")
	   public Response welcome() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("App-1", "simple demo"); 
		jsonObject.put("App-2", "advanced demo");
		jsonObject.put("App-3", "complex demo");
 
		String result = "@Produces(\"application/json\") Output: \n\nWelcome to myREST Service: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
 }