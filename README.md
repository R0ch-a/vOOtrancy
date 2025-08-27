# vOOtrancy

# Escolha de padrões

## Padrão estrutural — MVC
Escolhi MVC porque foi requisitado pelo professor e é a abordagem otimizada para aplicações web com Spring Boot. MVC separa Model, View e Controller, o que facilita organização das 4 páginas, testabilidade, manutenção e a futura troca da camada de persistência (o histórico e o registro de passageiros é salvo em `.txt` nesta versão).

## Padrão comportamental — Template Method
Escolhi Template Method para modelar o fluxo de busca/reseva: existe um esqueleto de etapas (entrada de pesquisa → validação → salvar histórico → mostrar opções → entrada de passageiro → validação → salvar registro de passageiro → confirmar reserva) cuja ordem deve ser preservada, mas com passos que podem variar conforme regras (ex.: classe da passagem).
