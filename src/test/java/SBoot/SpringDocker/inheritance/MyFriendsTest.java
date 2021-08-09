package SBoot.SpringDocker.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MyFriendsTest {
    @Mock
    MyFriends myFriends;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        myFriends = new MyFriends();
    }

    @Test
    void getFriends() {
        Friend[] returnFriends = myFriends.getFriends();
        for (Friend f:returnFriends){
            System.out.println(f.toString());
        }
        assertEquals("YOON",returnFriends[2].getName());
    }
}