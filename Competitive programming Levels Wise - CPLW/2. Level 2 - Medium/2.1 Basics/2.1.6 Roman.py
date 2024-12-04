def roman_to_int(s: str) -> int:
	values = {
	'I': 1,
	'V': 5,
	'X': 10,
	'L': 50,
	'C': 100,
	'D': 500,
	'M': 1000
	}
	
	total = 0
	prev_value = 0
	
	for char in reversed(s):
		current_value = values[char]
		
		if current_value < prev_value:
			total -= current_value
		else:
			total += current_value
		prev_value = current_value
	return total

if __name__ == "__main__":
	roman_numeral = input().strip()
	print(roman_to_int(roman_numeral))
