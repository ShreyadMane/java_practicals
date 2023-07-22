public class Matrixaddition {

    int a[][] = {{1,2,3},{2,3,4},{1,4,5}};

    int b[][] = {{1,2,4},{2,3,6},{3,1,5}};

    int c[][] = new int [3][3];

    void addmatrix(){

        int i,j;
        for(i=0;i< 3;i++){

            for(j=0;j < 3;j++){

                c[i][j] = a[i][j] + b[i][j];
                }
        }
    }

void display(){

    int i,j;

    for(i=0;i < 3;i++){

        for(j=0;j < 3;j++){

            System.out.print (c[i][j]);

            }
        System.out.println("n");
        }
    }

public static void main(String[] args)
{
    Matrixaddition obj = new Matrixaddition();

    obj.addmatrix();
    obj.display();
}
}