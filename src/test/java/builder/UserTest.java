package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = User.builder().name("Martusia").age(81).gender("flower").race("european").occupation("singer").occupation("walker").build();
        assertEquals(user.toString(), "User(name=Martusia, age=81, gender=flower, race=european, occupations=[singer, walker])");
    }
}