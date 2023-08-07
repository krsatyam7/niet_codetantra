import sys
arr = [int(x) for x in sys.argv[1].split(',')]
s = int(sys.argv[2])

def pairsOfSum(arr, s):
  ls=[]
  ans=""
  for i in range(len(arr)):
    for j in range(i+1,len(arr)):
      if(arr[i]+arr[j]==s and i!=j):
        ans+="<"+str(i)+","+str(j)+">"+","
  if len(ans):
    return ans[:len(ans)-1]
  else:
    return "no such pairs"
  print(pairsOfSum(arr, s))
