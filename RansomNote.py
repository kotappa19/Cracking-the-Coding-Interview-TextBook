str1,str2==input().split()
a=list(str1)
b=list(str2)
arrcount={}
for i in range(0,a.count):
    if a[i]=='\0':
        continue
    count=1
    for j in range(i+1,a.count):
        if a[i]==a[j]:
            count+=1
            a[j]='\0'