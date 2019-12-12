function gerarXML() {
    var titulo = 'FormulaXML';
        var blob = new Blob([texto], { type: "text/plain;charset=utf-8" });
        saveAs(blob, titulo + ".xml");

 }