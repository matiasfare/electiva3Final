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
                          total_camas integer,
                          camas_disponibles integer,
                          camas_ocupadas integer
);

create table consulta_medica (
                                 id bigserial primary key,
                                 paciente integer references paciente(id),
                                 hospital integer references hospital(cod_hospital),
                                 medico integer references medico(id),
                                 fecha date,
                                 hora time,
                                 diagnostico varchar(500),
                                 servicio integer references servicio(id),
                                 reposo boolean,
                                 edad integer,
                                 altura double precision,
                                 peso double precision
);

create table hitoria_clinica (
    id bigserial primary key,
    id_paciente bigserial references paciente(id),
    id_consuta bigserial references consulta_medica(id)


);

create table hospital_medico (
                                 id_medico bigint references medico(id),
                                 id_hospital bigint references hospital(cod_hospital),
                                 PRIMARY KEY (id_hospital,id_medico),
                                 recide_hospital boolean
);

create table hospital_servicio (
                                   id_hospital bigint references hospital(cod_hospital),
                                   id_servicio bigint references servicio(id),
                                   PRIMARY KEY (id_hospital,id_servicio)
);

create table medico_servicio (
                                 id_medico bigint references medico(id),
                                 id_servicio bigint references servicio(id),
                                 PRIMARY KEY (id_medico,id_servicio)
);