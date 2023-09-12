package Java;

import java.io.IOException;
import java.sql.SQLOutput;

public class test {

    public static void main(String[] args) throws IOException {
        PokeGroup poke=new PokeGroup();
        System.out.println(poke.type+poke.getpokegroup());
        poke.addPro("♥2 ♠2");
        poke.isLegal();
        System.out.println(poke.type+poke.getpokegroup());
        PokeGroup poke1=new PokeGroup();
        poke1.addPro("♥A ♥K ♥Q ♥J ♥10");
        poke1.isLegal();
        System.out.println(poke1.type+poke1.value+poke1.getpokegroup());
        System.out.println(poke.compareTo(poke1));
    }
}
