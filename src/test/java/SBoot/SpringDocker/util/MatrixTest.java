package SBoot.SpringDocker.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MatrixTest {
    @Mock
    Matrix matrix;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        matrix = new Matrix();
    }

    @Test
    void createMatrix() {
        int[][] matrix1 = matrix.createMatrix(5,2);
        for (int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                System.out.println(matrix1[i][j]+"\t");
            }
        }
//        for (int[] i:matrix1){
//            System.out.println(i);
//            for (int j:i)
//            System.out.println(j);
//
//        }
    }

    @Test
    void getNames() {
    }

    @Test
    void findSome() {
    }
}