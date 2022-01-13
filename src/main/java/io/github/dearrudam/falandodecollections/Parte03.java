package io.github.dearrudam.falandodecollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Parte03 {

    public static void main(String[] args) {
        // Set

        Set<Desenvolvedor> desenvolvedores = new LinkedHashSet<>();

        Desenvolvedor ale = new Desenvolvedor("Ale");
        Desenvolvedor max = new Desenvolvedor("Max");
        Desenvolvedor aynelorr = new Desenvolvedor("aynelorr");
        Desenvolvedor rafael = new Desenvolvedor("Rafael");

        desenvolvedores.add(rafael);
        desenvolvedores.add(max);
        desenvolvedores.add(ale);
        desenvolvedores.add(aynelorr);
        desenvolvedores.add(new DesenvolvedorJava("aynelorr"));

        System.out.println(desenvolvedores);

    }

}

class Desenvolvedor {
    String nome;

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().isAssignableFrom(o.getClass())) return false;
        Desenvolvedor that = (Desenvolvedor) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}

class DesenvolvedorJava extends Desenvolvedor{

    public DesenvolvedorJava(String nome) {
        super(nome);
    }
}