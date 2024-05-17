/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalecognomestudente;

/**
 *
 * @author samue
 */
public abstract class personale {
    
    String nome;
    String cognome;
    int indirizzo;
    int telefono;
    double soldi;
    
    personale(String nome, String cognome,int indirizzo,int telefono,double soldi){
        this.nome=nome;
        this.cognome=cognome;
        this.indirizzo=indirizzo;
        this.telefono=telefono;
        this.soldi=soldi;
}

    public void stampaDati()
    {
        System.out.println(nome);
        System.out.println(cognome);
        System.out.println(indirizzo);
        System.out.println(telefono);
    } 
    
    public abstract double paga();
}
