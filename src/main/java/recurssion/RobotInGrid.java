package recurssion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Justin on 23/05/2017.
 */

/**
 * if maze vallue is -1 then no path
 */
public class RobotInGrid {

    public List<Point> getPath(boolean [][] maze){
        if(maze == null || maze.length==0) return null;
        List<Point> path = new ArrayList<Point>();
        HashSet<Point> failedPoints = new HashSet<>();
        if(getPath(maze, maze.length-1,maze[0].length-1,path, failedPoints)){
            return path;
        }
        return null;
    }

    private boolean getPath(boolean[][] maze, int row, int col, List<Point> path,HashSet<Point> failedPoints ) {
        if(row<0 || col<0 ||!maze[row][col]){
            return false;
        }
        Point p = new Point(row,col);
        if(failedPoints.contains(p)){
            return  false;
        }
        boolean isAtOrigin = (row==0) &&(col==0);
        if(isAtOrigin || getPath(maze,row-1,col,path, failedPoints) || getPath(maze,row,col-1,path,failedPoints)){

            path.add(p);
            return true;
        }
        failedPoints.add(p);
        return  false;
    }
}
