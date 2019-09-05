package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MARCAFIPE
 * @generated
 */
@Entity
@Table(name = "\"MARCAFIPE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.MarcaFIPE")
public class MarcaFIPE implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "key", nullable = true, insertable=true, updatable=true)
  private java.lang.String key = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "id", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "fipe_name", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fipe_name;

  /**
  * @generated
  */
  @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "order", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer order;

  /**
   * Construtor
   * @generated
   */
  public MarcaFIPE(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public MarcaFIPE setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém fipe_name
   * return fipe_name
   * @generated
   */
  
  public java.lang.String getFipe_name(){
    return this.fipe_name;
  }

  /**
   * Define fipe_name
   * @param fipe_name fipe_name
   * @generated
   */
  public MarcaFIPE setFipe_name(java.lang.String fipe_name){
    this.fipe_name = fipe_name;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public MarcaFIPE setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém order
   * return order
   * @generated
   */
  
  public java.lang.Integer getOrder(){
    return this.order;
  }

  /**
   * Define order
   * @param order order
   * @generated
   */
  public MarcaFIPE setOrder(java.lang.Integer order){
    this.order = order;
    return this;
  }

  /**
   * Obtém key
   * return key
   * @generated
   */
  
  public java.lang.String getKey(){
    return this.key;
  }

  /**
   * Define key
   * @param key key
   * @generated
   */
  public MarcaFIPE setKey(java.lang.String key){
    this.key = key;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MarcaFIPE object = (MarcaFIPE)obj;
    if (key != null ? !key.equals(object.key) : object.key != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((key == null) ? 0 : key.hashCode());
    return result;
  }

}
