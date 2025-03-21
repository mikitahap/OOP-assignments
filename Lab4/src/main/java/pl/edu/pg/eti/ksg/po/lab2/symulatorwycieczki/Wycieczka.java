package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

import java.util.ArrayList;
import java.util.List;

 
public class Wycieczka {
    private String nazwa;
    private List<ElementWycieczki> elementy = new ArrayList<>();

    public Wycieczka(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public void dodajElementWycieczki(ElementWycieczki elementWycieczki) {
        elementy.add(elementWycieczki);
    }
    
     
    public double getDlugosc() {
        return elementy.stream()
                .filter(ew -> ew instanceof Wedrowka)
                .map(ew -> (Wedrowka)ew)
                .map(Wedrowka::getOdleglosc)
                .reduce(0.0, Double::sum);
    }
    
 
 
 
 
 
 
 
 
 
 
    
    public ElementWycieczki getElementWycieczki(int i) {
        return elementy.get(i);
    }
    
    public int getLiczbaElementowWycieczki() {
        return elementy.size();
    }

    public String getNazwa() {
        return nazwa;
    }
   
    
    @Override
    public String toString() {
        return "Wycieczka \"" + nazwa + "\", długość: "+ getDlugosc() + " GOT,"
 
                ;
    }
    
    
}
