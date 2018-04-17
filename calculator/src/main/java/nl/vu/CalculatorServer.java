package nl.vu;

import javax.xml.ws.Endpoint;

/**
 * @author lngtr
 * @since 2018-04-17
 */
public class CalculatorServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/calculator", new Calculator());
    }
}
