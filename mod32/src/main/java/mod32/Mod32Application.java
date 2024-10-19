package mod32;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mod32Application {

	public static void main(String[] args) {

		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Produto.class)
				.buildSessionFactory()) {

			Produto novoProduto = new Produto("Teclado Mecânico", 299.99, "Teclado gamer com iluminação RGB");
			cadastrarProduto(factory, novoProduto);

			novoProduto.setPreco(279.99);
			atualizarProduto(factory, novoProduto);

			deletarProduto(factory, novoProduto.getId());

			Produto produtoBuscado = buscarProdutoPorId(factory, 1L); // Substitua 1L pelo ID que você deseja buscar
			System.out.println("Produto buscado: " + produtoBuscado);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void cadastrarProduto(SessionFactory factory, Produto produto) {
		try (Session session = factory.getCurrentSession()) {
			session.beginTransaction();
			session.save(produto);
			session.getTransaction().commit();
			System.out.println("Produto cadastrado com sucesso: " + produto);
		}
	}

	private static void atualizarProduto(SessionFactory factory, Produto produto) {
		try (Session session = factory.getCurrentSession()) {
			session.beginTransaction();
			session.update(produto);
			session.getTransaction().commit();
			System.out.println("Produto atualizado com sucesso: " + produto);
		}
	}

	private static void deletarProduto(SessionFactory factory, Long id) {
		try (Session session = factory.getCurrentSession()) {
			session.beginTransaction();
			Produto produto = session.get(Produto.class, id);
			if (produto != null) {
				session.delete(produto);
				System.out.println("Produto deletado com sucesso: " + produto);
			} else {
				System.out.println("Produto não encontrado com ID: " + id);
			}
			session.getTransaction().commit();
		}
	}

	private static Produto buscarProdutoPorId(SessionFactory factory, Long id) {
		try (Session session = factory.getCurrentSession()) {
			session.beginTransaction();
			Produto produto = session.get(Produto.class, id);
			session.getTransaction().commit();
			return produto;
		}
	}
}

