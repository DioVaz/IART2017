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
public class gerador {
    /*
        *** DATABASE PARAMETERS ***
    */
    static int num_apresentacoes = 200;
    static int num_temas_per_apresentacao = 4;
    static int num_autores_per_apresentacao = 3;
    static float full_percentage = (float) 0.3;
    
    /*
        *** ALGORITHM PARAMETERS ***
    */
    int first_gen_size = 30;
    int multiplas; //numero de sessões em simultâneo 
    int num_sessoes; //numero de sessões não pode ultrapassar 12 (3 dias * 4 sessões)
    
    static DataBase DB;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code:
            generate_db();
            generate_first_generation();
            find_best_solution();
            save_and_end();
        */
        gerador.DB = new DataBase(num_apresentacoes,num_temas_per_apresentacao,num_autores_per_apresentacao,full_percentage);
        generate_first_generation();
      
    }
    
    private static void generate_first_generation() {
        
    }
}
