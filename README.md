# Central_da_Transparencia
Projeto Fiap Challenge Tribunal de Contas 2021

Elaboração de Web Application por meio de projeto Spring MVC e Maven, com persistência em banco de dados SQL. Utilização de Design Patterns e boas práticas.

O projeto se baseia no usuário selecionar o município do estado de São Paulo que ele queira verificar os gastos públicos. Nossa aplicação busca as informações nos servidores do Portal da Transparência e disponibiliza informações como: nome das despesas, uma descrição, o valor e se o dado é consistente ou não.
É possível que não ser encontrado o portal de algum município, pois há falta de padrão em encontrar esses dados. Nesse caso, essa exceção é retornada ao usuário.

Este é apenas um protótipo, portanto os dados são abstratos e adquiridos de um banco de dados Oracle SQL (fornecido pela faculdade para cada aluno).
O código para a criação das tabelas no SQL estão no arquivo codigo_tabelas_sql.txt.
