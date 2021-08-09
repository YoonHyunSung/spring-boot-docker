package SBoot.SpringDocker.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ManTest {
    @Mock
    Man man;
    @Mock
    BusinessMan businessMan;
    @BeforeEach
    void setUp() {
        businessMan = new BusinessMan("구글","과장");
        businessMan.setName("이순신");
    }
    @DisplayName("상속 예제")
    @Test
    public void test_showName(){
        assertEquals("이순신",businessMan.getName());

    }

}