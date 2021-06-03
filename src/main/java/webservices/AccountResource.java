package webservices;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//DIT IS EEN TESTFILE
@Path("/demo")
public class AccountResource {

  @GET
  @Path("subpath")
  @Produces(MediaType.APPLICATION_JSON)
  public String methode(){
      JsonArrayBuilder builder = Json.createArrayBuilder();
      builder.add("test");
      //return "[ \"Hello world\"]";
      return builder.build().toString();
  }
/// /restservices/demo

//DIT IS EEN TESTFILE

}
