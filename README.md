# Premissas 📋

Deseja-se criar um sistema para uso nos cursos da Devsuperior como parte do processo de aprendizado dos alunos. As premissas fundamentais para a concepção do sistema são as seguintes:

- 🧩 O sistema deve apresentar um modelo de domínio relativamente simples, mas abrangente, explorando vários tipos de relacionamentos entre as entidades de negócios, como muitos-para-um, muitos-para-muitos, etc.
- 📚 Deve possibilitar a aplicação de diversos conhecimentos importantes nas disciplinas fundamentais.
- 🚀 Deve conter as principais funcionalidades esperadas de um profissional iniciante, como telas de cadastro e fluxos de casos de uso.

# Visão Geral do Sistema 🌐

O sistema deve manter o cadastro de usuários, produtos e suas categorias, com as seguintes características:

## Usuários 👤

- Cada usuário possui:
  - Nome
  - Email
  - Telefone
  - Data de nascimento
  - Senha de acesso

## Produtos 🛒

- Dados de produtos incluem:
  - Nome
  - Descrição
  - Preço 💰
  - Imagem 📷

## Catálogo de Produtos 📦

- O sistema deve apresentar um catálogo de produtos que podem ser filtrados pelo nome do produto.

## Carrinho de Compras 🛒

- Os usuários podem:
  - Selecionar um produto para ver seus detalhes
  - Adicionar produtos ao carrinho de compras 🛒
  - Incluir e remover itens do carrinho de compras
  - Alterar as quantidades de cada item no carrinho de compras

## Pedidos 📦

- Quando o usuário decide encerrar o pedido, o pedido é salvo no sistema com o status "aguardando pagamento" 💳.
- Dados de um pedido:
  - Instante em que foi salvo ⏰
  - Status (pode ser: aguardando pagamento, pago, enviado, entregue e cancelado)
  - Lista de itens (cada item se refere a um produto e sua quantidade no pedido)

## Pagamento 💳

- Quando o usuário paga por um pedido, o instante do pagamento é registrado ⏰.

## Usuários 🧑‍🤝‍🧑

- Os usuários podem ser clientes ou administradores 👨‍💼👩‍💼.
- Todo usuário cadastrado por padrão é cliente.

## Funcionalidades para Usuários Não Identificados 🚶‍♂️

- Usuários não identificados podem se cadastrar no sistema.
- Podem navegar pelo catálogo de produtos.
- Podem adicionar produtos ao carrinho de compras 🛒.

## Funcionalidades para Clientes 👨‍🔧👩‍🔧

- Clientes podem:
  - Atualizar seu cadastro no sistema.
  - Registrar pedidos 📦.
  - Visualizar seus próprios pedidos.
  
## Funcionalidades para Administradores 👨‍💼👩‍💼

- Administradores têm acesso à área administrativa.
- Podem acessar os cadastros de usuários, produtos e categorias.
