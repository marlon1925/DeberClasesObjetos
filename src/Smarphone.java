public class Smarphone {
//attributes

    String marca, modelo, color;
    int anio;

    // metodos

    public void velocidadProsesamiento(){}
    public void camara(){}
    public void sonido(){}
    public void tiempoCarga(){}

    public Smarphone() {
        marca = "Xiaomi";
        modelo = "Poco X3";
        color = "Azul";
        anio = 2020;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
