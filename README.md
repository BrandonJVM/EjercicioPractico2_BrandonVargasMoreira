# Ejercicio Practico 2 - Brandon Vargas Moreira

## Port 95 Issues, Port 78 Used Instead :)

Hi Mel,

I just want to let you know that I’m doing my best to complete this project in the best possible way. I’m the type of student who doesn’t like leaving things halfway. That being said, I got a bit confused at the beginning, and the project didn’t work for a whole hour. However, we’re pushing through, and I’m confident we’ll make it happen! 😊

### Achievements:
1. Successfully implemented functionality to read data from the "eventos" table.
2. .
3. .
4. .
5. insert needed on the DB as the users gave me a hard time, so basicly is a clone from the proyect DB 
Use gestioneventos;
CREATE TABLE User (
  userId INT NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(512) NOT NULL,
  name VARCHAR(20) NOT NULL,
  lastName VARCHAR(30) NOT NULL,
  email VARCHAR(75) NULL,
  phoneNumber VARCHAR(15) NULL,
  image varchar(1024),
  active boolean,
  PRIMARY KEY (userId))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table role (
  roleId INT NOT NULL AUTO_INCREMENT,
  name varchar(20),
  userId int,
  PRIMARY KEY (roleId),
  foreign key fk_rol_usuario (userId) references user(UserId)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

select * from eventos;
INSERT INTO User (username, password, name, lastName, email, phoneNumber, image, active)
VALUES
('Pedro', '$2a$10$P1.w58XvnaYQUQgZUCk4aO/RTRl8EValluCqB3S2VMLTbRt.tlre.', 'John', 'Doe', 'jdoe@example.com', '1234567890', 'https://example.com/images/jdoe.jpg', TRUE),
('Juan', '$2a$10$GkEj.ZzmQa/aEfDmtLIh3udIH5fMphx/35d0EYeqZL5uzgCJ0lQRi', 'Juan', 'Smith', 'asmith@example.com', '9876543210', 'https://example.com/images/asmith.jpg', TRUE),
('Jose', '$2a$10$koGR7eS22Pv5KdaVJKDcge04ZB53iMiw76.UjHPY.XyVYlYqXnPbO', 'Jose', 'Jones', 'mjones@example.com', '4561237890', 'https://example.com/images/mjones.jpg', TRUE);
insert into role (roleId, name, userId) values
 (1,'ROLE_ADMIN',1), (2,'ROLE_VENDEDOR',1), (3,'ROLE_USER',1),
 (4,'ROLE_VENDEDOR',2), (5,'ROLE_USER',2),
 (6,'ROLE_USER',3);
