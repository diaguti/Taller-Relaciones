/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;

/**
 *
 * @author FAMILIA
 */
public class Programacion {
    ArrayList <Sala> salas = new ArrayList <Sala>();

    public Programacion() {
    }
    
    public void agregarSalas(Sala sala){
        salas.add(sala);
    }
    
    public void listarInformacion(){
        for (int i = 0; i < salas.size(); i++) {
            System.out.println("----------------------------------------------------");
            System.out.println("Sala numero " + salas.get(i).getNumSala());
            for (int j = 0; j < salas.get(i).getSemanas().size(); j++) {                
                System.out.print("Tiene programacion para la semana " + salas.get(i).getSemanas().get(j).getNumero() + " con funcion los dias: \n");
                for (int k = 0; k < salas.get(i).getSemanas().get(j).getDias().length; k++) {
                    System.out.print(salas.get(i).getSemanas().get(j).getDias()[k].getFecha() + " con funciones de ");
                            for (int l = 0; l < salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().size(); l++) {
                                System.out.print(salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().get(l).getHoraInicio() 
                                        + " a " + salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().get(l).getHoraFinal() + "\n");
                    }
                }
                System.out.println("");
            }
            
        }
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
}
