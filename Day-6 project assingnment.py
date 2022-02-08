def mod_div(fun):
	def deno(a, b):
		if a < b :
			a, b = b, a
		return fun(a, b)
	return deno
	
@mod_div
def div(a, b):
	return  a // b
    
a, b = (int(i) for i in input("Enter two Numbers: ").split())
print(div(a,b))
