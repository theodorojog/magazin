# magazin
Proiect EAP 2021
Ojog Theodor Gr253


Program de gestiune al inventarului unui magazin

Clase:

-Produs: memoreaza numele produsului, pretul sau, numarul de articole din depozit si din magazin, si procentul de reducere aplicat; variabila statica 'nrProduse' e folosita pentru a contoriza numarul tipurilor distincte de produse din gama.

afisare(): afiseaza integral daatle unui produs 
pretRaft():returneaza pretul platit de clienti dupa aplicarea reducerii 
vinde(): scade din numarul de articole din magazin sireturneaza valoarea acestora 
umpleRaft():transfera obiecte din depozit in magazin 
AruncaProduse(): scade numarul de produse din depozit 
produsNou/stergeProdus():modifica numarul produselor disctincte din gama

---Aliment: extinde clasa Produs; in plus memoreaza indicatii de pastrare si expunere 
---Menaj: extinde clasa Produs 
---Cosmetic: extinde clasa Produs

-Distribuitor: memoreaza numele, nr de telefon si adresa distribuitorilor.

afisare():afiseaza integral datele unui distribuitor 
compareTo(): folosita la sortarea listei
---Producator: pentru producatori se aplica o reducere la pretul produselor, etichetata "subventie"

Functionalitati ale programului, prin intermediul clasei Service: -Adaugarea de distribuitori noi in lista -Afisarea listei de distribuitori

Functionalitati care trebuiau sa fie in program: 
-Gestionarea produselor 
-Modificarea datelor precum procentul de reducere

Etapa II:
Clasa CsvLoader a fost creata pentru deschiderea si crearea fisierelor .csv
Clasa CsvLucratorComercial este folosita pentru a formata,citi si scrie datele sub format .csv pentru obiecte de tip LucratorComercial
Clasa Paznic este folosita pentru a formata,citi si scrie datele sub format .csv pentru obiecte de tip Paznic

Clasa Logger este folosita pentru a inregistra scrierea si citirea din fisierele .csv
