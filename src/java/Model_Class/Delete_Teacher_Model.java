/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Class;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author rashu
 */
public class Delete_Teacher_Model {
    
    static int x;

    public static int deleteTeacherById(int id) {

        try {
            Connection conn = Database_Connection.getCon();
            PreparedStatement ps = conn.prepareStatement("delete from tbl_teacher where id=?");

            ps.setInt(1, id);
            x = ps.executeUpdate();

        } catch (Exception e) {

        }

        return x;

    }
    
}
