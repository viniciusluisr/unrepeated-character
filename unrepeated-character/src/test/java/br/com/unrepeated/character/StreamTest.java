package br.com.unrepeated.character;

import br.com.unrepeated.character.exception.CharacterNotFoundException;
import br.com.unrepeated.character.stream.Stream;
import br.com.unrepeated.character.stream.StreamImpl;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertThat;

/**
 * Created by Vinicius on 07/12/15.
 */
@RunWith(JUnit4.class)
public class StreamTest {

    @Test
    public void testFirstCharacter() {
        Stream stream = new StreamImpl("aAbCcDeFgG");

        char first = stream.getNext();

        assertThat('a', Matchers.equalTo(first));
    }

    @Test(expected = CharacterNotFoundException.class)
    public void testWithoutUnrepeated() {
        Stream stream = new StreamImpl("aaaabbbccc");
    }

    @Test
    public void testAllUnrepeated() {
        Stream stream = new StreamImpl("aBBcdEEfGGhIjj");

        assertThat('a', Matchers.equalTo(stream.getNext()));
        assertThat(stream.hasNext(), Matchers.equalTo(true));
        assertThat('c', Matchers.equalTo(stream.getNext()));
        assertThat('d', Matchers.equalTo(stream.getNext()));
        assertThat(stream.hasNext(), Matchers.equalTo(true));
        assertThat('f', Matchers.equalTo(stream.getNext()));
        assertThat(stream.hasNext(), Matchers.equalTo(true));
        assertThat('h', Matchers.equalTo(stream.getNext()));
        assertThat('I', Matchers.equalTo(stream.getNext()));
        assertThat(stream.hasNext(), Matchers.equalTo(false));

    }

}
