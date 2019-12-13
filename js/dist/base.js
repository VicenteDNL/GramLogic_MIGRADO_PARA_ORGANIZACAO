


function limpar() {
    $('#input').val('');
    document.getElementById("resultado").innerHTML="";
    document.getElementById("errormsg").innerHTML="";
    document.getElementById("validamsg").innerHTML="";
    document.getElementById("resul").innerHTML="Nenhum XML gerado";
    
}


function validar() {
    var input = $('#input').val();
    if (input.length == '') {
        document.getElementById("validamsg").innerHTML="";
        document.getElementById("errormsg").innerHTML="Por favor, forneça uma fórmula como entrada"+ "<img src='/img/danger.svg' class='rounded ml-2' height=20>";
        return
    }


    var antlr4 = require('./antlr4/index'); 
    var GramLogicLexer = require('./js/parser/GramLogicLexer').GramLogicLexer; 
    var GramLogicParser = require('./js/parser/GramLogicParser').GramLogicParser; 
    var HtmlGramLogicListener = require('./js/parser/HtmlGramLogicListener').HtmlGramLogicListener;
    var HtmlErrorListener = require('./js/parser/HtmlErrorListener').HtmlErrorListener;


    var chars = new antlr4.InputStream(input); 
    var lexer = new GramLogicLexer(chars); 
    var tokens = new antlr4.CommonTokenStream(lexer); 
    var parser = new GramLogicParser(tokens); 

    var errorListener = new HtmlErrorListener();
    parser.addErrorListener(errorListener);


    parser.buildParseTrees = true; 
    var tree = parser.form();
    var htmlGramLogic = new HtmlGramLogicListener();
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(htmlGramLogic, tree);

    if (errorListener.errors.length == 0) {
        document.getElementById("errormsg").innerHTML="";
        document.getElementById("validamsg").innerHTML="Semântica e Sintaxe Válidas"+ "<img src='/img/like.svg' class='rounded ml-2' height=20>";
        document.getElementById("resultado").innerHTML="Baixar XML"+ "<img src='/img/xml.svg' class='rounded ml-2' height=40>";
        document.getElementById("resul").innerHTML="Opaa! seu arquivo acabou de ser gerado";
        this.texto = htmlGramLogic.xmlDoc.outerHTML;
        
    
        

    } else {
        var msg = 'Não foi possível gerar e válidar a fórmula a partir da entrada\n\n';
        for (var i = 0; i < errorListener.errors.length; i++) {
            var error = errorListener.errors[i];
            msg += 'Linha:  ' + error.line + '\n'
                + 'Coluna: ' + error.column + '\n'
                + 'Erro:   ' + error.msg + '\n\n';
        }
        alert(msg);
    }

}