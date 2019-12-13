


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
    var HtmlErrorListener = require('./js/parser/HtmlErrorListener').HtmlErrorListener;
    var HtmlGramLogicListener = require('./js/parser/HtmlGramLogicListener').HtmlGramLogicListener;
    


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
       
        var msg = ' <ul>';
        for (var i = 0; i < errorListener.errors.length; i++) {
            console.log('DGDG');
            var error = errorListener.errors[i];
            msg +='<li>';

            msg += 'Linha:  ' + error.line + ','
                + 'Coluna: ' + error.column + ','
               

                
            var x = error.msg.indexOf('expecting')+11;
            var tamanho = error.msg.length
            msg += 'O valor esperado é:   ' + error.msg.substring(x, tamanho-1);

            msg +="<img src='/img/danger.svg' class='rounded ml-2' height=20></li>";

        }
        msg += '</ul>';
        console.log(msg);
        console.log(errorListener.errors.length);
        document.getElementById("errormsg").innerHTML=msg;

        
    }

}