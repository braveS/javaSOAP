package registrationclientapplication;
import org.netbeans.xml.schema.newxmlschema.RegistraciaRequest;
import org.netbeans.xml.schema.newxmlschema.RegistraciaResponse;

public class RegistrationClientApplication {

    public static void main(String[] args) {
        
        try {
            RegistraciaRequest request = new RegistraciaRequest();
            request.setIdPrednasky("I-ASOS6");
            request.setIdUctu("idUctuStudenta1");
            RegistraciaResponse resp = registraciaWSDLOperation(request);
            System.out.println("StudentName: " + resp.getUcetAIS().getStudent().getMeno() + " " + resp.getUcetAIS().getStudent().getPriezvisko());
            System.out.println("LessonName: " + resp.getPredmet().getNazov());
            System.out.println("LessonTime: " + resp.getPredmet().getCasPrednasok());
            System.out.println("Lecturer Name: " + resp.getPredmet().getPrednasajuci().getUcitel().getMeno() + " " + resp.getPredmet().getPrednasajuci().getUcitel().getPriezvisko());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static org.netbeans.xml.schema.newxmlschema.RegistraciaResponse registraciaWSDLOperation(org.netbeans.xml.schema.newxmlschema.RegistraciaRequest input) {
        org.netbeans.j2ee.wsdl.wsdl.wsdl.registraciawsdl.RegistraciaWSDLService service = new org.netbeans.j2ee.wsdl.wsdl.wsdl.registraciawsdl.RegistraciaWSDLService();
        org.netbeans.j2ee.wsdl.wsdl.wsdl.registraciawsdl.RegistraciaWSDLPortType port = service.getRegistraciaWSDLPort();
        return port.registraciaWSDLOperation(input);
    }
    
}
