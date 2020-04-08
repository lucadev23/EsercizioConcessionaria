package javaesercizioconcessionaria;

/**
 *
 * @author github - lucadev23
 */
public class Autocarro extends Veicolo{
    
    private int carico;
    
    /* Costruttori */
    public Autocarro(String targa, String marca, String modello, int cilindrata, int anno, int prezzo,int carico){
        super(targa, marca, modello, cilindrata, anno, prezzo);
        if(carico<0) this.carico=-1;
        else this.carico=carico;
    }
    public Autocarro(Veicolo v, int carico){
        super(v);
        if(carico<0) this.carico=-1;
        else this.carico=carico;
    }
    public Autocarro(){
        super();
        this.carico=-1;
    }
    
    /* Metodi Override */
    @Override
    public String toString(){
        return "Marca: "+this.marca+", Modello: "+this.modello+", Cilindrata: "+this.cilindrata+", Anno: "+this.anno+", Carico: "+this.carico+", Prezzo: "+this.prezzo;
    }
    
    /* Metodi Setter */
    public boolean setCarico(int carico){
        if(carico<0) return false;
        this.carico=carico;
        return true;
    }
    
    /* Metodi Getter */
    public int getCarico(){
        return this.carico;
    }
    
}
