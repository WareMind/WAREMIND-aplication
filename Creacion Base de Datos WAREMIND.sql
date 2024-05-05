create table WIREMIND;

create table Cliente( 
id_cliente varchar(8) not null unique, 
nombre varchar(100) not null, 
telefono varchar(9) not null,
email varchar(100),
primary key (id_cliente)
);

create table Pedido (
id_pedido varchar(5) not null unique,
fecha_pedido date not null,
id_cliente varchar(8) not null,
primary key (id_pedido),
foreign key (id_cliente) references Cliente (id_cliente)
);

create table Pedido_Producto(
id_producto varchar(5) not null, 
nombre varchar(100) not null, 
precio float not null, 
cantidad int not null, 
id_pedido varchar(5),
primary key (id_producto),
foreign key (id_pedido) references Pedido (id_pedido)
);

create table Almacen ( 
id_almacen varchar(5) not null unique, 
primary key (id_almacen) 
);

create table Empleado( 
id_empleado varchar(8) not null unique, 
nombre varchar(100) not null, 
contraseña varchar(50) not null,
puesto varchar(50) not null, 
telefono varchar(9) not null, 
id_almacen varchar(5) not null,
primary key (id_empleado),
foreign key (id_almacen) references Almacen (id_almacen)
);

create table Proveedor ( 
id_proveedor varchar(8) not null unique, 
nombre varchar(50) not null, 
telefono varchar(9) not null, 
email varchar(50),
primary key (id_proveedor) 
);

create table Proveedor_Producto(
id_producto varchar(5) not null,
nombre varchar(100) not null, 
precio float not null, 
cantidad int not null, 
fecha_entrada date not null, 
tipo varchar(50) not null, 
id_proveedor varchar(8) not null, 
primary key (id_producto),
foreign key (id_proveedor) references Proveedor (id_proveedor)
);

create table Producto( 
id_producto varchar(5) not null, 
nombre varchar(100) not null, 
precio float not null, 
cantidad int not null, 
fecha_entrada date not null, 
fecha_expiracion date,
tipo varchar(50) not null, 
ubicacion varchar(50) not null, 
id_almacen varchar(5) not null,
primary key (id_producto),
foreign key (id_almacen) references Almacen (id_almacen)
);

insert into Almacen (id_almacen) values ('1');
insert into Empleado (id_empleado, nombre, contraseña, puesto, telefono, id_almacen) values('98653214', 'Admin', 'admin', 'Administrador', '986532741', '1');