package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsCounterTest {

    @Test
    void wordsCounter() {
        Map map = WordsCounter.wordsCounter("que Una mujer compra en una tienda de animales a un loro que, según le promete el dependiente, es capaz de repetir todo lo que oiga. Y, sin embargo, la mujer devuelve al animal una semana después puesto que no ha pronunciado ni un solo sonido, a pesar de que le ha hablado continuamente. Sin embargo, el dependiente no la ha engañado.");
        for (var name: map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }
    }
}