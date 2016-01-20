package wsdl.service;
import java.util.List;
import javax.jws.WebService;
import org.netbeans.xml.schema.newxmlschema.Predmet;
import org.netbeans.xml.schema.newxmlschema.UcetAIS;
import java.util.ArrayList;
import org.netbeans.xml.schema.newxmlschema.Adresa;
import org.netbeans.xml.schema.newxmlschema.RegistraciaResponse;
import org.netbeans.xml.schema.newxmlschema.Student;
import org.netbeans.xml.schema.newxmlschema.Ucitel;

@WebService(serviceName = "RegistraciaWSDLService", portName = "RegistraciaWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.wsdl.wsdl.registraciawsdl.RegistraciaWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/WSDL/wsdl/RegistraciaWSDL", wsdlLocation = "WEB-INF/wsdl/WebServiceFromWSDL/RegistraciaWSDL.wsdl")
public class WebServiceFromWSDL {

    static List<Predmet> predmety;
    static List<UcetAIS> ucty;

    static {
        predmety = new ArrayList<>();
        Predmet p1 = new Predmet();
        p1.setCasPrednasok("13:00");
        p1.setNazov("ASOS");
        p1.setOdbor("MASUS");
        p1.setIdPredmetu("I-ASOS");
        predmety.add(p1);
        
        Predmet p2 = new Predmet();
        p2.setCasPrednasok("14:00");
        p2.setNazov("RZZ");
        p2.setOdbor("BIS");
        p2.setIdPredmetu("I-RZZ");
        predmety.add(p2);

        Ucitel u1 = new Ucitel();
        u1.setMeno("UcitelNameOne");
        u1.setPriezvisko("UcitelSurnameOne");
        u1.setEmail("email@ucitel.1");
        u1.setOsobneCislo("Ucitel01");
        u1.getPrednasky().add(p1);
        u1.getCvicenia().add(p2);
        
        Predmet.Prednasajuci pred = new Predmet.Prednasajuci();
        pred.setUcitel(u1);
        p1.setPrednasajuci(pred);

        Ucitel u2 = new Ucitel();
        u2.setMeno("UcitelNameTwo");
        u2.setPriezvisko("UcitelSurnameTwo");
        u2.setEmail("email@ucitel.2");
        u2.setOsobneCislo("Ucitel02");
        u2.getCvicenia().add(p1);
        u2.getCvicenia().add(p2);
        u2.getPrednasky().add(p2);

        Predmet.Prednasajuci pred2 = new Predmet.Prednasajuci();
        pred2.setUcitel(u2);
        p2.setPrednasajuci(pred2);
        
        Predmet.Cviciaci cvic = new Predmet.Cviciaci();
        cvic.getUcitel().add(u1);
        cvic.getUcitel().add(u2);
        p2.setCviciaci(cvic);
        
        Predmet.Cviciaci cvic2 = new Predmet.Cviciaci();
        cvic2.getUcitel().add(u2);
        p1.setCviciaci(cvic2);

        ucty = new ArrayList<>();
        Adresa a1 = new Adresa();
        a1.setObec("Bratislava");
        Adresa a2 = new Adresa();
        a2.setObec("Kosice");

        Student s1 = new Student();
        s1.setAdresa(a1);
        s1.setMeno("StudentNameOne");
        s1.setPriezvisko("StudentSurNameOne");

        Student s2 = new Student();
        s2.setAdresa(a2);
        s2.setMeno("StudentNameTwo");
        s2.setPriezvisko("StudentSurNameTwo");

        UcetAIS ais1 = new UcetAIS();
        ais1.setStudent(s1);
        ais1.setIdUctu("idUctuStudenta1");

        UcetAIS ais2 = new UcetAIS();
        ais2.setStudent(s2);
        ais2.setIdUctu("idUctuStudenta2");

        ucty.add(ais1);
        ucty.add(ais1);
    }

    public org.netbeans.xml.schema.newxmlschema.RegistraciaResponse registraciaWSDLOperation(org.netbeans.xml.schema.newxmlschema.RegistraciaRequest input) {
        RegistraciaResponse rr = new RegistraciaResponse();
        
        for (Predmet p : predmety) {
            if (p.getIdPredmetu().equals(input.getIdPrednasky())) {
                rr.setPredmet(p);
                break;
            }
        }

        for (UcetAIS u : ucty) {
            if (u.getIdUctu().equals(input.getIdUctu())) {
                rr.setUcetAIS(u);
                break;
            }
        }

        return rr;
    }
    
}
