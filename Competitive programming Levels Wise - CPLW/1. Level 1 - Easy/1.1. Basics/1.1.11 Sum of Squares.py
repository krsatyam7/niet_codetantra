def sum_of_squares_of_digits(n):
	return sum(int(digit) ** 2 for digit in str(n))
def is_favouite_number(n):
	seen = set()
	while n != 1:
		if n in {89, 145,42, 20, 4, 16, 37, 58}:
			return False
		if n in seen:
			return False
		seen.add(n)
		n = sum_of_squares_of_digits(n)
	return True
n = int(input())
if is_favouite_number(n):
	print("Yes")
else:
	print("No")
