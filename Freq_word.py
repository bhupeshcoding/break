#write a python program to count the frequency of words appearing in a string 
# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
def freq_count():
    str=input("Enter sentence ")
    list=str.split()
    d={}
    
    for i in list:
        if i not in d.keys():
            d[i]=0
        d[i]=d[i]+1
    print(d)
freq_count()
