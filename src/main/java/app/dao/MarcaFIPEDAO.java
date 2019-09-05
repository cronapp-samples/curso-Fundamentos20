package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("MarcaFIPEDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MarcaFIPEDAO extends JpaRepository<MarcaFIPE, java.lang.String> {

  /**
   * Obtém a instância de MarcaFIPE utilizando os identificadores
   * 
   * @param key
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM MarcaFIPE entity WHERE entity.key = :key")
  public MarcaFIPE findOne(@Param(value="key") java.lang.String key);

  /**
   * Remove a instância de MarcaFIPE utilizando os identificadores
   * 
   * @param key
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM MarcaFIPE entity WHERE entity.key = :key")
  public void delete(@Param(value="key") java.lang.String key);



}
