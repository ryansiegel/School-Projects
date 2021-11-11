/**
 * MatrixOperator is a math utility class which 
 * helps multiply and hopefully two 2x2 matrixes or called matrices.
 * If you are not familiar with matrix multiplication,
 *    https://en.wikipedia.org/wiki/Matrix_multiplication
 *    https://www.youtube.com/watch?v=Spr2F6jEuaw
 *    
 *    matrix addition logic - if you are not familiar visit these links below.
 *    https://www.youtube.com/watch?v=ZCmVpGv6_1g
 *    https://en.wikipedia.org/wiki/Matrix_addition
 * Here is a website to validate your results.
 *    https://matrix.reshish.com/multiplication.php
 *    
 *    
 */
public class MatrixOperator
{
    int [][] matrixone = new int[2][2];
    int [][] matrixtwo = new int[2][2];
    int [][] matrixresult = new int[2][2];
    
    
    public MatrixOperator()
    {
        initialize();
    }
    
    private void initialize()
    {
        /*
         * assigning values for matrixone
         *    | 1 1 |
         *    | 2 2 |
         */
        
        /*
         * assigning values for matrixtwo
         *    | 4 4 |
         *    | 5 5 |
         */
        //Assiging the first row of matrixone
        //| 1 1 |
        matrixone[0][0] = 1;
        matrixone[0][1] = 1;
        //Assiging the second row of matrixone
        //| 2 2 |
        matrixone[1][0] = 2;
        matrixone[1][1] = 2;
        
        //Assiging the first row of matrixtwo
        //| 4 4 |
        matrixtwo[0][0] = 4;
        matrixtwo[0][1] = 4;
        //Assiging the second row of matrixtwo
        //| 5 5 |
        matrixtwo[1][0] = 5;
        matrixtwo[1][1] = 5;
               
        
        //initializing matrix result to zeros
        // |0 0|
        // |0 0|
        matrixresult[0][0] = 0;
        matrixresult[0][1] = 0;
        matrixresult[1][0] = 0;
        matrixresult[1][1] = 0;
    }
    
    public void add()
    {
        /*    watch the below videos to understand the logic behind the matrix 
         *    add logic
         *    https://www.youtube.com/watch?v=ZCmVpGv6_1g
         *    https://en.wikipedia.org/wiki/Matrix_addition
         *    here is a website to validate your results.
         *    https://matrix.reshish.com/multiplication.php
         *    expected result for multiplying matrix 1 with matrix 2 would be
         *    | (1+4) (1+4) |
         *    | (2+5) (2+5) |
         *    
         *    so the result would look like
         *    |  5  5 |
         *    |  7  7 |
         */
        
        
        for (int c = 0; c < 2; c++) 
        {
            for (int d = 0; d < 2; d++) 
            {
                matrixresult[c][d] = matrixone[c][d] + matrixtwo[c][d];
            }
        }
    }

    public void multiply()
    {
        /*    watch the below videos to understand the logic behind the matrix 
         *    multiplication logic
         *    https://en.wikipedia.org/wiki/Matrix_multiplication
         *    https://www.youtube.com/watch?v=Spr2F6jEuaw
         *    here is a website to validate your results.
         *    https://matrix.reshish.com/multiplication.php
         *    expected result for multiplying matrix 1 with matrix 2 would be
         *    | ((1x4)+(1x5)) ((1x4)+(1x5)) |
         *    | ((2x4)+(2x5)) ((2x4)+(2x5)) |
         *    
         *    so the result would look like
         *    |  9  9 |
         *    | 18 18 |
         */
        
        //loop for matrixone row traversal
        for (int c = 0; c < 2; c++) 
        {
            //loop for matrixtwo column traversal
            for (int d = 0; d < 2; d++) 
            {
                int sum = 0;
                  //loop to traverse through  matrixone column and matrixtwo row
                  /**
                   *    sample iteration.
                   *    for c=0,d=0 and k=0,1
                   *    calculate the result for matrixresult[0][0] which is matrixresult[c][d].
                   *    which is ((1x4)+(1x5)) ...which when broken down 
                   *    for iteration k=0 and k =1 is
                   *    sum of (matrixone[c][0] * matrixtwo[0][d]) for k = 0
                   *    AND 
                   *           (matrixone[c][1] * matrixtwo[1][d]) for k = 1
                   */
                  for (int k = 0; k < 2; k++)
                  {
                      int s = matrixone[c][k] * matrixtwo[k][d];
                      sum = sum + s;
                  }
                  
                matrixresult[c][d] = sum;
                sum = 0;
            }
        }
    
    }
    
    public void printAll(String mathOperation)
    {
        //print the first matrix - matrixone
        printHelper("matrixone",matrixone);
        System.out.println(" ");
        
        //print the math operation
        System.out.println(mathOperation);
        System.out.println(" ");
        
        //print the second matrix - matrixtwo
        printHelper("matrixtwo",matrixtwo);
        System.out.println("=");
        System.out.println(" ");
        
        //print the result matrix - matrixresult
        printHelper("matrixone",matrixresult);
    }
    
    //Helper method to print a matrix
    private void printHelper(String matrixname, int[][] matrix)
    {
        
        System.out.println("Matrix Name: "+matrixname);
        for (int c = 0; c < 2; c++) 
        {
            System.out.print("|");
            for (int d = 0; d < 2; d++) 
            {
                System.out.format("%2d",matrix[c][d]);
                //System.out.print(matrix[c][d]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) throws Exception
    {
        MatrixOperator mm = new MatrixOperator();
        mm.multiply();
        mm.printAll("X");
               
        
        //This is for the student to complete. 
        MatrixOperator mmadd = new MatrixOperator();
        mmadd.add();
        mmadd.printAll("+");
        
        
    }
}   
