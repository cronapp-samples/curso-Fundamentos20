package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Abastecimento {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// Abastecimento
public static Var consumoKmPorLiitro(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.math.Operations.divisor(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")),cronapi.math.Operations.divisor(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("valor")),cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("precoLitro"))));
   }
 }.call();
}

/**
 *
 * @param Entidade
 * @return Var
 */
// Abastecimento
public static Var custoKm(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.math.Operations.divisor(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("valor")),cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")));
   }
 }.call();
}

/**
 *
 * @param Entidade
 * @return Var
 */
// Abastecimento
public static Var litros(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.math.Operations.divisor(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("valor")),cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("precoLitro")));
   }
 }.call();
}

}

