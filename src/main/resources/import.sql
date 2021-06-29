insert into preguntas (id_pregunta, nombre) values (1,'¿Cuál fue la mejor parte de su visita?');
insert into preguntas (id_pregunta, nombre) values (2,'¿Cuál fue la peor parte de su visita?');
insert into preguntas (id_pregunta, nombre) values (3,'¿Ha sido la primera vez en nuestro restaurante?');
insert into preguntas (id_pregunta, nombre) values (4,'¿Cómo oíste hablar de nosotros?');
insert into preguntas (id_pregunta, nombre) values (5,'¿Cada cuánto sueles venir?');
insert into preguntas (id_pregunta, nombre) values (6,'¿Cómo de probable es que vuelvas?');
insert into preguntas (id_pregunta, nombre) values (7,'¿Crees que nuestro restaurante es familiar?');
insert into preguntas (id_pregunta, nombre) values (8,'¿Nuestro horario es adecuado?');
insert into preguntas (id_pregunta, nombre) values (9,'¿Los asientos son cómodos?');
insert into preguntas (id_pregunta, nombre) values (10,'¿Estaban limpios los baños y el local?');
insert into preguntas (id_pregunta, nombre) values (11,'¿El tipo y el volumen de la música era el correcto?');
insert into preguntas (id_pregunta, nombre) values (12,'¿Cómo valorarías nuestra comida?');
insert into preguntas (id_pregunta, nombre) values (13,'¿Estás satisfecho con nuestra oferta de bebidas?');
insert into preguntas (id_pregunta, nombre) values (14,'¿Cómo calificarías la variedad de opciones de nuestro menú?');
insert into preguntas (id_pregunta, nombre) values (15,'¿El servicio fue atento y agradable?');
insert into preguntas (id_pregunta, nombre) values (16,'¿Te sirvieron lo suficientemente rápido?');
insert into preguntas (id_pregunta, nombre) values (17,'¿Fueron eficientes nuestros sistemas de pago?');

insert into respuestas(id_respuesta, nombre) values(1,'Sí');
insert into respuestas(id_respuesta, nombre) values(2,'No');
insert into respuestas(id_respuesta, nombre) values(3,'Muy probable');
insert into respuestas(id_respuesta, nombre) values(4,'Probable');
insert into respuestas(id_respuesta, nombre) values(5,'Improbable');
insert into respuestas(id_respuesta, nombre) values(6,'Muy improbable');
insert into respuestas(id_respuesta, nombre) values(7,'Muy lejos');
insert into respuestas(id_respuesta, nombre) values(8,'Medianamente lejos');
insert into respuestas(id_respuesta, nombre) values(9,'Cerca');
insert into respuestas(id_respuesta, nombre) values(10,'Muy cerca');
insert into respuestas(id_respuesta, nombre) values(11,'Muy mala');
insert into respuestas(id_respuesta, nombre) values(12,'Mala');
insert into respuestas(id_respuesta, nombre) values(13,'Buena');
insert into respuestas(id_respuesta, nombre) values(14,'Muy buena');
insert into respuestas(id_respuesta, nombre) values(15,'Muy pocas opciones');
insert into respuestas(id_respuesta, nombre) values(16,'Adecuada');
insert into respuestas(id_respuesta, nombre) values(17,'Demasiadas opciones');
insert into respuestas(id_respuesta, nombre) values(18,'La comida');
insert into respuestas(id_respuesta, nombre) values(19,'El servicio');
insert into respuestas(id_respuesta, nombre) values(20,'El precio');
insert into respuestas(id_respuesta, nombre) values(21,'El lugar');
insert into respuestas(id_respuesta, nombre) values(22,'Redes sociales');
insert into respuestas(id_respuesta, nombre) values(23,'Un amigo');
insert into respuestas(id_respuesta, nombre) values(24,'Internet');
insert into respuestas(id_respuesta, nombre) values(25,'A diario');
insert into respuestas(id_respuesta, nombre) values(26,'Cada semana');
insert into respuestas(id_respuesta, nombre) values(27,'Cada mes');
insert into respuestas(id_respuesta, nombre) values(28,'En ocasiones especiales');

insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(1,18);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(1,19);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(1,20);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(1,21);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(2,18);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(2,19);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(2,20);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(2,21);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(3,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(3,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(4,22);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(4,23);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(4,24);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(5,25);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(5,26);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(5,27);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(5,28);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(6,3);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(6,4);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(6,5);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(6,6);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(7,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(7,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(8,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(8,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(9,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(9,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(10,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(10,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(11,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(11,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(12,11);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(12,12);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(12,13);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(12,14);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(13,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(13,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(14,15);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(14,16);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(14,17);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(15,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(15,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(16,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(16,2);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(17,1);
insert into preguntas_respuestas(fk_pregunta, fk_respuesta) values(17,2);

insert into encuestas(id_encuesta, nombre) values(1,'Encuesta completa');
insert into encuestas(id_encuesta, nombre) values(2,'Encuesta general');
insert into encuestas(id_encuesta, nombre) values(3,'Encuesta de servicio');
insert into encuestas(id_encuesta, nombre) values(4,'Encuesta de experiencia');

insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,1);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,2);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,3);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,4);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,5);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,6);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,7);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,8);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,9);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,10);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,11);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,12);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,13);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,14);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,15);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,16);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(1,17);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,1);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,2);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,4);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,8);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,12);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,14);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,15);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(2,16);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,1);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,2);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,6);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,9);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,10);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,11);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,12);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,13);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,14);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,15);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,16);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(3,17);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,1);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,2);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,4);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,7);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,8);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,9);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,10);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,11);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,14);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,15);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,16);
insert into encuestas_preguntas(fk_encuesta, fk_pregunta) values(4,17);
