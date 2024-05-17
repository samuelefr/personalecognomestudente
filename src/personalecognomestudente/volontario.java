package personalecognomestudente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samue
 */
public abstract class volontario extends personale {
    
     volontario(String nome, String cognome, int indirizzo, int telefono,double soldi) 
     {
        super(nome, cognome, indirizzo, telefono, soldi);
     }
     
    @Override
    public double paga() //dato che siamo nella classe volontario modifico lo scopo della funzione paga
     {
        return soldi=0;
     }
     
    
}
