# Triângulo (POO em Java)
65. Criando um método para obtermos os benefícios de reaproveitamento e delegação.
* Aula 65 do curso "Java COMPLETO Programação Orientada a Objetos + Projetos"
* Professor: Nélio Alves

## Sobre este curso
* Curso mais didático e completo de Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais.

## O exercício:
* Aula 65

Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).

Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):

p = a + b + c sobre 2

Exemplo:

Digite as medidas do triângulo X:
* 3.00
* 4.00
* 5.00

Digite as medidas do triângulo Y:
* 7.50
* 4.50
* 4.02

Triângulo X area: 6.0000

Triângulo Y area: 7.5638

Larger area: Y

## Discussão:
Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle (no meu caso: Program_Triangulo02)?

* 1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.
* 2) delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em outro lugar.

# TECH:

![JAVA](https://i.ibb.co/Xkf17zS/java.png)
![IDE](https://i.ibb.co/njMWJXP/eclipse-icon-1-3778a4cbe978d8dfd73c091706e26aa6c57c65aa-removebg-preview.png)
