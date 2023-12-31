import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void countBlanksInTextTest() throws Exception {
        Account account = new Account("Имя Тестовое");
        int actualResult = account.countBlanksInText();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkBlanksTest() throws Exception {
        Account account = new Account("Имя Тестовое");
        boolean actualResult = account.checkBlanks();
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkNameToEmbossTest() throws Exception {
        Account account = new Account("Имя Тестовое");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }
}
