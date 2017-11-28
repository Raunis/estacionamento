/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Valores;
import Persistencia.ValoresDAO;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author apmagalhaes
 */
@WebServlet(name = "ValoresController", urlPatterns = {"/ValoresController"})
public class ValoresController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int horista, mensalista,id;
        String logica;
              
        logica = request.getParameter("logica");
        if (logica.equals("listar")){
        	id = Integer.parseInt(request.getParameter("id"));
        	Controller.Valores val = new Controller.Valores(id);
            Persistencia.ValoresDAO dao = new Persistencia.ValoresDAO();
            dao.listar(val);
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString(val);
            
            
            request.setAttribute("jsonInString", jsonInString);
            RequestDispatcher dispatcher = request.getRequestDispatcher("teste.jsp");
            dispatcher.forward(request,response);
        }
        if (logica.equals("excluir")){
            id = Integer.parseInt(request.getParameter("id"));
            Controller.Valores val = new Controller.Valores(id);
            
            Persistencia.ValoresDAO dao = new Persistencia.ValoresDAO();
            dao.excluir(val);
        }
        if (logica.equals("alterar")){
            horista = Integer.parseInt(request.getParameter("horista"));
	        mensalista = Integer.parseInt(request.getParameter("mensalista"));
	        id = Integer.parseInt(request.getParameter("id"));
	        Controller.Valores val = new Controller.Valores(id,horista,mensalista);
	        
	        Persistencia.ValoresDAO dao = new Persistencia.ValoresDAO();
            dao.alterar(val);
        }
        else{  //SALVAR
	        horista = Integer.parseInt(request.getParameter("horista"));
	        mensalista = Integer.parseInt(request.getParameter("mensalista"));
	        Controller.Valores val = new Controller.Valores(horista,mensalista);
	        
	        Persistencia.ValoresDAO dao = new Persistencia.ValoresDAO();
	        dao.salvar(val);
        }   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
