# Teste Técnico Target | Estágio 
Olá pessoal da Target, tudo certo? Este repositório contém as soluções para os exercícios propostos como parte do teste técnico para a vaga de estágio em desenvolvimento.
Gostaria de comentar/documentar os exercicios e como os solucionei, bem como as estratégias e raciocinios utilizados, para que tenham uma noção do nível de raciocínio lógico no qual eu estou.

<p align="center">
  <img height="150px" src="./img/coding.gif"><br>
</p>

## Linguagem 
Apesar de possuir um bom conhecimento em JavaScript (acredito que a sintaxe da linguagem permite mais flexibilidade), optei por desenvolver as soluções em Java, para demonstrar meu favoritismo hehe ☕

## Organização dos Arquivos
Cada solução de exercício se encontra em um arquivo .java separado, para fins de organização.

## Comentários no código
Mais especificidades estão descritas em formato de comentários em linha, presentes em todos os códigos, de forma simples e entendível.

## Estratégias e Raciocínios
- [Questão 1](https://github.com/mari4souza/teste-tecnico-target/blob/main/Questao1.java) - Basicamente acúmulo de valor em uma variável até que atinja certo ponto. Considerei a resolução simples.
- [Questão 2](https://github.com/mari4souza/teste-tecnico-target/blob/main/Questao2.java) - A sequencia de Fibonacci é um exercício comum para aprendizado de lógica e eu havia realizado um exercício parecido para estudar recursividade em estrutura de dados dias atrás, por isso considerei a resolução simples também.
- [Questão 3](https://github.com/mari4souza/teste-tecnico-target/blob/main/Questao3.java) - Foi tranquilo de identificar todas as sequencias, exceto a sequencia F, a qual tive grande dificuldade e queimei os neuronios tentando achar a lógica. Por fim, pesquisei sobre e descobri assistindo um professor no youtube. A lógica: números que quando escritos por extenso iniciam com a letra 'd'. No exercício, os números vinham para mim tipados como int e não como string (se a entrada do usuário fosse string eu poderia verificar com um for e array).
Então, eu desenvolvi como se a entrada do usuário fossem os números por extenso, e apenas os tres últimos numeros para que o mesmo não precisasse digitar a sequencia toda, e verifiquei com a funcao startsWith para Strings, o que talvez não seja a melhor solução, mas ainda é funcional. :)
Ademais, de acordo com minhas pesquisas, não existe uma função prória do java que transforme um número em seu formato por extenso, porém existem algumas classes criadas pelos prórios usuários que cumprem esta função e que poderiam ser utilizadas no exercício. Mas como essa solução é um pouco mais complexa, optei por seguir com a resolução anterior.
Neste link você pode ver estas classes: [soluções](https://www.guj.com.br/t/metodo-que-mostre-um-numero-por-extenso/50128). Este é o vídeo do professor que utilizei como referência: [video](https://www.youtube.com/watch?v=acmdZckAITI).
- [Questão 4](https://github.com/mari4souza/teste-tecnico-target/blob/main/Questao4.java) - Questão mais difícil para mim até o momento. Consegui entender a lógica por trás, porém ainda não tenho uma ideia de como transforar em código. Mas estou buscando soluções!
- [Questão 5](https://github.com/mari4souza/teste-tecnico-target/blob/main/Questao5.java) - Questão simples de inversão de string, implementei utilizando recursividade.
- [Redação sobre IAs](https://drive.google.com/file/d/1DR1o9ituhi3feTDbVjzCx_qElfIibHJs/view?usp=sharing) - Por fim, gostaria de deixar linkado o PDF com minha redação sobre o uso IAs, que já enviei pela Gupy mas apenas por garantia deixarei por aqui também. ;)

## Considerações Finais
Estas foram minhas experiências com os exercícios. Dei meu melhor para solucioná-los, como sempre. Agradeço à Target pela oportunidade de participar do teste técnico e espero que tenham gostado de minhas resoluções! ★
