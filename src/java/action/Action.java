/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ServicesImpl;

/**
 *
 * @author beassigaate
 */
public abstract class Action {
    protected ServicesImpl service;
    protected abstract String execute(HttpServletRequest request, HttpServletResponse response);
    
    public void setServices(ServicesImpl service){
        this.service = service;
    }  
}
