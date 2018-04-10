# Calculator

## Deployment with tomcat

Build a war artifact using using maven: `mvn install`.

Place the war file inside tomcat's webapps folder and start tomcat to start the web service.

## Using the service

The WSDL will be availble under `<Tomcat address>/<deployed service name>/calculator?wsdl`, which can be used to generate a client for a programming language of your choice. For example to generate Java code you can use wsimport: `wsimport -keep <WSDL url>`.

### Example Java Client

```java
URL url = new URL("URL TO WSDL");

QName qName = new QName("http://vu.nl/", "CalculatorService");
Service service = CalculatorService.create(url, qName);

Calculator calculator = service.getPort(Calculator.class);

System.out.println(calculator.add(3.0, 2.0));
System.out.println(calculator.sub(3.0, 2.0));
System.out.println(calculator.mul(3.0, 2.0));
System.out.println(calculator.div(1.0, 2.0));
```