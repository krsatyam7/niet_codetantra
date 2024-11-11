package q12;
import java.util.*;
import java.util.stream.*;
public class CTJ12 {
	public static float TotalPaintingCost (int M, int N, List<Float> SurfaceAreaOfWalls) {
		float ans = 0;
		for(int i =0;i<M+N;i++){
			if(i<M){
			ans += SurfaceAreaOfWalls.get(i)*20;
			}
			else{
				ans += SurfaceAreaOfWalls.get(i)*15;
			}
		}
		return ans;
	}
public static void main(String[] args) {
	int M = Integer.parseInt(args[0]);
	int N = Integer.parseInt(args[1]);
	List<Float> SurfaceAreaOfWalls = Arrays.stream(args[2].split(",")).map(s ->
	Float.parseFloat(s)).collect(Collectors.toList());
	System.out.println(String.format("%1.6e", TotalPaintingCost (M, N, SurfaceAreaOfWalls)));
}
}
