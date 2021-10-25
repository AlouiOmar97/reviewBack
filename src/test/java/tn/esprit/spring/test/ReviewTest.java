package tn.esprit.spring.test;

//import org.apache.logging.log4j.LogManager;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import tn.esprit.spring.config.LoggingAspect;
import tn.esprit.spring.entities.Review;
import tn.esprit.spring.entities.Rating;

//import tn.esprit.spring.services.ReviewServiceImpl;
import tn.esprit.spring.services.IReviewService;

import static org.junit.Assert.*;
import org.springframework.test.context.junit4.SpringRunner;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewTest {
    //private static final Logger l;// = LogManager.getLogger(LoggingAspect.class);
    @Autowired
    IReviewService ireviewservice;
    private int idReview;


    @Before
    public void createReview(){
        System.out.println("before insert");
       // Review review=new Review("Aloui","Omar","omar.aloui@esprit.tn",true, Rating.INGENIEUR);
       // idReview=ireviewservice.ajouterReview(review);
        //test
    }


    @Test
    public void testAjouterReview() {

        System.out.println("ajout review");
      //  assertTrue(idReview>0);
    }

    @Test
    public void testModifierReview() {

        System.out.println("modifier review");
        //ireviewservice.mettreAjourEmailByReviewId("b@b",1);
        //assertTrue(idReview>0);
    }

    @After()
    public  void deleteReview(){
        System.out.println("Delete after");
       // ireviewservice.deleteReviewById(idReview);
    }

   /* @Around("execution(* tn.esprit.spring.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        if(elapsedTime<3000)
        l.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }*/
}
