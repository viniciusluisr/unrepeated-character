# unrepeated-character


# Questão 3
# Tecnologias:
- maven para build da aplicação e gerenciamento de dependências
- Java 8
- Junit e Hamcrest para testes unitários

# Estratégias, design e arquitetura:
- Foi utilizado um HashSet para controlar os caracteres não repetidos. Os caracteres que não se repetem vão sendo armazenados na iteração da String passada como parâmetro, a cada iteração é verificado se o mesmo já existe no HashSet characteres, caso não exista, este é armazenado no ArrayList unrepeated, e caso ele exista no HashSet, este caracter é removido do ArrayList unrepeated. No final, eu adiciono todos os caracteres do ArrayList unrepeated que são os que não se repetiram durante a iteração e adiciono em um iterator que é responsável pela implementação dos métodos next() e hasNext() do contrato Stream.

# HOW TO USE
- Para usar o projeto é necessário ter o Java 8 e maven instalados, com isso, basta ir até a raiz do projeto onde o pom.xml está localizado e executar o comando mvn clean install
