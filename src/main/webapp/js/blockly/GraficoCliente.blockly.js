window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GraficoCliente = window.blockly.js.blockly.GraficoCliente || {};

/**
 * GraficoCliente
 */
window.blockly.js.blockly.GraficoCliente.Refresh = function() {

  this.cronapi.util.scheduleExecution(function() {
     this.cronapi.util.callServerBlocklyNoReturn('blockly.Grafico:popular');
  }.bind(this), 0, 5, 'seconds', 'true');
}
