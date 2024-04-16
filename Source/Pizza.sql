create database pizza;
use pizza;
create table ort
(
	ort_id int(11) auto_increment,
    ort_name varchar(255) not null,
    primary key (ort_id)
);

insert into ort values
(default,"Mainz"),
(default,"Berlin"),
(default,"Essen");


create table PLz
(
	plz_id int(11) auto_increment,
    plz varchar(255) not null,
    ort_id int(11) not null,
    primary key (plz_id),
    foreign key (ort_id) references ort(ort_id)
);

insert into plz values 
(default,"11111",1),
(default,"22222",2),
(default,"33333",3);

create table kunde 
(
	kunde_id int (11) auto_increment,
    plz_id int(11),
    kunde_vorname varchar(255),
    kunde_nachname varchar (255) not null,
    kunde_tel varchar(255) not null,
    kunde_str varchar(255) not null,
    kunde_hausnr varchar(255) not null,
    kunde_Etage varchar(255) not null,
    primary key (kunde_id),
    foreign key (plz_id) references plz(plz_id)
);

insert into kunde values
(default,1,"Hans","Mayer","12345","Baumweg","7",3),
(default,2,"Klaus","Schmidt","234553","Kantstraße","29",1),
(default,3,"Peter","Müller","7653453","Bambahn","11",5);


create table pizza
(
	pizza_id int(11) auto_increment,
    pizza_name varchar(255) not null,
    Pizza_preis float(7,2) not null,
    
    primary key (pizza_id)
);

insert into pizza values
(default,"Margherita",3.33),
(default,"Salami",4.44),
(default,"Hawaii",5.55);

create table bestellung
(
	bestellung_id int(11) auto_increment,
    kunde_id int(11) not null,
    datum date,
    primary key (bestellung_id),
    foreign key (kunde_id) references kunde(kunde_id)
);

create table bestellung_pizza
(
	bestellung_id int(11) not null,
    pizza_id int(11) not null,
    foreign key (bestellung_id) references bestellung(bestellung_id),
    foreign key (pizza_id) references pizza(pizza_id)
);

create table Lagerinhalt
(
	lagerinhalt_id int(11) auto_increment,
    Lagerinhalt_name varchar(255) not null,
    Lagerinhalt_menge float(7,2) null,
    Lagerinhalt_kilopreis float(7,2) not null,
    primary key (lagerinhalt_id)
);

insert into lagerinhalt values
(default,"Teig",25,0.15),
(default,"Käse",12,0.20),
(default,"Salami",13,0.25),
(default,"Schinken",12.55,0.30),
(default,"Ananas",12.30,0.25),
(default,"Tomatensoße",7,0.10);

create table Zutaten
(
	pizza_id int(11) not null,
    lagerinhalt_id int(11),
    Zutaten_menge float(7,2) not null,
    foreign key (pizza_id) references pizza(pizza_id),
    foreign key (lagerinhalt_id) references lagerinhalt(lagerinhalt_id)
);

insert into Zutaten values
(1,1,0.2),
(1,2,0.1),
(1,6,0.05),
(2,1,0.2),
(2,2,0.1),
(2,3,0.1),
(2,6,0.05),
(3,1,0.2),
(3,2,0.1),
(3,4,0.1),
(3,5,0.1),
(3,6,0.05);
