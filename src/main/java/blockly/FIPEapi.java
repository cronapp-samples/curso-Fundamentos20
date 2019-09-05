package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FIPEapi {

public static final int TIMEOUT = 300;

/**
 *
 * @param param_Dados
 * @return Var
 */
// FIPEapi
public static Var contarMarcas(Var param_Dados) throws Exception {
 return new Callable<Var>() {

   // param
   private Var Dados = param_Dados;
   // end

   public Var call() throws Exception {
    Dados = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf("http://fipeapi.appspot.com/api/1/carros/marcas.json"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    return cronapi.list.Operations.size(Dados);
   }
 }.call();
}

/**
 *
 * @param param_Dados
 * @return Var
 */
// FIPEapi
public static Var obterMarcas(Var param_Dados) throws Exception {
 return new Callable<Var>() {

   // param
   private Var Dados = param_Dados;
   // end

   public Var call() throws Exception {
    Dados = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf("http://fipeapi.appspot.com/api/1/carros/marcas.json"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    System.out.println(Dados.getObjectAsString());
    return Dados;
   }
 }.call();
}

}

