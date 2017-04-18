/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bensemi.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author koumotoj
 */
@Named
@RequestScoped

public class Hash {
    private String hash;
    
    public Hash(){
        
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }  
    
}
