package au.com.privitar;

import au.com.privitar.health.SCHealthCheck;
import au.com.privitar.resources.SCResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by Andrew Todd on 29/08/2014.
 */
public class SCService extends Application<SCConfig> {

    public static void main(String[] args) throws Exception {
        new SCService().run(args);
    }

    @Override
    public String getName() {
        return "Savings Calculator";
    }

    @Override
    public void initialize(Bootstrap<SCConfig> bootstrap) {

    }

    @Override
    public void run(SCConfig conf, Environment env) throws Exception {

        SCResource resource = new SCResource(conf);

        final SCHealthCheck healthCheck = new SCHealthCheck();

        env.healthChecks().register("Savings Calculator", healthCheck);
        env.jersey().register(resource);
    }
}
