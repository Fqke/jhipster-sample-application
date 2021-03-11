package fr.humanbooster.ar.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Categorie.
 */
@Entity
@Table(name = "categorie")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prix_en_euros")
    private Float prixEnEuros;

    @OneToMany(mappedBy = "categorie")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Article> articles = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Categorie nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPrixEnEuros() {
        return prixEnEuros;
    }

    public Categorie prixEnEuros(Float prixEnEuros) {
        this.prixEnEuros = prixEnEuros;
        return this;
    }

    public void setPrixEnEuros(Float prixEnEuros) {
        this.prixEnEuros = prixEnEuros;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public Categorie articles(Set<Article> articles) {
        this.articles = articles;
        return this;
    }

    public Categorie addArticles(Article article) {
        this.articles.add(article);
        article.setCategorie(this);
        return this;
    }

    public Categorie removeArticles(Article article) {
        this.articles.remove(article);
        article.setCategorie(null);
        return this;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Categorie)) {
            return false;
        }
        return id != null && id.equals(((Categorie) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Categorie{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            ", prixEnEuros=" + getPrixEnEuros() +
            "}";
    }
}
