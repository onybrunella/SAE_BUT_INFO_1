#Test unitaire de la fonction est_base
from biology import arn, arn_to_codons, codons_stop, codons_to_aa, est_adn, est_base, load_dico_codons_aa


def test_est_base():
    assert est_base("A")== True
    assert est_base("C")== True
    assert est_base("z")== False
    assert est_base("B")== False
    print("Test de la fonction est_base = ok")

test_est_base()


def test_est_adn():
    assert est_adn("ATGTCAAA") == True 
    assert est_adn("ATBOAATG") == False
    print("Test de la fonction est_adn = ok")

test_est_adn()


#Test unitaire de la fonction est_arn
def test_arn():
    assert arn("ATGTCAAA") == ("AUGUCAAA")
    assert arn("ATGTCZAA") == None
    assert arn("AGCGGAAA") == ("AGCGGAAA")
    print("Test de la fonction arn = ok")

test_arn()


#Test unitaire de la fonction est_arn
def test_arn_to_codons():
    assert arn_to_codons("CGUUAGGGG") == ["CGU", "UAG", "GGG"]
    assert arn_to_codons("CGUAAU") == ["CGU", "AAU"]
    assert arn_to_codons("CGUAAUGC") == ["CGU", "AAU"]
    assert arn_to_codons("CGUBAGGGG") == None
    print("Test de la fonction arn_to_codons = ok")

test_arn_to_codons()


#Test unitaire de la fonction load_dico_codons_aa 
def test_load_dico_codons_aa():
    assert load_dico_codons_aa() == 
    assert load_dico_codons_aa() == 
    assert load_dico_codons_aa() == 
    print("Test de la fonction load_dico_codons_aa = ok")

test_load_dico_codons_aa()


#Test unitaire de la fonction codons_stop
def test_codons_stop():
    assert codons_stop() == 
    assert codons_stop() == 
    assert codons_stop() == 
    assert codons_stop() == 
    print("Test de la fonction codons_stop = ok")

test_codons_stop()


#Test unitaire de la fonction codons_to_aa
def test_codons_to_aa():
    assert codons_to_aa() == 
    assert codons_to_aa() == 
    assert codons_to_aa() == 
    print("Test de la fonction codons_to_aa = ok")
    
test_codons_to_aa()