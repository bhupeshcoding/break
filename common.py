# Write a python program to find out common letters between two strings
#corner case: Hello and hello ,common -{e,l,o} ,h and H are treated as different, space will be also counted.
def common():
  str1 = input("Enter 1st String")
  str2 = input("Enter 2nd String")

  s1 =set(str1)
  s2=set(str2)

  c= s1 & s2
  print(c)

common()
