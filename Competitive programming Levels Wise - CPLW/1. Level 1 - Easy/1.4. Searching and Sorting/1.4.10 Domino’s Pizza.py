import sys
m = int(sys.argv[1])
ranks = [int(x) for x in sys.argv[2].split(',')]
def minimumTimeToCompleteTheOrder(m, ranks):
	def can_make_pizzas_in_time(t):
		total_pizzas = 0
		for r in ranks:
			k = 0
			time_spent = 0
			while True:
				k += 1
				time_spent += k * r
				if time_spent > t:
					break
				total_pizzas += 1
				if total_pizzas >= m:
					return True
		return total_pizzas >= m
	left, right = 0, max(ranks) * (m * (m + 1)) // 2
	while left < right:
		mid = (left + right) // 2
		if can_make_pizzas_in_time(mid):
			right = mid
		else:
			left = mid + 1
	return left
print(minimumTimeToCompleteTheOrder(m, ranks))
