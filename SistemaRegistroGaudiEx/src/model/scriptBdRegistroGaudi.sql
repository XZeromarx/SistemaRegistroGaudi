/**
 * Author:  XZeromarx
 * Created: Jun 28, 2018
 */

CREATE DATABASE registroGaudi;
USE registroGaudi;



CREATE TABLE tecnica( -- SELECT * FROM tecnica
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100)
);

INSERT INTO tecnica VALUES(NULL, 'Acuarela'),
                          (NULL, 'Óleo'),
                          (NULL, 'Fresco'),
                          (NULL, 'Temple'),
                          (NULL, 'Puntillismo');



CREATE TABLE genero( -- SELECT * FROM genero
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100)
);

INSERT INTO genero VALUES(NULL, 'Retrato'),
                          (NULL, 'Desnudo'),
                          (NULL, 'Naturaleza Muerta'),
                          (NULL, 'Pintura Paisajista'),
                          (NULL, 'Pintura Histórica');


CREATE TABLE encargado( -- SELECT * FROM encargado
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
rut VARCHAR(13) UNIQUE,
profesion VARCHAR(100),
anioIngreso INT
);

INSERT INTO encargado VALUES (NULL,'Luis','55-5','Ingeniero Civil',2001),
                             (NULL,'Claudio','66-6','Meteorólogo',2002),
                             (NULL,'Roberto','77-7','Profesor',2003);


CREATE TABLE sala( -- SELECT * FROM sala
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
cantidadLamparas INT,
temperatura INT,
cierreCentralizado BIT,
alarmaContraIncendios BIT,
encargado_fk INT,
FOREIGN KEY (encargado_fk) REFERENCES encargado(id)
);

INSERT INTO sala VALUES (NULL,'Sala 1', 1, 1,FALSE,FALSE,1),
                        (NULL,'Sala 2', 2, 2,TRUE,FALSE,2),
                        (NULL,'Sala 3', 3, 3,TRUE,TRUE,3);


CREATE TABLE usuario(
id INT AUTO_INCREMENT PRIMARY KEY,
nombreUsuario VARCHAR(100),
clave VARCHAR(40)
);

INSERT INTO usuario VALUES(NULL,'admin','admin');


CREATE TABLE autor(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
apellido VARCHAR(100),
rut VARCHAR(100),
nacionalidad VARCHAR(100)
);


INSERT INTO autor VALUES (NULL, 'Autor 01','Apellido 01','11-1','Nacionalidad 1'),
                         (NULL, 'Autor 02','Apellido 02','22-2','Nacionalidad 2'),
                         (NULL, 'Autor 03','Apellido 03','33-3','Nacionalidad 3');

CREATE TABLE obra( -- SELECT * FROM obra
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(200),
tamanio_alto INT,
tamanio_ancho INT,
anioCreacion INT,
tecnica_fk INT,
FOREIGN KEY (tecnica_fk) REFERENCES tecnica(id),
genero_fk INT,
FOREIGN KEY (genero_fk) REFERENCES genero(id),
sala_fk INT,
FOREIGN KEY (sala_fk) REFERENCES sala(id),
autor_fk INT,
FOREIGN KEY (autor_fk) REFERENCES autor(id)
);


INSERT INTO obra VALUES (NULL,'nombre obra 1',1,1,2000,1,1,1,1),
                        (NULL,'nombre obra 2',2,2,2001,2,2,2,2),
                        (NULL,'nombre obra 3',3,3,2002,3,3,3,3),
                        (NULL,'nombre obra 4',4,4,2003,4,4,1,3),
                        (NULL,'nombre obra 5',5,5,2004,5,5,3,2);


--getObras
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho',
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN autor ON obra.autor_fk = autor.id

--buscarObra
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho',
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN autor ON obra.autor_fk = autor.id
WHERE obra.nombre LIKE '%n%'



--getObrasYsalas
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho',
sala.nombre AS 'Ubicación' 
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN sala ON obra.sala_fk = sala.id
INNER JOIN autor ON obra.autor_fk = autor.id;

--eliminarObra
DELETE FROM obra
WHERE obra.id = '1'

--registrarObra
INSERT INTO obra VALUES (NULL,'nombre obra','alto',
                        'ancho',
                        'año creacion',
                        'fk tecnica',
                        'fk genero',
                        'fk sala',
                        'fk autor');



-- getSalas
SELECT nombre FROM sala;

-- getGeneros
SELECT nombre FROM genero;

-- getTecnicas
SELECT nombre FROM tecnica;

-- getAutores
SELECT nombre FROM autor;

--getusuario (usuario - contraseña)

SELECT nombreUsuario AS 'user', clave AS 'pass' FROM usuario
WHERE nombreUsuario = 'admin' AND clave = 'admin';