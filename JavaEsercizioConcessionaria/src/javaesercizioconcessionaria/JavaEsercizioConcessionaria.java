package javaesercizioconcessionaria;

/**
 *
 * @author github - lucadev23
 */
public class JavaEsercizioConcessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veicolo v1,v2;
        Automobile a1;
        v1 = new Veicolo("AV062EH", "Fiat", "Punto", 1200, 1992, 2000);
        System.out.println(v1.toString());
        v2 = new Veicolo("AV062EH", "Fiat", "Punto", 1200, 1992, 1800);
        if(v1.compareTo(v2)){
            System.out.println("Conviene v1");
        }
        else{
            System.out.println("Conviene v2");    
        }
        a1 = new Automobile(v1,2,3);
        System.out.println(a1.toString());
        System.out.println(a1.getAnno());
        if(a1.compareTo(v2)){
            System.out.println("Conviene a1");
        }
        else{
            System.out.println("Conviene v2");    
        }
    }
    
}
