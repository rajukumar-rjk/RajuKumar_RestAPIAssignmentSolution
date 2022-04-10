insert into roles(role_id,name) values (default,'ADMIN');
insert into roles(role_id,name) values (default,'USER');

insert into users(user_id,username,password) values (default,'admin','$2a$12$7nVYkRlxy1oKer9rmUf.guOXd5lJK3BMEH52iWKpG8Caz0ZjnUN66');
insert into users(user_id,username,password) values (default,'raju','$2a$12$lsA94CsF2KYtdt4DLaUyBu1V0NdRTS5xPG9Xr1Md4IMPiHvLP9IIC');

insert into users_roles(role_id,user_id) values (1,1);
insert into users_roles(role_id,user_id) values (2,2);

insert into employee(id,first_name,last_name,email) values (default,'raju','kumar','rajukumar.rjk@gmail.com');
insert into employee(id,first_name,last_name,email) values (default,'rajnish','kumar','rajnishkumar@gmail.com');