package br.com.guideveloper.music.modelos;

public class Audio {
    private String titulo;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

}
