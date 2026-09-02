def ordenar(lst):
    if not lst:
        return lst
    pivote = lst[0]
    cola = lst[1:]
    lst1 = list(filter(lambda v: v < pivote, cola))
    lst2 = list(filter(lambda v: v >= pivote, cola))
    return ordenar(lst1) + [pivote] + ordenar(lst2)
    
print(ordenar([415,201,617,201,705]))
