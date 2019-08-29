package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Carro {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// Carro
public static Var calculaConsumoMedioKmPorLitro(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var abastecimentos = Var.VAR_NULL;
   private Var consumomedioacumulado = Var.VAR_NULL;
   private Var registros = Var.VAR_NULL;

   public Var call() throws Exception {
    abastecimentos = cronapi.database.Operations.query(Var.valueOf("app.entity.Abastecimento"),Var.valueOf("select a from Abastecimento a where a.carro.id = :carroId"),Var.valueOf("carroId",cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("id"))));
    System.out.println(abastecimentos.getObjectAsString());
    consumomedioacumulado = Var.valueOf(0);
    registros = Var.valueOf(1);
    while (cronapi.database.Operations.hasElement(abastecimentos).getObjectAsBoolean()) {
        consumomedioacumulado = cronapi.math.Operations.sum(consumomedioacumulado,cronapi.math.Operations.divisor(cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].km")),cronapi.math.Operations.divisor(cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].valor")),cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].precoLitro")))));
        System.out.println(cronapi.math.Operations.divisor(cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].km")),cronapi.math.Operations.divisor(cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].valor")),cronapi.database.Operations.getField(abastecimentos, Var.valueOf("this[0].precoLitro")))).getObjectAsString());
        registros = cronapi.math.Operations.sum(registros,Var.valueOf(1));
        cronapi.database.Operations.next(abastecimentos);
    } // end while
    return cronapi.math.Operations.divisor(consumomedioacumulado,registros);
   }
 }.call();
}

}

