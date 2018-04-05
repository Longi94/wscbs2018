package nl.vu;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author lngtr
 * @since 2018-04-05
 */
@WebService
public class CalculatorService {

    @WebMethod
    public double add(double a, double b) {
        return a + b;
    }

    @WebMethod
    public double sub(double a, double b) {
        return a - b;
    }

    @WebMethod
    public double mul(double a, double b) {
        return a * b;
    }

    @WebMethod
    public double div(double a, double b) {
        return a / b;
    }
}
