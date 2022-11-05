package easy.tasks;



public class FloodFill {

    public  static int[][] floodFill(int[][] image, int sr, int sc, int color){
        if (sr > image.length && sc > image[0].length) return image;
        if (image[sr][sc] == color) return image;

        flood(image, sr, sc, color);

        return image;


    }
    private static void  flood (int[][] imageTable, int sRow, int sColumn, int color){
        int oldColor=imageTable[sRow][sColumn];
        imageTable[sRow][sColumn]=color;

       //go down
        if(sRow < imageTable.length-1 &&  imageTable[sRow+1][sColumn]==oldColor ){
            flood(imageTable, sRow+1, sColumn, color);
        }

        //go up
        if (sRow > 0 && imageTable[sRow-1][sColumn]==oldColor) {
            flood(imageTable, sRow-1, sColumn, color);
        }

        //go left
        if (sColumn > 0 && imageTable[sRow][sColumn-1]==oldColor) {
            flood(imageTable, sRow, sColumn-1, color);
        }

        //go right
        if (sColumn< imageTable[sRow].length-1 && imageTable[sRow][sColumn+1]==oldColor){
            flood(imageTable, sRow, sColumn+1, color);
        }

    }

    public static void main(String[] args) {
        int[][] table = new int[][]{{1,1,1}, {1,1,0}, {1,0,1} };
        int[][] table2 = new int[][]{{0,0,0}, {0,0,0} };
        int sr=1;
        int sc=1;
        int color = 2;
        int[][] ints = floodFill(table2, 1, 0, color);
        for(int i=0; i < ints.length; i++){
            for(int j= 0; j< ints[i].length; j++){
                System.out.println(ints[i][j]);
            }
        }
    }

  //  Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
}
