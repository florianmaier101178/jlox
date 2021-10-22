package de.florianmaier.jlox;

public enum TokenType {

    //Single-char tokens
    LEFT_PAREN, RIGHT_PAREN,
    LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, SEMICOLON,
    MINUS, PLUS, SLASH, STAR,

    //One or two char tokens
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    //Literls
    IDENTIFIER,
    STRING,
    NUMBER,

    //Keywords
    AND, OR,
    CLASS, SUPER, THIS,
    VAR,
    FUN, RETURN,
    ELSE, IF,
    FALSE, TRUE,
    FOR, WHILE,
    NIL,
    PRINT,

    EOF
}
