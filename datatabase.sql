create table paciente (
                          id int primary key,
                          nombre varchar(255),
                          apellido varchar(255),
                          fecha_nacimiento date
);

create table medico (
                        id int primary key,
                        nombre varchar(255),
                        apellido varchar(255),
                        fecha_nacimiento date,
                        ciudad varchar(25),
                        telefono varchar(50)
);

create table hospital (
                          cod_hospital int primary key,
                          nombre varchar (50),
                          ciudad varchar (50) ,
                          telefono varchar(50),
                          id_director integer references medico(id),
                          descripcion varchar(1000)
);

create table servicio (
                          id bigserial primary key,
                          nombre  varchar(50),
                          descripcion varchar(250),
                          camas_disponibles integer,
                          camas_ocupadas integer
);

create table consulta_medica (
                                 id bigserial primary key,
                                 paciente integer references paciente(id),
                                 hospital integer references hospital(cod_hospital),
                                 medico integer references medico(id),
                                 fecha_hora date,
                                 diagnostico varchar(500),
                                 servicio integer references servicio(id),
                                 reposo boolean,
                                 edad integer,
                                 altura double precision,
                                 peso double precision
);

create table hitoria_clinica (
    id bigserial primary key,
    id_paciente bigint references paciente(id),
    id_consulta bigint references consulta_medica(id)
);

create table hospital_medico (
                                 id bigserial primary key,
                                 id_medico bigint references medico(id),
                                 id_hospital bigint references hospital(cod_hospital),
                                 recide_hospital boolean
);

CREATE UNIQUE INDEX id_medico_hospital ON hospital_medico (id_medico, id_hospital);

create table hospital_servicio (
                                   id bigserial primary key,
                                   id_hospital bigint references hospital(cod_hospital),
                                   id_servicio bigint references servicio(id),
                                   total_camas integer
);

CREATE UNIQUE INDEX id_hospital_servicio ON hospital_servicio (id_servicio, cod_hospital);

create table medico_servicio (
                                 id bigserial primary key,
                                 id_medico bigint references medico(id),
                                 id_servicio bigint references servicio(id)
);

CREATE UNIQUE INDEX id_medico_servicio ON medico_servicio (id_medico, id_servicio);

