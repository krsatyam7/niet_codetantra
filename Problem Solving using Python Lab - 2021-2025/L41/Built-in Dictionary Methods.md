# Built-in Dictionary Methods


## Q1


```python
s1a=input("data1: ")
s1b=input("data2: ")
s2a=input("data3: ")
s2b=input("data4: ")
l1a=s1a.split(",")
l1b=s1b.split(",")
l2a=s2a.split(",")
l2b=s2b.split(",")
d1=dict(zip(l1a,l1b))
d1s=sorted(d1.items())
print("sorted dictionary:",d1s)
print("copy of sorted dictionary:",d1s)
l1as=sorted(l1a)
print("sorted keys of dictionary:",l1as)
l1bs=sorted(l1b)
print("sorted values of dictionary:",l1bs)
d2=dict(zip(l2a,l2b))
d3={**d1, **d2}
d3=sorted(d3.items())
print("sorted dictionary after updation:",d3)
```

## Q2


```python
dct = {'1':'apple', '2':'orange', '3':'mango', '4':'banana'}
print("dct_keys = dct.keys()")
dct_keys = dct.keys()
print("dct_values = dct.values()")
dct_values = dct.values()
print("dct_keys_list = list(dct_keys)")
dct_keys_list = list(dct_keys)
print("dct_values_list = list(dct_values)")
dct_values_list = list(dct_values)
print("dct_keys_list =", sorted(dct_keys_list))
print("dct_values_list =", sorted(dct_values_list))
print("Combining both the keys and values list using zip");
print("zip(dct_keys_list, dct_values_list)")
zip_result = zip(dct_keys_list, dct_values_list)
print("Creating a list out of the zip result using list function")
zip_result_list = list(zip_result)
print("zip_result_list =", sorted(zip_result_list))
print("Finally creating the dictionary from the zip result list")
dict2 = dict(zip_result_list)
print("dict2 =", sorted(dict2.items()))
```

## Q3


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d=dict(zip(l1,l2))
print("elements:",sorted(d.items()))
print("sorted keys:",sorted(l1))
print("sorted values:",sorted(l2))
```
