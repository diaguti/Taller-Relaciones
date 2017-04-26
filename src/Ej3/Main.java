/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author FAMILIA
 */
public class Main {
    
    public static void main(String[] args) {
        Programacion prog = new Programacion();
        Segmento s1 = new Segmento("10", "12");
        Segmento s2 = new Segmento("12", "2");
        Dia d1 = new Dia("1", "Lunes");
        Dia d2 = new Dia("2", "Martes");
        Dia d3 = new Dia("3", "Miercoles");
        Dia d4 = new Dia("4", "Jueves");
        Dia d5 = new Dia("5", "Viernes");
        Dia d6 = new Dia("8", "Lunes");
        Dia d7 = new Dia("9", "Martes");
        Dia d8 = new Dia("10", "Miercoles");
        Dia d9 = new Dia("11", "Jueves");
        Dia d10 = new Dia("12", "Viernes");
        Semana sem1 = new Semana(1);
        Semana sem2 = new Semana(2);
        Sala sal1 = new Sala(1);
        Sala sal2 = new Sala(2);
        d1.agregarSegmento(s1);
        d2.agregarSegmento(s2);
        d3.agregarSegmento(s1);
        d4.agregarSegmento(s2);
        d5.agregarSegmento(s1);
        d6.agregarSegmento(s2);
        d7.agregarSegmento(s1);
        d8.agregarSegmento(s2);
        d9.agregarSegmento(s1);
        d10.agregarSegmento(s2);
        sem1.agregarDias(d1, 0);
        sem1.agregarDias(d2, 1);
        sem1.agregarDias(d3, 2);
        sem1.agregarDias(d4, 3);
        sem1.agregarDias(d5, 4);
        sem2.agregarDias(d6, 0);
        sem2.agregarDias(d7, 1);
        sem2.agregarDias(d8, 2);
        sem2.agregarDias(d9, 3);
        sem2.agregarDias(d10, 4);
        sem1.agregarSala(sal1);
        sem1.agregarSala(sal2);
        sem2.agregarSala(sal1);
        sem2.agregarSala(sal2);
        sal1.agregarSemana(sem1);
        sal1.agregarSemana(sem2);
        sal2.agregarSemana(sem1);
        sal2.agregarSemana(sem2);
        prog.agregarSalas(sal1);
        prog.agregarSalas(sal2);
        prog.listarInformacion();
    }
}
