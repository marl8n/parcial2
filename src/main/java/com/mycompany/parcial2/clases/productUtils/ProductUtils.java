/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2.clases.productUtils;

import java.util.function.Predicate;

/**
 *
 * @author marl8n
 */
public class ProductUtils {
    public static Predicate<Integer> isInStock = x -> x > 0; 
}
