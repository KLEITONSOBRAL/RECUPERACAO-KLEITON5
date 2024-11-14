package com.mycompany.recuperacao.kleiton5;

import java.util.Scanner;

public class RECUPERACAOKLEITON5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int senha;
        
        System.out.println("Digite a sua senha de acesso:");
        senha = scanner.nextInt();
        
        if(senha == 9999){
            System.out.println("Acesso permitido!");
        }
        else if(senha != 9999){
            System.out.println("Usuario invalido!");
        }
        else{
            System.out.println("Digite uma opcao valida");
        }
        
        scanner.close();
    }
}
