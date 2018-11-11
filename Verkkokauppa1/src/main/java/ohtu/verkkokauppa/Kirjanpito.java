package ohtu.verkkokauppa;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
// Autowired ei tarvita tässä, koska konstruktoriparametria ei ole
// import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Kirjanpito {
    
    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
