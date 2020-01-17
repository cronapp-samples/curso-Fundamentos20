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
 * @return Var
 */
// Posto
public static Var top5() throws Exception {
 return new Callable<Var>() {

   private Var dados = Var.VAR_NULL;
   private Var lista5 = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var i_start = Var.VAR_NULL;
   private Var i_end = Var.VAR_NULL;
   private Var i_inc = Var.VAR_NULL;

   public Var call() throws Exception {
    dados = cronapi.database.Operations.query(Var.valueOf("app.entity.Posto"),Var.valueOf("select p from Posto p    order by p.custo_km asc"));
    lista5 = cronapi.list.Operations.newList();
    i_start = Var.valueOf(1);
    i_end = Var.valueOf(5);
    i_inc = Var.valueOf(1);
    if (i_start.greaterThan(i_end)) {
        i_inc.multiply(-1);
    }
    for (i = Var.valueOf(i_start);
        i_inc.getObjectAsInt() >= 0 ? i.getObjectAsLong() <= i_end.getObjectAsLong() : i.getObjectAsLong()  >= i_end.getObjectAsLong();
    i.inc(i_inc))  {
        if (cronapi.database.Operations.hasElement(dados).getObjectAsBoolean()) {
            cronapi.list.Operations.addLast(lista5,cronapi.map.Operations.createObjectMapWith(Var.valueOf("posto",cronapi.database.Operations.getField(dados, Var.valueOf("this[0].posto"))) , Var.valueOf("lat",cronapi.database.Operations.getField(dados, Var.valueOf("this[0].coord_lat"))) , Var.valueOf("long",cronapi.database.Operations.getField(dados, Var.valueOf("this[0].coord_long"))) , Var.valueOf("preco_litro",cronapi.database.Operations.getField(dados, Var.valueOf("this[0].preco_litro"))) , Var.valueOf("custo_km",cronapi.database.Operations.getField(dados, Var.valueOf("this[0].custo_km")))));
        }
        cronapi.database.Operations.next(dados);
    } // end for
    System.out.println(lista5.getObjectAsString());
    return lista5;
   }
 }.call();
}

}

