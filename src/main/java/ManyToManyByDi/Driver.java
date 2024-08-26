package ManyToManyByDi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver 
{

	public static void main(String[] args) 
	{
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 
//		 Player p1=new Player();
//		 p1.setName("Aswin");
//		 p1.setCont(1234567890);
//		 
//		 Player p2=new Player();
//		 p2.setName("Rohit");
//		 p2.setCont(234567899);
//		 
//		 Player p3=new Player();
//		 p3.setName("Dhoni");
//		 p3.setCont(123456790);
//		 
//		 Game g1=new Game();
//		 g1.setName("Cricket");
//		 
//		 Game g2=new Game();
//		 g2.setName("Volleyball");
//		 
//		 List<Game>games=new ArrayList<>();
//		 games.add(g1);
//		 games.add(g2);
//		 p1.setGame(games);
//		 
//		 List<Game>games1=new ArrayList<>();
//		 games1.add(g2);
//		 p2.setGame(games1);
//		 
//		 List<Game>games2=new ArrayList<>();
//		 games2.add(g1);
//		 p3.setGame(games2);
//		 
//		 List<Player>players=new ArrayList<Player>();
//		 players.add(p1);
//		 players.add(p3);
//		 g1.setPlayer(players);
//		 
//		 List<Player>players1=new ArrayList<Player>();
//		 players1.add(p1);
//		 players1.add(p2);
//		 g1.setPlayer(players1);
//		 
//		 et.begin();
//		 em.persist(g1);
//		 em.persist(g2);
//		 
//		 em.persist(p1);
//		 em.persist(p2);
//		 em.persist(p3);
//		 
//		 et.commit();
		 
		 
		 Player p3=new Player();
		 p3.setName("kumar");
		 p3.setCont(1234567890);
		 
		 Player p4=new Player();
		 p4.setName("ROKESH");
		 p4.setCont(234567899);
		 
		 Player p5=new Player();
		 p5.setName("abin");
		 p5.setCont(123456790);
		 
		 Player p6=new Player();
		 p6.setName("edison");
		 p6.setCont(123456790);
		 
		 Game g3=new Game();
		 g3.setName("FOOTBALL");
		 
		 Game g4=new Game();
		 g4.setName("HOCKY");
		 
		 List<Game>games4=new ArrayList<>();
		 games4.add(g3);
		 p3.setGame(games4);
		 
		 List<Game>games5=new ArrayList<>();
		 games5.add(g3);
		 p4.setGame(games5);
		 
		 List<Game>games6=new ArrayList<>();
		 games6.add(g3);
		 games6.add(g4);
		 p5.setGame(games6);
		 
		 List<Game>games7=new ArrayList<>();
		 games7.add(g3);
		 games7.add(g4);
		 p6.setGame(games7);
		 
		 
		 List<Player> Player=new ArrayList();
		 Player.add(p3);
		 Player.add(p4);
		 Player.add(p5);
		 Player.add(p6);
		 g3.setPlayer(Player);
		 

		 List<Player> Player3=new ArrayList();
		 Player3.add(p5);
		 Player3.add(p6);
		 
		 g4.setPlayer(Player3);
		 
		 
		 
		 et.begin();
		 em.persist(g3);
		 em.persist(g4);
		 
		 em.persist(p3);
		 em.persist(p4);
		 em.persist(p5);
		 em.persist(p6);
		 
		 et.commit();
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
