package SBoot.SpringDocker.util;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Matrix {
    public int[][] createMatrix(int row, int col){
        int[][] matrix = new int[row][col];
        int k = 1;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j] = k;
                k++;
            }
        }
        return matrix;
    }
    public List<String> getNames(){
        ArrayList<String> list = new ArrayList<String>();
        return list;
    }
    public HashMap<String, Integer> findSome(){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        return hashMap;
    }
}
