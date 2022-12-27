def mostrarVogal(string, vogal): 
    vogais = [cada for cada in string if cada in vogal] 
    print(len(vogais)) 
    print(vogais)
    
vogais = "AEIOUaeiou"     
string = "Teste dE Logica"
mostrarVogal(string, vogais);
