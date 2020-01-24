# Devoir sur un TDD:

Ce projet a été créé dans le cadre d'un cours sur les Test Driven Developpement (TDD).

Il reprend une ancienne calculatrice sur laquelle les tests ont été faits.

# User Stories
1. En tant qu'utilisateur, je veux pouvoir faire des calculs pour me faciliter la vie.

2. En tant qu'utilisateur, je veux pouvoir faire une addition afin de pouvoir additionner les débits et crédits de mon compte en banque.

3. En tant qu'utilisateur, je veux pouvoir faire une soustraction afin de pouvoir soustraire les débits et crédits de mon compte en banque.

4. En tant qu'utilisateur, je veux pouvoir faire une multiplication afin de pouvoir multiplier des éléments.

5. En tant qu'utilisateur, je veux pouvoir faire une division afin de pouvoir diviser des éléments.

6. En tant qu'utilisateur, je veux pourvoir effecter une suite d'oppération afin de faire le solde de mon compte en banque.

7. En tant qu'utilisateur, je suis suseptible de me tromper : je dois pouvoir effacer et réinitaliser les calculs à 0 afin de reprendre mes calculs.

8. En tant qu'utilisateur, je veux pouvoir utiliser des nombres à virgule afin que le solde de mon compte en banque soit le plus juste possible.


# Jenkins:

This project is being cloned in Jenkins, using the following configutation 

## Freestyle project :

Build:

Set build status to "pending" on GitHub commit 

 	Commit context:		From Github propriety with fallback to job name.



## Pipeline project :

node('master') {

    git 'https://github.com/textSolver34761/Devoir.git'
    
}
