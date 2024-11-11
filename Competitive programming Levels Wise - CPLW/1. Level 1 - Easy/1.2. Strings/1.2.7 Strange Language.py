def largest_lexicographical_rotation(word):
	doubled_word = word * 2
	max_rotation = word
	for i in range(1, len(word)):
		rotation = doubled_word[i:i + len(word)]
		if rotation > max_rotation:
			max_rotation = rotation
	return max_rotation

N = int(input())
results = []
for _ in range(N):
	word = input().strip()
	results.append(largest_lexicographical_rotation(word))

for result in results:
	print(result)
