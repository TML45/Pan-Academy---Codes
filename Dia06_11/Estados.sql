create schema Atividade1;
use Atividade1;

create table estado (
	id int unsigned not null auto_increment,
    nome varchar(50),
    sigla enum('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES','GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR','PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC','SP', 'SE', 'TO') not null,
    regiao enum('SUL', 'SUDESTE', 'CENTRO-OESTE', 'NORTE', 'NORDESTE') not null,
    populacao int unsigned not null,
    unique key(nome),
    primary key(id)
);

insert into
	estado (id, nome, sigla, regiao, populacao)
values
	(1, 'Acre', 'AC', 'NORTE', 795145),
    (2, 'Alagoas', 'AL', 'NORDESTE', 3327551),
    (3, 'Amapá', 'AP', 'NORTE', 756500),
    (4, 'Amazonas', 'AM', 'NORTE', 3893763),
    (5, 'Bahia', 'BA', 'NORDESTE', 15150143);
    
insert into estado (id, nome, sigla, regiao, populacao) values (1, 'Acre', 'AC', 'NORTE', 795145);
insert into estado (nome, sigla, regiao, populacao) values ('Alagoas', 'AL', 'NORDESTE', 3327551);
    
insert into
	estado (nome, sigla, regiao, populacao)
values
    ('Amapá', 'AP', 'NORTE', 756500),
    ('Amazonas', 'AM', 'NORTE', 3893763),
    ('Bahia', 'BA', 'NORDESTE', 15150143);

insert into
	estado (nome, sigla, regiao, populacao)
values    
    ('Ceará', 'CE', 'NORDESTE', 8867448),
    ('Distrito Federral', 'DF', 'CENTRO-OESTE', 267869),
    ('Espírito Santo', 'ES', 'SUDESTE', 3894899),
    ('Goiás', 'GO', 'CENTRO-OESTE', 6551322),
    ('Maranhão', 'MA', 'NORDESTE', 6861924),
    ('Mato Grosso', 'MT', 'CENTRO-OESTE', 3236578),
    ('Mato Grosso do Sul', 'MS', 'CENTRO-OESTE', 2630098),
    ('Minas Gerais', 'MG', 'SUL', 20777672),
    ('Pará', 'PA', 'NORTE', 8101180),
    ('Paraná', 'PR', 'SUL', 11112062),
    ('São Paulo', 'SP', 'SUDESTE', 44169350);
    
select *
from estado
order by sigla desc;

select regiao,
        sum(populacao)
from estado
group by regiao;

select regiao,
        avg(populacao)
from estado
group by regiao;

select regiao,
         group_concat(nome)
from estado
group by regiao;