/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Booking;
import entity.Lesson;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author S.Shobana
 */
@Named(value = "bookingBean")
@SessionScoped
public class BookingBean implements Serializable {

    @PersistenceContext(unitName = "SportTrainingPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /**
     * Creates a new instance of BookingBean
     */
    public BookingBean() {
    }

 public List<Booking> getBookingList(){
        return em.createNamedQuery("Booking.findAll").getResultList();
    }
   
}
