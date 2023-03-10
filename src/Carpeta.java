
import java.util.ArrayList;

public class Carpeta {
private String name,link;
private ArrayList<Carpeta> carpets;
private ArrayList<Archivo> archivos;

    public Carpeta(String name, String link, ArrayList<Carpeta> carpets, ArrayList<Archivo> archivos) {
        this.name = name;
        this.link = link;
        this.carpets = carpets;
        this.archivos = archivos;
    }

    public Carpeta() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Carpeta> getCarpets() {
        return carpets;
    }

    public void setCarpets(ArrayList<Carpeta> carpets) {
        this.carpets = carpets;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return link;
    }
     public String toStringname() {
        return  name ;
    }
}
