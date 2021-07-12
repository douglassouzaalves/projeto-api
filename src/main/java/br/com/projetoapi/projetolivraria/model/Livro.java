package br.com.projetoapi.projetolivraria.model;


public class Livro {

    private Long livroId;
    private String titulo;
    private String isbn;
    private String autor;
    private String editora;
    private Integer edicao;


    public Long getLivroId() {
        return livroId;
    }


    public void setLivroId(Long livroId) {
        this.livroId = livroId;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getEditora() {
        return editora;
    }


    public void setEditora(String editora) {
        this.editora = editora;
    }


    public Integer getEdicao() {
        return edicao;
    }


    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }


}
