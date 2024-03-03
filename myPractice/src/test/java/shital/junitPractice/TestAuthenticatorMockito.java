package shital.junitPractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TestAuthenticatorMockito {


    @Mock
   // @Spy
    Authenticator authenticator;

    @Test
    public void mockitoDemo(){

        Boolean res = true;

        when(authenticator.login(anyString(),anyString())).thenReturn(res);
        assertTrue(authenticator.login("sagar","1234"));
    }
}
