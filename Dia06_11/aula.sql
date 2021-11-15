create schema panacademy;
use panacademy;

create table categorias_filmes (
	id int unsigned not null auto_increment,
    nome varchar(50),
    classificacao enum('0', '12', '16', '18') not null,
    unique key(nome),
    primary key(id)
);

insert into categorias_filmes (nome, classificacao) values("Ação", "12");

insert into
	categorias_filmes (nome, classificacao)
values
	('Infantil', '0'),
    ('Fic. Cientifica', '12'),
    ('Aventura','0'),
    ('Comédia','12'),
    ('Terror','18');

-- selecionar todos
select * from categorias_filmes; 

-- selecionar coom especificos
select nome from categorias_filmes; 

select nome AS 'NOME DA CATEGORIA', id as 'cod' from categorias_filmes;

select *
from categorias_filmes
where classificacao = '12';

select *
from categorias_filmes
where id >= '0';

select id,
	concat(nome, ' ', classificacao) as nome_classificacao
from categorias_filmes;

insert into categorias_filmes (nome, classificacao) values("Documentário", "12");

insert into categorias_filmes (id, nome, classificacao) values(100, "Documentário", "12");

select *
from categorias_filmes;

delete from categorias_filmes
where id = 101;

select id,
	sum(id) as total
from categorias_filmes;

insert into categorias_filmes (nome, classificacao) values("Documentário", "12");

select *
from categorias_filmes;

select *
from categorias_filmes
group by id
order by id desc;

select id,
	avg(id) as media
from categorias_filmes;

select 
        count(*), 
        classificacao,
        group_concat(nome)        
from categorias_filmes
group by classificacao
order by nome ;