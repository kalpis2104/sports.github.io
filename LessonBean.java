/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Lesson;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author S.Shobana
 */
@Named(value = "lessonBean")
@Dependent
public class LessonBean {

    @PersistenceContext(unitName = "SportTrainingPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /**
     * Creates a new instance of LessonBean
     */
    public LessonBean() {
    }

    public List<Lesson> getLessonList(){
        return em.createNamedQuery("Lesson.findAll").getResultList();
    }
}
