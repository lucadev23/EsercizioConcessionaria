package javaesercizioconcessionaria;

/**
 *
 * @author github - lucadev23
 */
public class Concessionaria {
    
    private String nome;
    private int dim;
    private Veicolo[] lista;
    
    public Concessionaria(String nome, int dim){
        this.nome=nome;
        if(dim<0) this.dim=0;
        else this.dim=dim;
        lista = new Veicolo[dim];
    }
    
    public boolean aggiungiVeicolo(Veicolo v){
        int i;
        for(i=0;i<dim;i++){
            if(this.lista[i]==null){
                this.lista[i]=v;
                return true;
            }
        }
        return false;
    }
    
    public void trovaVeicoli(int costo){
        int i;
        for(i=0;i<dim;i++){
            if(this.lista[i]!=null && this.lista[i].getPrezzo()<=costo){
                System.out.println("Indice: "+(i+1)+", Veicolo-> "+this.lista[i].toString());
            }
            /* troverà sempre i veicoli con prezzo = -1 poichè non sono stati inizializzati correttamente */
        }
    }
    
    public int costo(){
        int tot=0,i;
        for(i=0;i<dim;i++){
            if(this.lista[i]!=null && this.lista[i].getPrezzo()!=-1){
                tot+=this.lista[i].getPrezzo();
            }
        }
        return tot;
    }
    
    public boolean rimuoviVeicolo(String targa){
        if(targa==null || targa.length()==0)
            return false;
        int i;
        for(i=0;i<dim;i++){
            if(this.lista[i]!=null && this.lista[i].getTarga()!=null && this.lista[i].getTarga().length()>0 && this.lista[i].getTarga().equalsIgnoreCase(targa)){
                this.lista[i]=null;
                return true;
            }
        }
        return false;
    }
    
    
}
