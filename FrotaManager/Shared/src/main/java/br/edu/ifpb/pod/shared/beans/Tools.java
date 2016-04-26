/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.beans;

/**
 *
 * @author jederson
 */
public class Tools {
            
    public static boolean isPermited(String f , String v){         
        return (f.compareTo(v)) > -1;
    }
}