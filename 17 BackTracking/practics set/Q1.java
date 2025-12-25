public class Q1 {
    public static void printSol(int sol[][]){
        int n = sol.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" " + sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][] , int x, int y){
       // x and y outside maze then return false
       return (x >= 0 && x<maze.length && y<maze.length && maze[x][y] == 1);   
    }

    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int [N][N];
        if(solveMazeUtil(maze, 0, 0, sol) == false){
            System.out.print("Solution does't exists");
            return false;
        }
        printSol(sol);
        return true;
    }

    public static  boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]){
        int n = maze.length;
        if(x == n-1 && y == n-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y) == true){
            if(sol[x][y] ==1){
                return false;
            }
            sol[x][y] = 1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}};
        
        solveMaze(maze);
    }
}
