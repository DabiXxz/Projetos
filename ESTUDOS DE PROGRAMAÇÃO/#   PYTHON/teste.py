#nome = input("Digite o nome")
#sobrenome = input("Digite o Sobrenome")

#print( nome, sobrenome)

#a,b,c = 1,2,3
#print(a)
#a=2
#print(c)

#nota1 = 2
#nota2 = 3
#media = nota1 + nota2/2
#print(media)

valorOrig = 200
qtdParcela = 4
juros = 0

if(qtdParcela == 0 or qtrParcela ==1):
    juros = 0
else:
    if(qtdParcela == 2 or qtdParcela ==3):
        juros = 10
    elif(qtdParcela > 4):
        juros = 20

valorAtualizado = valorOrig + (valorOrig*juros/100)
prestMensal = valorAtualizado / qtdParcela

print(valorAtualizado)
print(prestMensal)
