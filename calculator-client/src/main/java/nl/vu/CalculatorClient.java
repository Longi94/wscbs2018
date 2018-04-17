package nl.vu;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lngtr
 * @since 2018-04-05
 */
public class CalculatorClient {

    public static void main(String[] args) throws MalformedURLException {
        if (args.length == 0) {
            System.out.println("Usage missing wsdl url parameter");
        }

        URL url = new URL(args[0]);

        QName qName = new QName("http://vu.nl/", "CalculatorService");
        Service service = CalculatorService.create(url, qName);

        Calculator calculator = service.getPort(Calculator.class);

        System.out.println("Calling add(), result:");
        System.out.println(calculator.add(3.0, 2.0));
        System.out.println("Calling sub(), result:");
        System.out.println(calculator.sub(3.0, 2.0));
        System.out.println("Calling mul(), result:");
        System.out.println(calculator.mul(3.0, 2.0));
        System.out.println("Calling div(), result:");
        System.out.println(calculator.div(1.0, 2.0));
    }
}
