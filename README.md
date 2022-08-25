## PAYMENT KAFKA

É um sistema de pagamentos onde o objetivo é entender como funciona a mensageria no Apache Kafka, nele pude implementar bastantes coisas voltadas para essa stack como comunicação, disponibilidade e escalabilidade, implementando um sistema baseado em microsserviços com o ecossistema Spring utilizando boas práticas de programação aplicando conceitos SOLID, Clean Arch e padrões de projetos.

## TÉCNICAS
  
  - Java 17
  - Springboot
  - Apache Kafka
  - Kafdrop
  - Clean Arch
  - SOLID
  - POO
  - Docker
  - Docker Compose
  - Docker Hub
  

Para testá-lo, você precisará dos seguintes assistentes:

  - Postman ou Insomnia
  - Docker

Após der o git clone no projeto, abra o terminal no diretório do repositório e utilize o seguinte comando
```
docker-compose up
```
Se não quiser que o terminal fique travado, utilize este comando
```
docker-compose up -d
```
Após isso, só dar o request POST no Postman/Insomnia com o Body tipo JSON com esse payload
```
{
  "id": 10,
  "idUser": 20,
  "idProduct": 30,
  "cardNumber": 393829928282
}
```
