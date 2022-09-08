def mergesort(array):
	if len(array)>1:
		r=len(array)//2
		L=array[:r]
		M=array[r:]
		mergesort(L)
		mergesort(M)
		i=j=k=0
		while(i<len(L) and j<len(M)):
			if L[i]<M[j]:
				array[k]=L[i]
				i+=1
			else:
				array[k]=M[j]
				j+=1
			k+=1
		while(i<len(L)):
			array[k]=L[i]
			i+=1
			k+=1
		while(j<len(M)):
			array[k]=M[j]
			j+=1
			k+=1
size=int(input("Enter no ofelements"))
store=[]
print("enter elements")
for i in range(size):
	store.append(int(input()))
print("Given array is ")
print(store)
mergesort(store)
print("Sorted array is ")
print(store)
