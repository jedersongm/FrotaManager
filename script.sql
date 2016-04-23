

create table funcionario(
  cod serial not null unique,
  nome varchar(100) not null,
  email varchar(100) not null unique,
  telefone varchar(12) not null,
  celularEmpresa varchar(12),
  dataNascimento varchar(10) not null,
  sexo varchar(9) not null,
  CNH varchar(20),
  foto varchar(50),
  senha varchar(30) not null,
  cargo varchar(50) not null,
  numero integer,
  rua varchar(100),
  bairro varchar(100),
  cidade varchar(100) not null,
  estado varchar(2) not null,
  CEP varchar(10) not null,
  primary key(cod)
  );

  create table veiculo(
    cod serial not null unique,
    marca varchar(30) not null,
    modelo varchar(30) not null,
    ano varchar(4) not null,
    placa varchar(8) not null unique,
    renavan varchar(20) not null unique,
    cor varchar(10) not null,
    km integer not null,
    primary key(cod)
  );

  create table locacao(
    codFuncionario integer not null,
    codVeiculo integer not null,
    kmSaida integer not null,
    kmChegada integer,
    saida varchar(10) not null,
    chegada varchar(10),
    primary key(codFuncionario, codVeiculo),
    foreign key(codFuncionario) references funcionario(cod) on delete restrict on update cascade,
    foreign key(codVeiculo) references veiculo(cod) on delete restrict on update cascade
  );

  create table reserva(
    codFuncionario integer not null,
    codVeiculo integer not null,
    
  );
