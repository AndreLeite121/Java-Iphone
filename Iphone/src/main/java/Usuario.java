
import Aparelho.Iphone;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreleite
 */
public class Usuario {
    public static void main (String[] args){
        Iphone iphone = new Iphone();
        
        System.out.println("Aparelho Telefônico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        
         System.out.println("=======================");
         
        System.out.println("Navegador ne Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
         System.out.println("=======================");
         
        System.out.println("Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
