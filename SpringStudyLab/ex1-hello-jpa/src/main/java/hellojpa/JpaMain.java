package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = enf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try{
            Member member = new Member();
            member.setName("C");
            member.setCity("Seoul");
            member.setStreet("terran");
            member.setZipcode("yoyo");
            em.persist(member);
            tx.commit();
        } catch(Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        enf.close();
    }
}
