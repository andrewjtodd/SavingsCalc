package au.com.privitar.core;

import au.com.privitar.SCConfig;

/**
 * Created by Andrew Todd on 29/08/2014.
 */
public class SCAnswer {
    private SCConfig config;

    public SCAnswer(SCConfig config) {
        this.config = config;
    }

    public double calculate(double price, double units) {

        System.out.println("calculating the answer with base price of: " + config.getCalculations().getKwHCost());

        double answer = price * units;

        System.out.println("answer is: " + answer);

        return answer;
    }
}
