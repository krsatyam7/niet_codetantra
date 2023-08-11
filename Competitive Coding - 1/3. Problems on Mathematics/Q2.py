import sys

r1 = float(sys.argv[1])
r2 = float(sys.argv[2])
r3 = float(sys.argv[3])

def combinedResistanceParallel(r1, r2, r3):
	# write from here
	try:
		return round((r1*r2*r3) / (r1*r2 + r2*r3 + r3*r1), 6)
	except:
		return -1
	# ends here

print("%1.6e" % combinedResistanceParallel(r1, r2, r3))
