/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iart2017.gerador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diogo
 */
public class DataBase {
    /*
        *** SAVE FILES ***
    */
    static String Autores_File = "autores.txt";
    static String Temas_File = "temas.txt";
    
    /*
        *** STRUCTERS ***
    */
    static Apresentacao[] apresentacoes;
    static Autor[] autores;
    static Tema[] temas;
    
    public DataBase(int num_apresentacoes,int num_temas_per_apresentacao, int num_autores_per_apresentacao,int full_percentage){
        read_autores_file();
        read_temas_file();
        generate_apresentacoes(num_apresentacoes,num_temas_per_apresentacao,num_autores_per_apresentacao,full_percentage);      
    }
    
    static void read_autores_file(){
        try (BufferedReader br = new BufferedReader(new FileReader(Autores_File))) {
            System.out.println("*** LER AUTORES_FILE: ***");
            String line;
            int i =0;
            line = br.readLine();
            int total = Integer.parseInt(line);
            autores = new Autor[total];
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);
                String[] parts = line.split("-");
                String part1 = parts[0];
                int numero = Integer.parseInt(part1);
                String part2 = parts[1]; 
                Autor novo = new Autor(numero,part2);
                autores[i]=novo;
                i++;
                }
        }   catch (IOException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void read_temas_file(){
        try (BufferedReader br = new BufferedReader(new FileReader(Temas_File))) {
            System.out.println("*** LER TEMAS_FILE: ***");
            String line;
            int i =0;
            line = br.readLine();
            int total = Integer.parseInt(line);
            temas = new Tema[total];
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);
                Tema novo = new Tema(line);
                temas[i]=novo;
                i++;
                }
        }   catch (IOException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void generate_apresentacoes(int num_apresentacoes,int num_temas_per_apresentacao,int num_autores_per_apresentacao,int full_percentage){
        apresentacoes = new Apresentacao[num_apresentacoes];
        int number_fullpapers = num_apresentacoes/full_percentage;
        for (int i =0;i<num_apresentacoes;i++){
            boolean fullpaper = (i<number_fullpapers);
            int[] temas_id = new int[num_temas_per_apresentacao];
            int[] autores_id = new int[num_autores_per_apresentacao];
            Tema[] temas_list = new Tema[num_temas_per_apresentacao];
            Autor[] autores_list = new Autor[num_autores_per_apresentacao];
            for(int j =0;j<num_temas_per_apresentacao;){
                int tema = (int)(Math.random() * (temas.length));
                if(check_input(tema,temas_id)){
                    temas_id[j]=tema;
                    temas_list[j]=temas[tema-1];
                    j++;
                }
            }
            for(int j =0;j<num_autores_per_apresentacao;){
                int autor = (int)(Math.random() * (autores.length));
                if(check_input(autor,autores_id)){
                    autores_id[j]=autor;
                    autores_list[j]=autores[autor-1];
                    j++;
                }
            }
            apresentacoes[i]=new Apresentacao(i,autores_list,temas_list,fullpaper);
        }
    }
    
    static boolean check_input(int input, int[] list){
        for (int i = 0; i< list.length;i++){
            if(list[i]==input){return false;}
        }
        return true;
    }
}
