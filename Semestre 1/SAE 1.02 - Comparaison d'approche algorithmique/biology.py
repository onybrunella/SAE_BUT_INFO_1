def est_base(c):
    if c == "A" or c == "T" or c == "G" or c == "C":
        return True
    return False


def est_adn(s):
    i=0
    car=len(s)
    compteur=0
    while i<car:
        if s[i]=='A' or s[i]=='T' or s[i]=='G' or s[i]=='C':
            compteur+=1
        i+=1
    if compteur==car:
        return True
    return False


def arn(adn):
    n=est_adn(adn)
    j=""
    i=0
    while i<len(adn) and n==True:
        if adn[i]=="T":
            j+="U"
        else:
            j+=adn[i]
        i+=1
    if n==False:
        return None
    return j


def arn_to_codons(arn):
    n=est_adn(arn)
    i=0
    j=0
    c=""
    t=[]
    while i<len(arn)and n==True:
        c+=arn[i]
        i+=1
        j+=1
        if j==3:
           t.append(c)
           c=""
           j=0
    return t


import json
def load_dico_codons_aa(filename):
    t = open('data/codons_aa.json', 'r')
    fichier = t.read()
    t.close()
    filename = json.loads(fichier)
    return filename

def codons_stop(dico):
    t=[]
    tab=["A,U,G,C"]
    i=0
    while i<len:



def codons_to_aa(codons, dico):
    pass






def nextIndice(tab, ind, elements):
    pass


def decoupe_sequence(seq, start, stop):
    pass


def codons_to_seq_codantes(codons, dico):
    pass


def seq_codantes_to_seq_aas(seq_codantes, dico):
    pass


def adn_encode_molecule(adn, dico, molecule):
    pass
