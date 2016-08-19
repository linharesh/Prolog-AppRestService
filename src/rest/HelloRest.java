package rest;

 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/hellorest")
public class HelloRest {

	@GET
	@Produces("text/plain")
	public String helloRest() {
		return "Hello, Rest !";
	}
}