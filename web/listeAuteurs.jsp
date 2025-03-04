<%-- 
    Document   : listeAuteurs
    Created on : 7 févr. 2025, 15:54:40
    Author     : beassigaate
--%>
<%@page import="modele.Auteur"%>
<%@page import="java.util.List"%>
<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nos auteurs</title>
    </head>
    <body>
        <h1>Liste des auteurs reférencés</h1>
        <br>
        <%
            List<Auteur>liste = (List<Auteur>)request.getAttribute("liste");
            for(Auteur a:liste){
                String encodedUrl = URLEncoder.encode(a.getNom(), "UTF-8");
                out.println("<a href = ActionServlet?action = listeOuvragesDunAuteur&auteur = "+encodedUrl+">"+a.getNom()+"</a><br>");
            }
        %>
    </body>
</html>
