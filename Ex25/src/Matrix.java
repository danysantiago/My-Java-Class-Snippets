import java.io.PrintStream;


public class Matrix {
	private int rows;
	private int columns;
	private double[][] elements;
	
	public Matrix(int rows, int columns){
		assert(rows >= 1 && columns >= 1);
		this.elements = new double[rows][columns];
		this.rows = rows;
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public double get(int row, int column){
		assert(row >=0 && row < this.rows);
		assert(column >=0 && column < this.columns);
		return this.elements[row][column];
	}
	
	public void set(int row, int column, double newValue){
		assert(row >=0 && row < this.rows);
		assert(column >=0 && column < this.columns);
		this.elements[row][column] = newValue;
	}
	
	public void print(PrintStream out){
		for (int i=0; i < this.rows; ++i){
			for (int j=0; j < this.columns; ++j){
				out.print(this.elements[i][j]+ " ");
			}
			out.println();
		}
	}
	
	public Matrix sum(Matrix M){
		Matrix result = null;
		assert(this.rows == M.rows && this.columns == M.columns);
		result = new Matrix(this.rows, this.columns);
		for (int i=0; i < this.rows; ++i){
			for (int j=0; j < this.columns; ++j){
				result.set(i,j, this.get(i,j) + M.get(i, j));
			}
		}
		return result;
	}
	
	public Matrix substract(Matrix M){
		Matrix result = null;
		assert(this.rows == M.rows && this.columns == M.columns);
		result = new Matrix(this.rows, this.columns);
		for (int i=0; i < this.rows; ++i){
			for (int j=0; j < this.columns; ++j){
				result.set(i,j, this.get(i,j) - M.get(i, j));
			}
		}
		return result;
	}
	
	public Matrix multiply(Matrix M){
		Matrix result = null;
		assert(this.columns == M.rows);
		result = new Matrix(this.rows, M.columns);
		for (int i =0; i < result.rows; ++i){
			for (int j=0; j < result.columns; ++j){
				for (int k = 0; k < this.columns; ++k){
					result.elements[i][j] += this.get(i, k)*M.get(k, j);
					// equivalent
					//result.set(i, j, result.get(i,j) + this.get(i, k)*M.get(k, j));
				}
			}
		}
		return result;
	}
	
	
	
	
	
	
	

}
