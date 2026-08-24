import java.util.ArrayList;

public class Anime {
    private long id;
    private String titulo;
    private ArrayList<String> generos = new ArrayList<>();
    private String nivelJlpt;
    private String sinopse;
    private String imagemUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public String getNivelJlpt() {
        return nivelJlpt;
    }

    public void setNivelJlpt(String nivelJlpt) {
        this.nivelJlpt = nivelJlpt;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}
