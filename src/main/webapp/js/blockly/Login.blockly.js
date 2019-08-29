window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Login = window.blockly.js.blockly.Login || {};

/**
 * Login
 */
window.blockly.js.blockly.Login.abrirCadastro = function() {

  this.cronapi.screen.showModal("modal37489");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.fecharCadastro = function() {

  this.cronapi.screen.hideModal("modal37489");
}
