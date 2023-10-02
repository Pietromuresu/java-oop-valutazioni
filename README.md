# java-oop-valutazioni

## Todo
State costruendo un programma per un corso di studi.
La valutazione complessiva viene fatta sulla percentuale di assenze (da `0` a `100`) e la media dei voti (da `0` a `5`):
- se lo studente ha fatto *più del 50% di assenze è bocciato*
- se ha fatto *tra il 25% e il 50% di assenze* è promosso solo se la *media dei voti è superiore a `2`*
- se ha fatto *meno del 25%* di assenze è promosso se la *media dei voti è superiore o uguale a 2*

### Implementazione
Creare un package chiamato `org.lessons.java.valutazioni`

#### Classi
##### `Studente` 
###### Attributi
- `id` dello studente (intero)
- `percentuale assenze` (intero)
- `media voti` (numero decimale)

###### Metodi
Un metodo che calcola se lo studente e' bocciato oppure no, in base ai voti e alle presenze

##### `Main` 
###### Metodi
`main` in cui creare un *array di 20 studenti*, popolarlo con `id studente` progressivo (da 1 a 20), *percentuale assenze e media voti generati random*. 

*Per ogni elemento dell’array* stampate a video le sue proprieta' e se lo studente e' promosso o bocciato.

Stampate inoltre quanti studenti sono stati promossi in tutto.

### Bonus++
#### Part 1
Ottenere due array separati e distinti, uno che contiene solo gli studenti promossi e uno che contiene solo gli studenti bocciati
> ATTENZIONE
> Gli array non devono essere ne sotto, ne sovra-dimensionati, ma della dimensione esatta corrispondente al contenuto

#### Part 2
Stampare l'`id` dello studente con* il voto piu' alto* tra i *promossi* e l'`id` dello studente con *voti piu' scarsi* nella lista dei *bocciati*
