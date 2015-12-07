package br.com.unrepeated.character.stream;

import br.com.unrepeated.character.exception.CharacterNotFoundException;

import java.util.*;

/**
 * Created by Vinicius on 07/12/15.
 */
public class StreamImpl implements  Stream {

    private Iterator<Character> unrepeatedCharacteres;

    public StreamImpl(final String text) {
        List<Character> unrepeated = new ArrayList<Character>();
        Set<Character> characteres = new HashSet<Character>();

        for(char charactere: text.toCharArray()) {
            if(characteres.add(charactere))
                unrepeated.add(new Character(charactere));
            else
                unrepeated.remove(new Character(charactere));
        }

        if (unrepeated.isEmpty())
            throw new CharacterNotFoundException();

        this.unrepeatedCharacteres = unrepeated.iterator();
    }

    public char getNext() {
        return unrepeatedCharacteres.next();
    }

    public boolean hasNext() {
        return unrepeatedCharacteres.hasNext();
    }
}