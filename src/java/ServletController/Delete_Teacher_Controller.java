/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletController;

import Model_Class.Delete_Student_Model;
import Model_Class.Delete_Teacher_Model;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rashu
 */
public class Delete_Teacher_Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String studentId = request.getParameter("id");
        int id = Integer.parseInt(studentId);

        if (Delete_Teacher_Model.deleteTeacherById(id) == 1) {

            response.sendRedirect("teacher.jsp");

        } else {
            out.println("Failed");
        }

    }

}
