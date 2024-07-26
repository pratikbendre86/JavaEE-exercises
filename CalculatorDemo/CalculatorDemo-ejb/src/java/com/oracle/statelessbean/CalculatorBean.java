/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.statelessbean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author oracle
 */
@Stateless
//@LocalBean
public class CalculatorBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int sub(int num1, int num2){
        return num1 - num2;
    }
    public int mult(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        return num1 / num2;
    }
}
