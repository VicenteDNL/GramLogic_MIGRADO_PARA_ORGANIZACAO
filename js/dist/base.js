


function limpar() {
    $('#input').val('');
    document.getElementById("resultado").innerHTML="";
    document.getElementById("errormsg").innerHTML="";
    document.getElementById("validamsg").innerHTML="";
    document.getElementById("resul").innerHTML="Nenhum XML gerado";
    document.getElementById("errormsggramatica").innerHTML="";
    document.getElementById("errorgramatica").innerHTML="";
    
}


function validar() {
    var input = $('#input').val();
    if (input.length == '') {
        document.getElementById("errormsggramatica").innerHTML="";
        document.getElementById("errorgramatica").innerHTML="";
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

    console.log(errorListener.errors.length)
    if (errorListener.errors.length == 0) {
        document.getElementById("errormsggramatica").innerHTML="";
        document.getElementById("errorgramatica").innerHTML="";
        document.getElementById("errormsg").innerHTML="";
        document.getElementById("validamsg").innerHTML="Semântica e Sintaxe Válidas"+ "<img src='/img/like.svg' class='rounded ml-2' height=20>";
        document.getElementById("resultado").innerHTML="Baixar XML"+ "<img src='/img/xml.svg' class='rounded ml-2' height=40>";
        document.getElementById("resul").innerHTML="Opaa! seu arquivo acabou de ser gerado";
        this.texto = htmlGramLogic.xmlDoc.outerHTML;
        
    
        

    } else {
       
        var msg = ' <ul>';
        for (var i = 0; i < errorListener.errors.length; i++) {
           
            var error = errorListener.errors[i];
            console.log(error.msg)
            msg += '<li>Linha:  ' + error.line + '</li>'
                + '<li>Coluna: ' + error.column + '</li>';

                if (error.msg.indexOf('expecting')>=0){
                    var x = error.msg.indexOf('expecting')+11;
                    var tamanho = error.msg.length;
                    var esperados = error.msg.substring(x, tamanho-1);
                    var index = esperados.indexOf(', ')
                    if (index==-1){
                        
                        if(esperados=='EOF'){
                            msg +='<li>Final da fórmula inválido<ul>';
                        }else{
                            msg +='<li>Os valores esperados são:<ul>';
                            msg +='<li>'+esperados+'</li>';
                        }
                       
    
                    }else{
                        msg +='<li>Os valores esperados são:<ul>';
                        while(index>=0){
                            msg +='<li>'+esperados.substring(0,index)+ '</li>';
                            esperados =esperados.substring(index+2);
                            index = esperados.indexOf(', ');
                        }
                        if(esperados=='PRED'){
                            msg +="<li>letras predicativas de 'A' a 'Z' </li>";
                        }
                    }
                }else{
                   
                    var index = error.msg.indexOf('input')+6;
                    var tamanho = error.msg.length;
                    var entrada = error.msg.substring(index+1,tamanho-1);
                    
                    if(entrada=='~'){
                        msg +="<li>Os valores esperados são:<ul>";
                        msg += "<li>'('</li>"
                        + "<li>Letras predicativas de 'A' a 'Z' </li></li>";
                    }
                    else if(entrada=='('){
                        msg +="<li>Os valores esperados são:<ul>";
                        msg += "<li>'~'</li>"
                        + "<li>letras predicativas de 'A' a 'Z' </li></li>";
                    }
                    else{
                        msg +="<li>O Argumento '"+entrada+"' não é válido<ul>";
        
                    }
                }

                msg +='</ul>';

    
           
        }
        msg += '</ul>';
        document.getElementById("errormsg").innerHTML="";
        document.getElementById("validamsg").innerHTML="";
        document.getElementById("errormsggramatica").innerHTML="Erro de Sintaxe <img src='/img/danger.svg' class='rounded ml-2' height=20>";
        document.getElementById("errorgramatica").innerHTML=msg;

        
    }

}