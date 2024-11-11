def nearest_power_of_two(n):
	if n <= 0:
		return 1
	power = 1
	while power < n:
		power *= 2
	lower_power = power // 2
	if n - lower_power < power - n:
		return lower_power
	else:
		return power
n = int(input().strip())
result = nearest_power_of_two(n)
print(result)
