package au.com.privitar;

import au.com.privitar.config.CalculationsConfig;
import io.dropwizard.Configuration;

import javax.validation.Valid;

/**
 * Created by Andrew Todd on 29/08/2014.
 */
public class SCConfig extends Configuration {

    @Valid
    private CalculationsConfig calculations;

    public CalculationsConfig getCalculations() {
        return calculations;
    }

    public void setCalculations(CalculationsConfig calculations) {
        this.calculations = calculations;
    }
}
