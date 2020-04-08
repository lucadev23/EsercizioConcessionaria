package javaesercizioconcessionaria;
/**
 * @author github - lucadev23
 */
public class Veicolo implements Comparable{
    protected String targa;
    protected String marca;
    protected String modello;
    protected int cilindrata;
    protected int anno;
    protected int prezzo;
    
    /* Costruttori */
    public Veicolo(){
        this.targa=null;
        this.marca=null;
        this.modello=null;
        this.cilindrata=-1;
        this.anno=-1;
        this.prezzo=-1;
    }
    
    public Veicolo(String targa, String marca, String modello, int cilindrata, int anno, int prezzo){
        if(targa.length()==0) this.targa=null;
        else this.targa=targa;
        if(marca.length()==0) this.marca=null;
        else this.marca=marca;
        if(modello.length()==0) this.modello=null;
        else this.modello=modello;
        if(cilindrata<0) this.cilindrata=-1;
        else this.cilindrata=cilindrata;
        this.anno=anno; /* sti cazzi */
        if(prezzo<0) this.prezzo=-1;
        else this.prezzo=prezzo;
    }
    
    public Veicolo(Veicolo v){
        this.targa=v.getTarga();
        this.marca=v.getMarca();
        this.modello=v.getModello();
        this.cilindrata=v.getCilindrata();
        this.anno=v.getAnno();
        this.prezzo=v.getPrezzo();
    }
    
    /* Metodi Override */
    @Override
    public boolean compareTo(Veicolo v){
        if(v.getPrezzo()<0 || this.prezzo<0 || this.prezzo>v.prezzo)
            return false;
        return true; /* se this.prezzo <= v.prezzo */
    }
    
    @Override
    public String toString(){
        return "Marca: "+this.marca+", Modello: "+this.modello+", Cilindrata: "+this.cilindrata+", Anno: "+this.anno+", Prezzo: "+this.prezzo;
    }
    
    /* Metodi Setter */
    public void setTarga(String targa){
        if(targa.length()==0) this.targa=null;
        else this.targa=targa;
    }
    public void setMarca(String marca){
        if(marca.length()==0) this.marca=null;
        else this.marca=marca;
    }
    public void setModello(String modello){
        if(modello.length()==0) this.modello=null;
        else this.modello=modello;
    }
    public void setCilindrata(int cilindrata){
        if(cilindrata<0) this.cilindrata=-1;
        else this.cilindrata=cilindrata;
    }
    public void setAnno(int anno){
        this.anno=anno;
    }
    public void setPrezzo(int prezzo){
        if(prezzo<0) this.prezzo=-1;
        else this.prezzo=prezzo;
    }
    
    /* Metodi Getter */
    public String getTarga(){
        return this.targa;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public int getCilindrata(){
        return this.cilindrata;
    }
    public int getAnno(){
        return this.anno;
    }
    public int getPrezzo(){
        return this.prezzo;
    }
}
