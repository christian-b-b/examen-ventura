INSERT INTO usuarios(username,password,nombre,apellido,email,enabled) VALUES('chris','$2a$10$EhDjxgOWM.uLx9apm7rcJ.j.aZkdpJj4Zs1NgPClyCRzKeen4Z6X6','Christian','Baldeón','cbaldeon.com@gmail.com',true);
INSERT INTO usuarios(username,password,nombre,apellido,email,enabled) VALUES('leo','$2a$10$VsuE2gMnJ2s9wP0YLpR5xuj4fPgHxqN2hMHRvt.UZK3fErI8JzYnK','Leonardo','Rodriguez','leo@gmail.com',true);

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(2,1);