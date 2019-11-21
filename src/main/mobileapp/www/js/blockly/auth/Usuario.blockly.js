window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.auth = window.blockly.js.blockly.auth || {};
window.blockly.js.blockly.auth.Usuario = window.blockly.js.blockly.auth.Usuario || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.auth.Usuario.fecharCadastro = function() {
 var item, sucesso;
  this.cronapi.screen.hideIonicModal("modal2028");
}

/**
 * Usuario
 */
window.blockly.js.blockly.auth.Usuario.abrirCadastro = function() {
 var item, sucesso;
  this.cronapi.screen.showIonicModal("modal2028");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.auth.Usuario.cadastrar = function() {
 var item, sucesso;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Usuario:criarUsuario', function(sender_sucesso) {
      sucesso = sender_sucesso;
    if (sucesso) {
      this.cronapi.screen.hideIonicModal("modal2028");
    }
  }.bind(this), this.cronapi.screen.getValueOfField("vars.nome"), this.cronapi.screen.getValueOfField("vars.email"), this.cronapi.screen.getValueOfField("vars.senha"), this.cronapi.screen.getValueOfField("vars.confirmaSenha"));
}
