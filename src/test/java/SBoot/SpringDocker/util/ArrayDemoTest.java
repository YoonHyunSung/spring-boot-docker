package SBoot.SpringDocker.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock
    ArrayDemo arrayDemo;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void fill() {
    }

    @Test
    void test_createIntegerArray_if_minus() {
        int[] arr =arrayDemo.createIntegerArray(1,6);
        String a = "";
        for (int i : arr){
            a +=i;
        }
        System.out.println(a);
    }
}