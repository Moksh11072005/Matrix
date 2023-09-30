original_matrix = []
sorted_matrix = []
adduct_matrix = []
high_value = []
transposed_matrix = original_matrix
rows = int(input("Enter the number of rows : "))
columns = int(input("Enter the number of columns : "))
# input the matrix
for a in range(rows):
    c = []
    q = []
    for b in range(columns):
        d = int(input(f"Enter element {a+1},{b+1} : "))
        c.append(d)
        q.append(d)
    original_matrix.append(q)
    # create a bubble sort for the matrix
    g = len(c)
    for i in range(g):
        for j in range(0, g-i-1):
            if c[j] > c[j+1]:
                c[j], c[j+1] = c[j+1], c[j]
    sorted_matrix.append(c)
# print the original matrix
print("The Original Matrix is : ")
for e in range(rows):
    for f in range(columns):
        print(original_matrix[e][f], end=" ")
    print()
# print the sorted matrix
print("The Sorted Matrix is : ")
for h in range(rows):
    for k in range(columns):
        print(sorted_matrix[h][k], end=" ")
    print()
# add the original and sorted matrix
for l in range(rows):
    n = []
    for m in range(columns):
        n.append(original_matrix[l][m]+sorted_matrix[l][m])
    adduct_matrix.append(n)
# print the adduct matrix
print("The Adduct Matrix is : ")
for o in range(rows):
    for p in range(columns):
        print(adduct_matrix[o][p], end=" ")
    print()
# highest value list
print()
for q in range(rows):
    value = 0
    for r in range(columns):
        value = +adduct_matrix[q][r]
    high_value.append(value)
print(
    f"Row with the highest value is : {high_value.index(max(high_value))+1}")
print()
