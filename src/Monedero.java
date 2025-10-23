import java.util.ArrayList;

public class Monedero {
    private final int maximo = 1000;
    private ArrayList<Billete> billetes = new ArrayList<>();

    public boolean esPosibleSuministrar(int tipo){
        return billetes.get(tipo).getCantidad() < maximo;
    }

    public void suministrar(int cantidad){
        billetes.
    }

    public void devolverCantidadIntroducida(){

    }

    public int cantidadIntroducida(){
        return 1;
    }
}
