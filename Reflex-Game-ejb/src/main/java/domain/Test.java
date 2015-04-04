package domain;

public class Test {

	public static void main(String[] args) {
		double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        D.show();        
     
        
        System.out.println();
        Matrix A = Matrix.random(5,5);
        A.show(); 


	}

}
