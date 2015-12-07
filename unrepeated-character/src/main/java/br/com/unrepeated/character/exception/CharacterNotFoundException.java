package br.com.unrepeated.character.exception;

/**
 * Exception utilizada nos casos onde a Stream não conter nenhum caracter que não se repete
 * Created by Vinicius on 07/12/15.
 */
public class CharacterNotFoundException extends RuntimeException {

    public CharacterNotFoundException() {
        super("Nenhum caracter único foi  encontrado na Stream!");
    }
}
