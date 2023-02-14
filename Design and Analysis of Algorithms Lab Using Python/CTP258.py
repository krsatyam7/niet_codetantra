# Q3

def insertionSort(nlist):
	for index in range(1,len(nlist)):
		currentvalue = nlist[index]
		position = index
		while position>0 and nlist[position-1]>currentvalue:
			nlist[position]=nlist[position-1]
			position = position-1
		nlist[position]=currentvalue


n = int(input())
nlist = list(map(int,input().split()))
insertionSort(nlist)
print(' '.join(str(x) for x in nlist),"")
