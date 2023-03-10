public class Archivo {
private String nombre,link,extension;
private double peso;

    public Archivo(String nombre, String link, String extension, double peso) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.peso = peso;
    }

    public Archivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return link;
    }
     public String toStringname() {
        return  nombre ;
    }
}
