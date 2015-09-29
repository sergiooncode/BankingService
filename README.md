- Open Eclipse or Spring Tool Suite (STS), click on File > Import and on Maven source select Existing Maven Projects. Browse choosing the BankingService folder as the Root Directory. Click Finish.

- Right button while being on top of the project on Package Explorer view and click on Run As > Maven build ... Insert 'clean install' in Goals, apply and run.

- This step assumes having Flyway installed (check http://flywaydb.org). While being on BankingService run the following command:

flyway -url=jdbc:postgresql://localhost:5432/bankingdb -user=banking -locations=filesystem:src/main/resources/db/migrations migrate

- Right button while being on top of the project on Package Explorer view and click Run on Server. On the next menu choose 'Manually define a new server' and from Apache folder choose Tomcat v7.0 Server. On right side of Server runtime environment click Add... and browse to where Apache Tomcat is. Click Next and then Finish.
