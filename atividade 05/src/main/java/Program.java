import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ATIVIDADE05");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Modelo m = new Modelo(null,"automatico", 120, 1);
		
		Automovel a = new Automovel(2000, 2010,"automatico",200, 1200, 1);
		
		Marca ma = new Marca(1,"hyundai");
		
		a.add(m);
		m.add(ma);
		ma.add(a);
		
		em.persist(ma);
		em.persist(m);
		em.persist(a);
		
		em.getTransaction().commit();
		
		
		
		

	}

}
