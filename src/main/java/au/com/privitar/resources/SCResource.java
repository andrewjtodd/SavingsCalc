package au.com.privitar.resources;

import au.com.privitar.SCConfig;
import au.com.privitar.core.SCAnswer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by Andrew Todd on 29/08/2014.
 */
@Path("/calculate")
@Produces(MediaType.APPLICATION_JSON)
public class SCResource {
    private final SCConfig config;

    public SCResource(SCConfig config) {
        this.config = config;
    }

    @GET
    public double getAnswer(@QueryParam("unitPrice") double price, @QueryParam("units") double units) {
        System.out.println("Unit Price: " + price);
        System.out.println("Units: " + units);
        SCAnswer answer = new SCAnswer(config);

        return answer.calculate(price, units);

    }
}
