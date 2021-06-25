package aula4.ex3;

public class Book {
    /*
    Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser:
    public String toString (). Este método deve retornar uma string que representa o objeto. Por exemplo: se a classe
    tiver os atributos: título, isbn e autor, uma string representando um livro poderia ser: "Harry Potter,
    9780545582889, Rowling, J. K.". A classe conterá um construtor padrão, um construtor com parâmetros e os métodos de
    acesso.
    Adicione a linha @Override logo acima do cabeçalho do método toString. Em seguida, renomeie o método para: tostring
    (tudo em letras minúsculas). O que acontece?
     */

    private String titulo;
    private Integer ano;
    private String autor;
    private String editora;

    public Book() {
    }

    public Book(String titulo, Integer ano, String autor, String editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
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

//    @Override
    /*
    Ao adicionar o @Override e mudar o nome do método de toString para tostring a IDE já nos mostra um erro
    dizendo que não estamos sobrescrevendo nenhum método da superclasse
     */
    public String tostring() {
        return titulo + " - " + autor + " - " + editora + ", " + ano;
    }
}
