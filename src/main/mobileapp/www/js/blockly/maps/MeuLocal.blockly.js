window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.maps = window.blockly.js.blockly.maps || {};
window.blockly.js.blockly.maps.MeuLocal = window.blockly.js.blockly.maps.MeuLocal || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.maps.MeuLocal.desenharMapa = function() {
 var item, meulocal;
  meulocal = this.cronapi.maps.createLatLngPoint(this.cronapi.screen.getValueOfField("vars.lat"), this.cronapi.screen.getValueOfField("vars.long"));
  this.cronapi.maps.init("map3277", 'roadmap', meulocal, '16', function(sender_item) {
      item = sender_item;
    this.cronapi.maps.createMarker("map3277", 'meulocal', 'Você está aqui!! ', meulocal, '', 'Você está aqui!! ', '');
  }.bind(this));
}

/**
 * MeuLocal
 */
window.blockly.js.blockly.maps.MeuLocal.ObterCoordenadas = function() {
 var item, meulocal;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_meulocal) {
      meulocal = sender_meulocal;
    this.cronapi.screen.changeValueOfField("vars.lat", this.cronapi.object.getProperty(meulocal, 'coords.latitude'));
    this.cronapi.screen.changeValueOfField("vars.long", this.cronapi.object.getProperty(meulocal, 'coords.longitude'));
  }.bind(this), function(sender_meulocal) {
      meulocal = sender_meulocal;
    this.cronapi.screen.notify('error','Não foi possível obter as coordenadas');
  }.bind(this));
}
