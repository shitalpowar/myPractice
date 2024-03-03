package shital.junitPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Timeout;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;
class AuthenticatorTest {

    @BeforeClass
    public static void doSomethingBeforeExecutingAnyTC(){
        System.out.println("before class");
    }

    @AfterClass
    public static void doSomethingAfterExecutingAnyTC(){
        System.out.println("After class");
    }

    @Before
    public void doSomethingBefore(){
        System.out.println("before...");
    }


    @After
    public void doSomethingAfter(){
        System.out.println("before...");
    }

   @Test
    public void testLogin(){
        Authenticator authenticator = new Authenticator();
        String user = "abc1234";
        String pwd = "Shital";
        Boolean res = authenticator.login(user,pwd);
        assertTrue(res);
       System.out.println("test1 run successfully");

    }
    @Test
    public void testLoginWthWrongPwd(){


        Authenticator auth = new Authenticator();
        String user = "abc1234";
        String pwd = "AAAAA";
        boolean res = auth.login(user,pwd);
        assertFalse(res);
        System.out.println("test2 run successfully");


    }


    @Test
    public  void testLoginWthNullPwd()
    {
        Authenticator auth = new Authenticator();
        String user = "abc1234";
        String pwd = null;
        assertThrows(NullPointerException.class,()->{
           auth.login(user,pwd);
        });
        //boolean res = auth.login(user,pwd);
        //assertTrue(res);
        System.out.println("test3 run successfully");


    }


    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeMethod() throws InterruptedException
    {
        Authenticator auth = new Authenticator();

        auth.timeout();
    }


}
