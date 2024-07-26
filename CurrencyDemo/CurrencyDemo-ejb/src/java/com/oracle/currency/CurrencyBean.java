/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.currency;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author oracle
 */
@Stateless
@LocalBean
public class CurrencyBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public double convertCurrency(String c1, double a, String c2){
        double res = 0;
        if(c1.equals("INR")){
            if(c2.equals("USD")){
                res = 0.012 * a;
            }else if(c2.equals("JPY")){
                res = 1.86 * a;
            }else{
                res = -1;
            }
        }else if(c1.equals("USD")){
            if(c2.equals("INR")){
                res = 83.70 * a;
            }else if(c2.equals("JPY")){
                res = 155.7 * a;
            }else{
                res = -1;
            }
        }else{
            if(c2.equals("INR")){
                res = 0.54 * a;
            }else if(c2.equals("USD")){
                res = 0.0064 * a;
            }else{
                res = -1;
            }
        }
        return res;
    }
}
