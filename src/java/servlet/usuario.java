package servlet;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno13
 */
public class usuario {
    static String email;
    static String nome;
    static String senha;
    
    static void pedirNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nome:");
        nome = sc.nextLine();
    }
    static void pedirEmail(){
    Scanner sc = new Scanner(System.in);
        System.out.println("email:");
        email = sc.nextLine();
        

    }
    static void pedirSenha(){
    Scanner sc = new Scanner(System.in);
        System.out.println("senha:");
        senha = sc.nextLine();

    }
}
