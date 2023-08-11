import sys
arr = sys.argv[1].split(',')
def lengthIndexMatch(arr):
    # write code from here
    ans=""
    for i in range(len(arr)):
        if len(arr[i])==i:
            ans+=arr[i]
    return ans if len(ans)!=0 else "no match found"
    # ends here
    
print(lengthIndexMatch(arr))
