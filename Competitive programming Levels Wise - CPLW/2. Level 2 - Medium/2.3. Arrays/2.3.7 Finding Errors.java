package q95;
import java.util.*;
import java.util.stream.*;
public class CTJ95 {
	public static int Finding_Errors(int N, int M, List<String> Products, List<Float> Product_Prices, List<String> Product_Sold, List<Float> Sold_Price) {
		Map<String, Float> productPriceMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			productPriceMap.put(Products.get(i), Product_Prices.get(i));
		}
		int errorCount = 0;
		for (int j = 0; j < M; j++) {
			String soldProduct = Product_Sold.get(j);
			float soldPrice = Sold_Price.get(j);
			Float correctPrice = productPriceMap.get(soldProduct);
			if (correctPrice == null || !correctPrice.equals(soldPrice)) {
				errorCount++;
			}
		}
		return errorCount;
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		List<String> Products = Arrays.stream(args[2].split(",")).map(s -> s).collect(Collectors.toList());
		List<Float> Product_Prices = Arrays.stream(args[3].split(",")).map(s -> Float.parseFloat(s)).collect(Collectors.toList());
		List<String> Product_Sold = Arrays.stream(args[4].split(",")).map(s -> s).collect(Collectors.toList());
		List<Float> Sold_Price = Arrays.stream(args[5].split(",")).map(s -> Float.parseFloat(s)).collect(Collectors.toList());
		System.out.println(Finding_Errors(N, M, Products, Product_Prices, Product_Sold, Sold_Price));
	}
}
