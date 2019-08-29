package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Home {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Home
public static Var mostrarFotoUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var foto = Var.VAR_NULL;

   public Var call() throws Exception {
    foto = cronapi.database.Operations.getField(cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.picture from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName())), Var.valueOf("this[0]"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.foto"), foto);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param foto
 */
// Descreva esta função...
public static void atualizarFotoUsuarioLogado(Var foto) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.User"), Var.valueOf("update User set picture = :picture where login = :login"),Var.valueOf("picture",foto),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.fotoUrl"), cronapi.database.Operations.getField(cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.picture from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName())), Var.valueOf("this[0]")));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Foto atualizada com sucesso!"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

