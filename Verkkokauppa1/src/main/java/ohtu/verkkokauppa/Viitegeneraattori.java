package ohtu.verkkokauppa;
import org.springframework.stereotype.Component;

// Autowired ei tarvita tässä, koska konstruktoriparametria ei ole
// import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Viitegeneraattori implements IntViitegeneraattori {
    
    private int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
