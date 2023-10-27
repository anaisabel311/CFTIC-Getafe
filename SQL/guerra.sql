"CREO LA TABLA DE VEHICULOS DE GUERRA"

DROP TABLE IF EXISTS TB_VEHICULOS_GUERRA;

CREATE TABLE TB_VEHICULOS_GUERRA(
	id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR (20) NOT NULL,
	ataque DECIMAL (2,1) NOT NULL,
	defensa DECIMAL (2,1) NOT NULL,
	tipo INTEGER NOT NULL
);

INSERT INTO TB_VEHICULOS_GUERRA (nombre,ataque,defensa,tipo)
values ("HALCÓN MILENARIO", 5,7,1);
INSERT INTO TB_VEHICULOS_GUERRA (nombre,ataque,defensa,tipo)
values ("PANZER V", 3,8,2);

SELECT * FROM TB_VEHICULOS_GUERRA;

"CREO LA TABLA DE GUERREROS"

DROP TABLE IF EXISTS TB_GUERRERO;

CREATE TABLE TB_GUERRERO(
	id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR (45) NOT NULL,
	tipo VARCHAR (45) NOT NULL,
	fuerza DECIMAL (2,1) NOT NULL,
	resistencia DECIMAL (2,1) NOT NULL,
	vehiculo_id INTEGER NOT NULL
);

INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 1", "TIERRA",7,2,2);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 2", "TIERRA",7,2,2);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 3", "TIERRA",7,2,2);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 4", "TIERRA",7,2,2);

INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 5", "AIRE",7,2,1);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 6", "AIRE",7,2,1);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 7", "AIRE",7,2,1);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 8", "AIRE",7,2,1);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 9", "AIRE",7,2,1);
INSERT INTO TB_GUERRERO (nombre,tipo,fuerza,resistencia,vehiculo_id)
values ("GUERRERO 10", "AIRE",7,2,1);


SELECT * FROM TB_GUERRERO;



