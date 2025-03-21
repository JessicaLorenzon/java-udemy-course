package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa3 {

	public static void main(String[] args) {
		// REMOVER DADOS

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);

		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
