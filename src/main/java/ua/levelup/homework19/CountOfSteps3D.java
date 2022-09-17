package ua.levelup.homework19;

/**
 * Нахождение количества возможных путей в 3-мерном пространстве;
 * @version 1.0  ;
 */
public class CountOfSteps3D {

    static final int x=3;
    static final int y=4;
    static final int z=5;

    static final int [][][] array=new int[x][y][z];

    public static void main(String[] args) {
        System.out.println(countOfSteps3D(x-1,y-1,z-1));
    }

    /**
     * Метод поиска возможного количества путей в 3D из точки (0,0,0),
     * при условии что точка движется только в направлении
     * x+1 или y+1 или z+1. Выполняется рекурсией;
     * @param x int размер пространства по оси x;
     * @param y int размер пространства по оси y;
     * @param z int размер пространства по оси z;
     * @return int возможное количество путей из точки (0,0,0) в точку (x,y,z).
     */
    private static int countOfSteps3D(int x, int y, int z){
        if (x==0 && z==0||x==0&&y==0||y==0&&z==0){
            return array[x][y][z]=1;
        }
        if (x==0){
            return array[x][y][z]=countOfSteps3D(x, y-1, z)+countOfSteps3D(x, y, z-1);
        }
        if (y==0){
            return array[x][y][z]=countOfSteps3D(x-1, y, z)+countOfSteps3D(x, y, z-1);
        }
        if (z==0){
            return array[x][y][z]=countOfSteps3D(x, y-1, z)+countOfSteps3D(x-1, y, z);
        }
        return array[x][y][z]=countOfSteps3D(x-1,y,z)+countOfSteps3D(x,y-1,z)+countOfSteps3D(x,y,z-1);
    }
}
