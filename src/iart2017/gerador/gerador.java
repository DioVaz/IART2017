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
    
    int first_gen_size = 30;
    int multiplas; //numero de sessões em simultâneo 
    int num_sessoes; //numero de sessões não pode ultrapassar 12 (3 dias * 4 sessões)
    
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
        generate_first_generation();
      
    }
    
    private static void generate_first_generation() {
        
    }
}
