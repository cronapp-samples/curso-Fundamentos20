window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbastecimentoMob = window.blockly.js.blockly.AbastecimentoMob || {};

/**
 * Abastecimento_mob
 */
window.blockly.js.blockly.AbastecimentoMob.Confirm = function() {

  this.cronapi.screen.changeValueOfField("Abastecimento.active.carro", this.cronapi.screen.getValueOfField("params.carroId"));
  this.cronapi.screen.post("Abastecimento");
}
