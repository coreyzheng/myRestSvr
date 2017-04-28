package myRESTSvr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/tables/{tablename}")
public class myTables 
{
 	   @GET
 	   @Produces("application/json")
 	   public Response gettablebyname(@PathParam("tablename") String table_name) throws JSONException
 	   {
 			JSONObject jsonObject = new JSONObject();

 			if (table_name.equals("1"))
 			{
 			    jsonObject.put("tbl-1", "table 1"); 
 			}
 			else if (table_name.equals("2"))
 			{
 			    jsonObject.put("tbl-2", "table 2");
 			}
 			else if (table_name.equals("3"))
 			{
 			   jsonObject.put("tbl-3", "table 3");
 			}
 			else
 			{
  			   jsonObject.put("tbl-x", table_name);
 			}
 	 
 			String result = "@Produces(\"application/json\") Output: \n\n table: \n\n" + jsonObject;
 			return Response.status(200).entity(result).build();
 		} 	  
 }