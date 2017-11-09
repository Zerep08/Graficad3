/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author zerep08
 */
@WebServlet(name = "urlSuperPro", urlPatterns = {"/urlSuperPro"})
public class urlSuperPro extends HttpServlet {

   


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String paterno = request.getParameter("paterno");
        String materno = request.getParameter("materno");
         String telefono = request.getParameter("telefono");
          String tipoPersona = request.getParameter("tipoPersona");
          int id = Integer.parseInt(tipoPersona);
          
        
        System.out.println("Hey: " + nombre);
        System.out.println("Hey: " + paterno);
        System.out.println("Hey: " + materno);
        
        PersonaDAO persona = new PersonaDAO();
        
        persona.savePersona(nombre, materno, paterno, telefono, id);
        
        JSONObject json = new JSONObject();
        json.put("resultado", true);
        response.setContentType("aplication/json utf-8");
        PrintWriter out = response.getWriter();
        out.print(json.toString());
        destroy();
    }


}
