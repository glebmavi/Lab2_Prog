/**
 * Лабораторная работа №2 по программированию
 * Вариант 4233
 * @author Глеб Игоревич Маликов
 */
import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Yveltal p1 = new Yveltal("Ave Mamadisima", 1);
        Nidoqueen p2 = new Nidoqueen("Bolota Azul", 1);
        NidoranF p3 = new NidoranF("Bolita Azul", 1);
        Nidorina p4 = new Nidorina("Bola Azul", 1);
        Hippopotas p5 = new Hippopotas("Hippo", 1);
        Hippowdon p6 = new Hippowdon("Hippo Mamado", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}