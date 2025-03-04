/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Ouvrage;
import services.ServicesImpl;

/**
 *
 * @author beassigaate
 */
public class ListeOuvragesAuteurAction extends Action{
    
    protected String execute(HttpServletRequest request, HttpServletResponse reponse){
        String auteur = null;
        try{
            auteur = URLDecoder.decode(request.getParameter("auteur"), "UTF-8");
            
        }catch(UnsupportedEncodingException ex){
            Logger.getLogger(ListeOuvragesAuteurAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Ouvrage>liste = service.ListerLesOuvragesDunAuteur(auteur);
        request.setAttribute("liste", liste);
        return "ListeOuvragesAuteurVue";
    }

}
