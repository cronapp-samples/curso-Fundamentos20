package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Posto {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// Posto
public static Var aposInserir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Noticias"),Var.valueOf("data",cronapi.dateTime.Operations.getNow()),Var.valueOf("noticia",Var.valueOf(Var.valueOf("Foi cadastrado um novo posto: ").toString() + cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("posto")).toString())));
    return Var.VAR_NULL;
   }
 }.call();
}

}

