window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.maps = window.blockly.js.blockly.maps || {};
window.blockly.js.blockly.maps.PostosMapa = window.blockly.js.blockly.maps.PostosMapa || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.maps.PostosMapa.desenharMapa = function() {
 var item, top5, meulocal, objPosto, i;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_meulocal) {
      meulocal = sender_meulocal;
    meulocal = this.cronapi.maps.createLatLngPoint(this.cronapi.object.getProperty(meulocal, 'coords.latitude'), this.cronapi.object.getProperty(meulocal, 'coords.longitude'));
    this.cronapi.util.callServerBlocklyAsynchronous('blockly.Posto:top5', function(sender_top5) {
        top5 = sender_top5;
      this.cronapi.maps.init("map9628", 'roadmap', meulocal, '16', function(sender_item) {
          item = sender_item;
        this.cronapi.maps.createMarker("map9628", 'meulocal', 'Você está aqui!! ', meulocal, '', 'Você está aqui!! ', '');
        this.blockly.js.blockly.maps.PostosMapa.marcarPostos(top5);
        this.cronapi.maps.changeMapZoom("map9628", '10');
      }.bind(this));
    }.bind(this));
  }.bind(this), function(sender_meulocal) {
      meulocal = sender_meulocal;
    this.cronapi.screen.notify('error','Não foi possível obter as coordenadas');
  }.bind(this));
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.maps.PostosMapa.marcarPostos = function(top5) {
 var item, meulocal, objPosto, i;
  var i_end = top5.length;
  var i_inc = 1;
  if (1 > i_end) {
    i_inc = -i_inc;
  }
  for (i = 1; i_inc >= 0 ? i <= i_end : i >= i_end; i += i_inc) {
    objPosto = top5[(i - 1)];
    console.log(objPosto);
    this.cronapi.maps.createMarker("map9628", i, this.cronapi.object.getProperty(objPosto, 'posto'), this.cronapi.maps.createLatLngPoint(this.cronapi.object.getProperty(objPosto, 'lat'), this.cronapi.object.getProperty(objPosto, 'long')), 'img/fillingstation.png', [this.cronapi.object.getProperty(objPosto, 'posto'),'. Preço litro: ',this.cronapi.object.getProperty(objPosto, 'preco_litro'),'. Custo km: ',this.cronapi.object.getProperty(objPosto, 'custo_km')].join(''), '');
  }
}
