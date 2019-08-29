package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * @param nome
 * @param email
 * @param param_senha
 * @param confirmasenha
 * @return Var
 */
// Usuario
public static Var criarUsuario(Var nome, Var email, Var param_senha, Var confirmasenha) throws Exception {
 return new Callable<Var>() {

   // param
   private Var senha = param_senha;
   // end

   public Var call() throws Exception {
    if (Var.valueOf(senha.equals(confirmasenha)).getObjectAsBoolean()) {
        cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",senha),Var.valueOf("name",nome),Var.valueOf("login",email),Var.valueOf("email",email));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Usuário cadastrado com sucesso!"));
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("campos senha e confirmação estão diferentes!"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var dadosUsuario = Var.VAR_NULL;

   public Var call() throws Exception {
    dadosUsuario = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    return cronapi.database.Operations.getField(dadosUsuario, Var.valueOf("this[0].id"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterLoginUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var senha = Var.VAR_NULL;
   private Var confirmasenha = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;
   private Var email = Var.VAR_NULL;
   private Var dadosUsuario = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

