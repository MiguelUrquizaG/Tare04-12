INSERT INTO usuario (id, email, username, password) VALUES (1, 'pepe@example.com', 'pepe', '1234');
INSERT INTO usuario (id, email, username, password) VALUES (2, 'maria@example.com', 'maria', 'abcd');
INSERT INTO usuario (id, email, username, password) VALUES (3, 'juan@example.com', 'juan', 'pass');



INSERT INTO red_social (id, nombre, fecha_creacion) VALUES (1, 'Facebook', '2004-02-04');
INSERT INTO red_social (id, nombre, fecha_creacion) VALUES (2, 'Twitter', '2006-03-21');
INSERT INTO red_social (id, nombre, fecha_creacion) VALUES (3, 'Instagram', '2010-10-06');



INSERT INTO red_social_usuario (red_social_id, usuario_id) VALUES (1, 1);
INSERT INTO red_social_usuario (red_social_id, usuario_id) VALUES (1, 2);
INSERT INTO red_social_usuario (red_social_id, usuario_id) VALUES (2, 1);
INSERT INTO red_social_usuario (red_social_id, usuario_id) VALUES (3, 2);
INSERT INTO red_social_usuario (red_social_id, usuario_id) VALUES (3, 3);
