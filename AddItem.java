
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S.Shobana
 */
@ManagedBean(name="apObj")
public class AddItem {
    
    private String cname, email,payment;
    private int phone,bookingno;

    public int getBookingno() {
        return bookingno;
    }

    public void setBookingno(int bookingno) {
        this.bookingno = bookingno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    
    public String addCustomer() throws SQLException
    {
        System.out.println("Booking Number: "+bookingno);
        System.out.println("Customer Name: "+cname);
        System.out.println("Customer Phone Number: "+phone);
        System.out.println("Customer email: "+email);
        System.out.println("Customer Payment Details: "+payment);
        
        Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/Cust [APP on APP]");
        java.sql.Statement ps=con.createStatement();
        ps.executeUpdate("insert into CUST values ('"+bookingno+"',"+cname+","+phone+", "+email+", "+payment+")");
        
        return"succeed";
    }
    
    
}
