package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela NOTICIAS
 * @generated
 */
@Entity
@Table(name = "\"NOTICIAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Noticias")
public class Noticias implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "noticia", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String noticia;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
  
  private java.util.Date data;

  /**
   * Construtor
   * @generated
   */
  public Noticias(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Noticias setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém noticia
   * return noticia
   * @generated
   */
  
  public java.lang.String getNoticia(){
    return this.noticia;
  }

  /**
   * Define noticia
   * @param noticia noticia
   * @generated
   */
  public Noticias setNoticia(java.lang.String noticia){
    this.noticia = noticia;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Noticias setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Noticias object = (Noticias)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
