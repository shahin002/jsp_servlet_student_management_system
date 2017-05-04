/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletController;

import Model_Class.Database_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rashu
 */
public class Edit_Student_Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        String tid = request.getParameter("studentId");
        int id= Integer.parseInt(tid);
        String name = request.getParameter("student_name");
        String birthDate = request.getParameter("birth_date");
        String gender = request.getParameter("gender");
        String bloodGroup = request.getParameter("blood_group");
        String religion = request.getParameter("religion");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String studentClass = request.getParameter("student_class");
        String roll= request.getParameter("roll");
        String regNo= request.getParameter("reg_no");
        
        try {

            Connection conn = Database_Connection.getCon();
            PreparedStatement ps = conn.prepareStatement("update tbl_student set name=?,birthdate=?,gender=?,bloodgroup=?,religion=?,email=?,mobile=?,address=?,studentclass=?,roll=?,registration=? where id=?");
            ps.setString(1, name);
            ps.setString(2, birthDate);
            ps.setString(3, gender);
            ps.setString(4, bloodGroup);
            ps.setString(5, religion);
            ps.setString(6, email);
            ps.setString(7, mobile);
            ps.setString(8, address);
            ps.setString(9, studentClass);
            ps.setString(10, roll);
            ps.setString(11, regNo);
            ps.setInt(12, id);
            
            
            
            
            int result = ps.executeUpdate();

            if (result == 1) {
                response.sendRedirect("student.jsp");
                
            } else {
                out.println("Invalid");
            }

        } catch (Exception e) {

        }

    }

    }
