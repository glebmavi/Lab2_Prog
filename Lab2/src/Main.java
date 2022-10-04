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
        Yveltal p1 = new Yveltal("YV", 1);
        Nidoqueen p2 = new Nidoqueen("NQ", 1);
        NidoranF p3 = new NidoranF("NF", 1);
        Nidorina p4 = new Nidorina("ND", 1);
        Hippopotas p5 = new Hippopotas("HT", 1);
        Hippowdon p6 = new Hippowdon("HW", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}