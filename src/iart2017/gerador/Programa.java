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
public class Programa {
    
    int multiplas; //numero de sessões em simultâneo 
    int num_sessoes; //numero de sessões não pode ultrapassar 12 (3 dias * 4 sessões)
    int forca;
    
    Sessao[][] sessoes;

    public Programa(int multiplas,int num_sessoes, DataBase db) {
        this.multiplas = multiplas;
        this.num_sessoes = num_sessoes;
        this.sessoes = new Sessao[multiplas][num_sessoes];
        
        /*
        todo:
            get x temas
            preencher sessões com apresentações
            avaliar
            melhorar
        */
    }
    
    
}
