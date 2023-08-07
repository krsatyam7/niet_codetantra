import sys
arr = sys.argv[1].split(',')

def lengthIndexMatch(arr):
	ans=""
	for i in range(len(arr)):
		if len(arr[i])==i:
			ans+=arr[i]
	return ans if len(ans)!=0 else "no match found"
print(lengthIndexMatch(arr))
