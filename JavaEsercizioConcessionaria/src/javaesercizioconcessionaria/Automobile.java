package javaesercizioconcessionaria;

/**
 *
 * @author github - lucadev23
 */
public class Automobile extends Veicolo{
    
    private int porte;
    private int posti;
    
    /* Costruttori */
    public Automobile(String targa, String marca, String modello, int cilindrata, int anno, int prezzo,int porte, int posti){
        super(targa, marca, modello, cilindrata, anno, prezzo);
        if(porte<0) this.porte=-1;
        else this.porte=porte;
        if(posti<0) this.posti=-1;
        else this.posti=posti;
    }
    public Automobile(Veicolo v, int porte, int posti){
        super(v);
        if(porte<0) this.porte=-1;
        else this.porte=porte;
        if(posti<0) this.posti=-1;
        else this.posti=posti;
    }
    public Automobile(){
        super();
        this.porte=-1;
        this.posti=-1;
    }
    
    /* Metodi Override */
    
    @Override
    public String toString(){
       return "Marca: "+this.marca+", Modello: "+this.modello+", Cilindrata: "+this.cilindrata+", Anno: "+this.anno+", Porte: "+this.porte+", Posti: "+this.posti+", Prezzo: "+this.prezzo;
    }

    /* Metodi Setter */
    public boolean setPorte(int porte){
        if(porte<0) return false;
        this.porte=porte;
        return true;
    }
    public boolean setPosti(int posti){
        if(posti<0) return false;
        this.posti=posti;
        return true;
    }
    
    /* Metodi Getter */
    public int getPorte(){
        return this.porte;
    }
    public int getPosti(){
        return this.posti;
    }
    
}
