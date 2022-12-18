#Implementation of Tower Of Hanoi
def TowerOfHanoi(n,from_rod,to_rod,aux_rod):
	if n == 1:
		print("Move disk 1 from source",from_rod,"to destination",to_rod)
		return
	TowerOfHanoi(n-1,from_rod,aux_rod,to_rod)
	print("Move disk",n,"from source",from_rod,"to destination",to_rod)
	TowerOfHanoi(n-1,aux_rod,to_rod,from_rod)
#Driver Code
n = int(input(" enter no of disk"))
TowerOfHanoi(n,'A','B','C')
#A,C,B are the name of rods
