import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
	private int m;
	private int n;
	private WeightedQuickUnionUF qu;
	private int[][] grid;
	private ArrayList<Point> connections;

	/**
	 * initializes UnionFind structure, grid and connection list
	 * @param m
	 * @param n
	 */
	public Project1(int m, int n){
	// initialize UnionFind structure
 		this.m = m;
		this.n = n;
		grid = new int[m][n];		
	}

	/**
	 * Reads input from user (pair of connections presented as points), store the input in a list  
	 */
	public void read_input() {
		int num_connect = 0;

		StdIn si = new StdIn(System.in);
		System.out.println("Enter number of pairs of connections: ");
		num_connect = si.readInt();

		
		
	}

	/**
	 * converts point into an integer
	 * @param p
	 * @return
	 */

	public int map(Point p) {
		int mapValue = 0;
		int x = (int)p.getX();
		int y = (int)p.getY();
		
		mapValue = x * m + y + 1;
		return mapValue;
		
	}

	/***
	 * converts integer into a point
	 * @param i
	 * @return
	 */
	public  Point unmap(int i) {
		int x = 0;
		int y = 0;
		Point p = null;	
	
		if ( i % m == 0 ) {
			// edge of the matrix
			x = i / m;
			y = n - 1;
		} else {
			x = i / m;
			y = i % m;
			y -= 1;
		}
		// initilize P value
		p = Point(x, y);
		return p;
	}

	/***
	 * scans connections and populates UnionFind structure
	 */
	public void process_connections(){
		

	}

	/**
	 * retrieve the connected sets from the UnionFind structure
	 * @return connected sets
	 */	
	public ArrayList<Point> retrieve_connected_sets() {
		new ArrayList<Point> listp = new ArrayList<Point>();
	}

	/**
	 * Tests whether two Cells are connected in the grid
	 * @param p1
	 * @param p2
	 * @return
	 */
	public boolean is_adjacent(Point p1, Point p2) {
		boolean result = false;
		int p1x = (int)p1.getX();
		int p1y = (int)p1.getY();
		int p2x = (int)p2.getX();
		int p2y = (int)p2.getY();

		if (p1x == p2x) {
			if ( p1y - p2y == 1 || p1y - p2y == -1 )
				result = true;
		} else if (p1y == p2y) {
			if ( p1x - p2x == 1 || p1x - p2x == -1 )
				result = true;
		}

		return result;
	}

	/**
	 * outputs the boundaries and size of each connected set
	 * @param sets
	 */
	public void output_boundaries_size(ArrayList<Point> sets) {
		
	}

	public static void main(String args[]) {
		int m, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of grid(m n): ");
		m = input.nextInt();
		n = input.nextInt();

		Project1 project1 = new Project1(m,n);
		project1.read_input();
		project1.process_connections();
		ArrayList<Point> sets = project1.retrieve_connected_sets();
		project1.output_boundaries_size(sets);
	}
}
