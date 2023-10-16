/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Odonotologo;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author natil
 */
public class OdonotologoJpaController implements Serializable {

    public OdonotologoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public OdonotologoJpaController() {
        emf = Persistence.createEntityManagerFactory("Odonto_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Odonotologo odonotologo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(odonotologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Odonotologo odonotologo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            odonotologo = em.merge(odonotologo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = odonotologo.getId();
                if (findOdonotologo(id) == null) {
                    throw new NonexistentEntityException("The odonotologo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Odonotologo odonotologo;
            try {
                odonotologo = em.getReference(Odonotologo.class, id);
                odonotologo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The odonotologo with id " + id + " no longer exists.", enfe);
            }
            em.remove(odonotologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Odonotologo> findOdonotologoEntities() {
        return findOdonotologoEntities(true, -1, -1);
    }

    public List<Odonotologo> findOdonotologoEntities(int maxResults, int firstResult) {
        return findOdonotologoEntities(false, maxResults, firstResult);
    }

    private List<Odonotologo> findOdonotologoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Odonotologo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Odonotologo findOdonotologo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odonotologo.class, id);
        } finally {
            em.close();
        }
    }

    public int getOdonotologoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Odonotologo> rt = cq.from(Odonotologo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
