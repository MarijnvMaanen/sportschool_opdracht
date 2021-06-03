package webservices;

import klassen.Lid;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("leden")
public class LijstLedenResource {

    @GET
    @Produces("application/json")
    public String getLeden(){
        JsonArrayBuilder jab = Json.createArrayBuilder();

      for(Lid l : Lid.alleLeden){
          JsonObjectBuilder job = Json.createObjectBuilder();
          job.add("naam: ", l.getNaam());
          jab.add(job);
      }
        JsonArray array = jab.build();
      return array.toString();
    }

}
