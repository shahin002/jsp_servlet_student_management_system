<%-- 
    Document   : edit_student
    Created on : Mar 22, 2017, 9:39:17 PM
    Author     : rashu
--%>

<%@page import="Model_Class.Edit_Student_Model"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String studentId = request.getParameter("id");
            int id = Integer.parseInt(studentId);
            List<Edit_Student_Model> list = Edit_Student_Model.getStudentById(id);


        %>

    <center>
        <h1>Edit Student Profile</h1>

        <%            for (Edit_Student_Model view : list) {
        %>


        <form action="Edit_Student_Controller" method="post">
            <input type="text" hidden="" name="studentId" value="<% out.println(view.getId()); %>">
            <table>
                <tr>
                    <td>Full Name</td>
                    <td><input value="<% out.println(view.getFullName()); %>" type="text" name="student_name"></td>
                </tr>
                <tr>
                    <td>Birth Date</td>
                    <td><input value="<% out.println(view.getBirthDate()); %>" type="text" name="birth_date"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <select name="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Blood Group</td>
                    <td>
                        <select name="blood_group" >
                            <option></option>
                            <option value="A+">A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Religion</td>
                    <td><input value="<% out.println(view.getReligion()); %>" type="text" name="religion" ></td>
                </tr>
                <tr>
                    <td>E-mail</td>
                    <td><input value="<% out.println(view.getEmail()); %>" type="text" name="email" ></td>
                </tr>
                <tr>
                    <td>Mobile No</td>
                    <td><input value="<% out.println(view.getMobile()); %>" type="text" name="mobile"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><textarea type="text" name="address"><% out.println(view.getAddress()); %></textarea></td>
                </tr>
                <tr>
                    <td>Class</td>
                    <td>
                        <select name="student_class">
                            <option></option>
                            <option value="One">One</option>
                            <option value="Two">Two</option>
                            <option value="Three">Three</option>
                            <option value="Four">Four</option>
                            <option value="Five">Five</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Roll No</td>
                    <td><input value="<% out.println(view.getRoll()); %>" type="text" name="roll" ></td>
                </tr>
                <tr>
                    <td>Registration No</td>
                    <td><input value="<% out.println(view.getRegiNo()); %>" type="text" name="reg_no" ></td>
                </tr>
            </table>     

            <input type="submit" value="Submit" class="btn btn-success">
            <input type="reset" value="Reset" class="btn btn-primary">
            </div>
        </form>
        <%
            }
        %>

    </center>

</body>
</html>
