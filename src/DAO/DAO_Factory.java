/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Luiz Felipe
 */
public class DAO_Factory {
    
    
    public static DAO_Cidade getDAO_cidade(){
        return new DAO_Cidade();
    }
    
    public static DAO_Filial getDAO_filial(){
        return new DAO_Filial();
    }
    
    public static DAO_Funcionario getDAO_funcionario(){
        return new DAO_Funcionario();
    }    
        public static DAO_Estoque getDAO_estoque(){
        return new DAO_Estoque();
    } 
}
