package com.libreria.LibreriaSpringBoot.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    private String titulo;

    private String editorial;

    @Column(name = "fecha_publicacion")
    private Date publicacion;

    @Column(name = "id_autor")
    private Integer idAutor;

    @ManyToOne
    @JoinColumn(name = "id_autor", insertable = false, updatable = false)
    private Autor autor;

    @OneToMany(mappedBy = "libro")
    private List<CopiaLibro> copiaLibro;

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

}
