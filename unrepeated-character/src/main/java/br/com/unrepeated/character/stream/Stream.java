package br.com.unrepeated.character.stream;

/**
 * Created by Vinicius on 07/12/15.
 */
public interface Stream {

    /**
     * Obtém o próximo caracter da stream a ser processado
     * @return próximo caracter da stream a ser processado
     */
    char getNext();

    /**
     * verifica se a stream ainda possui um próximo caracter a ser processado
     * @return o booleano de verificação
     */
    boolean hasNext();
}
