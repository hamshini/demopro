package org.book;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    
Book book=new Book();
        book.setId(2);
        book.setTitle("secret");
        book.setPrice(205.9d);
        book.setIsbnno("1345718");
        book.setPublisher("cup publisher");
        book.setEdition("1st Edition");
        session.save(book);
        
        Book book1=new Book();
        book1.setId(2);
        book1.setTitle("two states");
        book1.setPrice(703.7d);
        book1.setIsbnno("6732372");
        book1.setPublisher("na publisher");
        book1.setEdition("2nd Edition");
        session.save(book1);
        
        Ebook ebook=new Ebook();
        ebook.setDownloadurl("oracle_software_downloads");
        ebook.setSize_in_mb(365);
        session.save(ebook);
        
        Ebook ebook1=new Ebook();
        ebook1.setDownloadurl("emc_software_downloads");
        ebook1.setSize_in_mb(4346);
        session.save(ebook1);
        
        PaperBook paper=new PaperBook();
        paper.setShipping_weight(445);
        paper.setInstock(3);
        session.save(paper);
       
        PaperBook paper1=new PaperBook();
        paper1.setShipping_weight(79.8f);
        paper1.setInstock(2);
        session.save(paper1);
        Criteria cri=session.createCriteria(Book.class);
        cri.add(Restrictions.le("book_id", 5));
           List<Book> bk=cri.list();
        session.getTransaction().commit();
        session.close();
        sf.close();
        
	}
}
