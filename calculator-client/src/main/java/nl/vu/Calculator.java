
package nl.vu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://vu.nl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://vu.nl/", className = "nl.vu.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://vu.nl/", className = "nl.vu.AddResponse")
    @Action(input = "http://vu.nl/Calculator/addRequest", output = "http://vu.nl/Calculator/addResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://vu.nl/", className = "nl.vu.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://vu.nl/", className = "nl.vu.SubResponse")
    @Action(input = "http://vu.nl/Calculator/subRequest", output = "http://vu.nl/Calculator/subResponse")
    public double sub(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://vu.nl/", className = "nl.vu.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://vu.nl/", className = "nl.vu.MulResponse")
    @Action(input = "http://vu.nl/Calculator/mulRequest", output = "http://vu.nl/Calculator/mulResponse")
    public double mul(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://vu.nl/", className = "nl.vu.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://vu.nl/", className = "nl.vu.DivResponse")
    @Action(input = "http://vu.nl/Calculator/divRequest", output = "http://vu.nl/Calculator/divResponse")
    public double div(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
