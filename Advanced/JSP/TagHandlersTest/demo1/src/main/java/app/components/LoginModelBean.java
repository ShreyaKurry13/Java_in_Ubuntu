package app.components;

import java.sql.SQLException;

public class LoginModelBean {

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean authenticate(String custId, String pwd){
        try(var con = ShopDB.connect()) {
            var pstmt = con.prepareStatement("select count(cust_id) from customers where cust_id=? and pwd=?");
            pstmt.setString(1, custId);
            pstmt.setString(2, pwd);
            var rs = pstmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            rs.close();
            pstmt.close();
            if (count == 1) {
                customerId = custId;
                return true;
            }
            customerId = null;
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
