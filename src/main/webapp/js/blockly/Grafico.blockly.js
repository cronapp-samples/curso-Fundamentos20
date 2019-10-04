window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Grafico = window.blockly.js.blockly.Grafico || {};

/**
 * Grafico
 */
window.blockly.js.blockly.Grafico.popular = function() {
 var item, dados, i, legenda, serie;
  dados = this.cronapi.screen.getValueOfField('custoMedioKm.data');
  legenda = [];
  serie = [];
  for (var i_index in dados) {
    i = dados[i_index];
    legenda.push(this.cronapi.object.getObjectField(i, 'carro_modelo'));
    serie.push(this.cronapi.object.getObjectField(i, 'divide'));
  }
  this.cronapi.chart.createChart("chart-custokm", 'bar', legenda, null, this.cronapi.chart.createDataset('custoKm', serie, null));
}
