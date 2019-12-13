grammar GramLogic;


form : '|-' arg | arg (',' arg)* '|-' arg EOF ;


arg: arg ('^'|'v'|'->'|'<->') arg | '~'*?PRED | '(' arg ')'| '~'*?'(' arg ')';


fragment UPPERCASE: [A-Z];

WHITESPACE: (' ' | '\t'| '\r'| '\n') -> skip;
PRED:  UPPERCASE;