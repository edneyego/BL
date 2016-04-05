"use strict";
var WebSocketConnector = (function () {
    function WebSocketConnector(url) {
        this.COMMAND = 'UPDATE';
        this.socket = io(url);
    }
    WebSocketConnector.prototype.listen = function () {
        this.socket.on(this.COMMAND, function (data) {
            Logger.info(data);
        });
    };
    return WebSocketConnector;
}());
exports.WebSocketConnector = WebSocketConnector;
