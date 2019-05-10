package Adapters;

import java.util.HashMap;

public class HashAdapter extends HashMap {
    public HashAdapter(String[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            put(matrix[0][i], matrix[1][i]);
        }
    }
}
