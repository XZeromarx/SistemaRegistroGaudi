/**
 * Author:  XZeromarx
 * Created: Jun 28, 2018
 */

CREATE DATABASE registroGaudi; -- DROP DATABASE registroGaudi;
USE registroGaudi; -- USE mysql;



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

--registrarObra
DROP PROCEDURE IF EXISTS registrarObra;
DELIMITER $$
CREATE PROCEDURE registrarObra(_nombreObra VARCHAR(100), _tamanio VARCHAR(100),
                                _anio INT,  _tecnica VARCHAR(100),
                               _genero VARCHAR(100),  _sala VARCHAR(100),
                               _autor VARCHAR(100))
BEGIN

DECLARE _idTecnica INT DEFAULT 0;
DECLARE _idGenero INT DEFAULT 0;
DECLARE _idSala INT DEFAULT 0;
DECLARE _idAutor INT DEFAULT 0;
DECLARE _altura VARCHAR(100);
DECLARE _ancho VARCHAR(100);


SET _idTecnica = (SELECT id FROM tecnica WHERE nombre = _tecnica);
SET _idGenero = (SELECT id FROM genero WHERE nombre = _genero);
SET _idSala = (SELECT id FROM sala WHERE nombre = _sala);
SET _idAutor = (SELECT id FROM autor WHERE nombre = _autor);
SET _altura = (SELECT SUBSTRING_INDEX(_tamanio,'x',1));
SET _ancho = (SELECT SUBSTRING_INDEX(_tamanio,'x',-1));


INSERT INTO obra VALUES (NULL,_nombreObra,_altura,
                        _ancho, _anio,
                        _idTecnica, _idGenero,
                        _idSala, _idAutor);
END $$
DELIMITER;


-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS
-- CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS CONSULTAS


CALL registrarObra('obra','12x4',2010,'Acuarela','Retrato','Sala 1','Autor 01');





--getObras
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho'
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN autor ON obra.autor_fk = autor.id;

--buscarObra
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho'
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN autor ON obra.autor_fk = autor.id
WHERE obra.id = 3;



--getObrasYsalas
SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',
genero.nombre AS 'Género', anioCreacion AS 'Año de creación',
obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho',
sala.nombre AS 'Ubicación', obra.id AS 'Id Obra'
FROM obra
INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id
INNER JOIN genero ON obra.genero_fk = genero.id
INNER JOIN sala ON obra.sala_fk = sala.id
INNER JOIN autor ON obra.autor_fk = autor.id;

--eliminarObra
DELETE FROM obra
WHERE obra.id = '1'




-- getSalas
SELECT nombre FROM sala;

-- getGeneros
SELECT nombre FROM genero;

-- getTecnicas
SELECT nombre FROM tecnica;

-- getAutores
SELECT nombre FROM autor;

-- getEncargados
SELECT nombre FROM encargado;

--getusuario (usuario - contraseña)

SELECT nombreUsuario AS 'user', clave AS 'pass' FROM usuario
WHERE nombreUsuario = 'admin' AND clave = 'admin';