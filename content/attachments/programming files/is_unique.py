def main(): 
	s = "abqcdefg"  
	print(unique(s)) 

def unique(s):
    srted = ''.join(sorted(s))

    for i in range(len(s)-1):
        j = i+1
        if(srted[i] == srted[j]): 
            return False; 
    return True

main() 