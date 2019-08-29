window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Abastecimento = window.blockly.js.blockly.Abastecimento || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Abastecimento.confirmar = function() {
 var item, valido;
  if (this.blockly.js.blockly.Abastecimento.calcularValidar()) {
    this.cronapi.screen.post("Abastecimento");
  } else {
    this.cronapi.screen.notify('error','Dados inválidos!!');
  }
}

/**
 * Abastecimento
 */
window.blockly.js.blockly.Abastecimento.calcularValidar = function() {
 var item, valido;
  valido = false;
  this.cronapi.screen.changeValueOfField("Abastecimento.active.litros", this.cronapi.screen.getValueOfField("Abastecimento.active.valor") / this.cronapi.screen.getValueOfField("Abastecimento.active.precoLitro"));
  this.cronapi.screen.changeValueOfField("Abastecimento.active.KmPorLitro", this.cronapi.screen.getValueOfField("Abastecimento.active.km") / this.cronapi.screen.getValueOfField("Abastecimento.active.litros"));
  this.cronapi.screen.changeValueOfField("Abastecimento.active.custoKm", this.cronapi.screen.getValueOfField("Abastecimento.active.valor") / this.cronapi.screen.getValueOfField("Abastecimento.active.km"));
  if (this.cronapi.screen.getValueOfField("Abastecimento.active.valor") > 1000) {
    this.cronapi.screen.notify('error','Valor abastecido é muito alto');
    this.cronapi.screen.disableComponent("btn_crud_post41107");
  } else if (this.cronapi.screen.getValueOfField("Abastecimento.active.litros") > 200) {
    this.cronapi.screen.notify('error','Quantidade de litros é muito alta !!');
    this.cronapi.screen.disableComponent("btn_crud_cancel41107");
  } else {
    valido = true;
    this.cronapi.screen.enableComponent("btn_crud_post41107");
  }
  return valido;
}
