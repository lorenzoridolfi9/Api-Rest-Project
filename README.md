# Api-Rest-Project
Api Rest for CRUD operations
Questo progetto è un'applicazione Java basata su Spring Boot per gestire studenti universitari e le loro competenze in ambito Data Science.

## Funzionalità

- Aggiunta di studenti con informazioni personali, come nome, cognome, data di nascita, corso di laurea e città.
- Modifica delle informazioni degli studenti, inclusa la modifica del corso di laurea.
- Visualizzazione dei dettagli degli studenti e delle loro competenze in ambito Data Science.
- Aggiunta e rimozione delle competenze in ambito Data Science per ciascuno studente.
- Recupero di informazioni sugli studenti e le loro competenze tramite API RESTful.

## Tecnologie utilizzate

- Java 19.0.2
- Spring Boot 2.5.4
- MySQL
- Maven

## Configurazione

1. Assicurati di avere installato Java Development Kit (JDK) versione 19.0.2 o successiva.
2. Configura un'istanza di database MySQL e assicurati di avere le credenziali di accesso corrette.
3. Modifica il file `application.properties` nella cartella `src/main/resources` per configurare la connessione al database.
4. Compila il progetto utilizzando Maven: `mvn clean install`.
5. Avvia l'applicazione: `java -jar target/imprimisProject.jar`.

## API

Le seguenti API sono disponibili per interagire con l'applicazione:

- **GET /api/studenti**: Ottiene la lista di tutti gli studenti.
- **GET /api/studenti/{id}**: Ottiene le informazioni dettagliate di uno studente specifico.
- **POST /api/studenti**: Aggiunge un nuovo studente.
- **PUT /api/studenti/{id}**: Modifica le informazioni di uno studente esistente.
- **DELETE /api/studenti/{id}**: Cancella uno studente.

Consulta la documentazione Swagger all'indirizzo [http://localhost:8080/swagger-ui.html] per ulteriori dettagli sulle API.

## Contributi

Sono benvenuti i contributi a questo progetto. Se desideri contribuire, segui i passaggi seguenti:

1. Forka il repository.
2. Crea un nuovo branch per il tuo contributo: `git checkout -b nome-branch`.
3. Effettua le modifiche desiderate.
4. Fai il commit delle tue modifiche: `git commit -m "Descrizione del commit"`.
5. Pusha il tuo branch al repository remoto: `git push origin nome-branch`.
6. Invia una pull request per revisionare le tue modifiche.

## Licenza

Questo progetto è concesso in licenza con i termini della licenza [inserisci il tipo di licenza].
