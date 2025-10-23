public class Billete {
    private String billete;
    private String papel;
    private int cantidad;

    public Billete(String billete, String papel, int cantidad){
        this.billete = billete;
        this.papel = papel;
        this.cantidad = cantidad;
    }

    public void agregarBilletes(int cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
        return;
    }

    public String getBillete(){
        return this.billete;
    }

    public void setBillete(String billete) {
        this.billete = billete;
    }

    public String getPapel(){
        return this.papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
