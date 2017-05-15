/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iart2017.gerador;

/**
 *
 * @author Diogo
 */
public class Apresentacao {
    int ID;
    Autor aprentador;
    Autor[] coautores;
    Tema[] temas;
    boolean fullpaper;
    
    public Apresentacao(int id,Autor[] autores, Tema[] temas,boolean fullpaper){
        this.ID = id;
        this.aprentador=autores[0];
        this.coautores = autores;
        this.temas=temas;
        this.fullpaper=fullpaper;
    }
    
    public boolean has_tema(Tema tema){
        for (Tema tema1 : temas) {
            if (tema == tema1) {
                return true;
            }
        }
        return false;
    }
}
