/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Auteur;
//import services.ServicesImpl;



/**
 *
 * @author beassigaate
 */
public class ListeAuteursAction extends Action{
    
   /*private ServicesImpl service;
    
    public ListeAuteursAction(ServicesImpl service){
        this.service = service;
    }
    */
    protected String execute(HttpServletRequest request, HttpServletResponse reponse){
        List<Auteur>liste = service.ListerTousLesAuteurs();
        request.setAttribute("liste", liste);
        return "listeAuteurs.jsp";
    }
}
