key=input("Enter elements separated by ,(comma) for keys: ").split(',')
value=input("Enter elements separated by ,(comma) for values: ").split(',')
zip_iterator=zip(key,value)
my_dict=dict(zip_iterator)
print("Dict : ",my_dict)
inverted_dict={value: key for key,value in my_dict.items()}
print("Inverted Dict :",inverted_dict)
