package co.knry.algorithms.interview;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        int riverid=2;
        int newid=1;
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++) {
                int point = matrix[i][j];

                if (point==1) {
                    matrix[i][j] = riverid;

                    int down = 0;

                    if (j<matrix[i].length-1){
                        down = matrix[i+1][j];
                    }

                    if (down==1){
                        matrix[i+1][j]=riverid;
                    }

                    int right = 0;

                    if (j<matrix[i].length-1){
                        right = matrix[i][j+1];
                    }

                    if (right==1){
                        matrix[i][j+1]=riverid;
                    }
                    else {
                        newid++;
                        riverid++;
                    }
                }
                else if (point!=0){
                    riverid = matrix[i][j]+newid;
                }


            }
        }
        return result;
    }

}
