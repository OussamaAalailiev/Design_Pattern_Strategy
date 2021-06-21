#Design Pattern <<Strategy >>

- Strategy Pattern : définit une famille d'algorithmes, et les encapsuler chacuns 
  (c-à-d mettre chaque algorithme est implémenter dans une classe séparer) 
    + évoluer l'algorithme indépendamant de l'application cliente qui l'utilise à travers le concept du 
      Coupelage Faible (Relation à Une Interface (qui doit avoir une seule algorithme)).
  -Si on veut une algorithme qui se change dynamiquement selon le 
      contexte de l'app au moment de l'exécution, on doit utiliser le "Pattern Strategy".
  --Chaque opération qui contient une partie de l'algorithme qui change "methode combattre()",
      on va l'externaliser (l'encapsuler dans une classe comme "Comportement_Arme.ComportementHache")
      à partir l'implémentation d'une Interface Comportement_Arme.ComportementArme".
  -Inconvénient du Pattern Strategy : création de beaucoup de classes et d'objets en mémoire.