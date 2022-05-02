--1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE,email VARCHAR(100) olan bir tablo oluşturalım

CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

--2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Ted Ruggieri', '2021-08-17', 'truggieri0@xinhuanet.com');
insert into employee (name, birthday, email) values ('Marcus McChesney', '2022-03-10', 'mmcchesney1@mail.ru');
insert into employee (name, birthday, email) values ('Ranice Yantsurev', null, 'ryantsurev2@edublogs.org');
insert into employee (name, birthday, email) values ('Leigha Seabourne', '2022-03-31', 'lseabourne3@webeden.co.uk');
insert into employee (name, birthday, email) values ('Aarika Poyzer', '2021-06-22', 'apoyzer4@is.gd');
insert into employee (name, birthday, email) values ('Elnora Mordy', '2021-07-26', 'emordy5@psu.edu');
insert into employee (name, birthday, email) values ('Othelia Wiley', '2021-07-28', 'owiley6@fotki.com');
insert into employee (name, birthday, email) values ('Zea Kleisel', '2022-04-02', 'zkleisel7@slashdot.org');
insert into employee (name, birthday, email) values ('Uriel Dewing', '2021-07-25', 'udewing8@google.com.br');
insert into employee (name, birthday, email) values ('Mabelle Donisthorpe', '2021-12-17', null);
insert into employee (name, birthday, email) values ('Brunhilde Fetherstonhaugh', '2021-12-20', 'bfetherstonhaugha@arstechnica.com');
insert into employee (name, birthday, email) values ('Benjy Bloore', '2022-02-12', 'bblooreb@ihg.com');
insert into employee (name, birthday, email) values ('Shelbi Piers', '2021-06-29', 'spiersc@php.net');
insert into employee (name, birthday, email) values ('Hercules Kid', '2021-11-17', 'hkidd@wisc.edu');
insert into employee (name, birthday, email) values ('Erena Pole', '2021-12-10', 'epolee@acquirethisname.com');
insert into employee (name, birthday, email) values ('Rianon Pirelli', '2022-01-16', 'rpirellif@cocolog-nifty.com');
insert into employee (name, birthday, email) values ('Cosimo Gitsham', '2021-08-16', 'cgitshamg@moonfruit.com');
insert into employee (name, birthday, email) values ('Gunilla Grimoldby', '2022-01-22', 'ggrimoldbyh@newyorker.com');
insert into employee (name, birthday, email) values ('Case Pragnell', null, 'cpragnelli@goo.gl');
insert into employee (name, birthday, email) values ('Laurene Pawnsford', '2021-12-23', 'lpawnsfordj@reference.com');
insert into employee (name, birthday, email) values ('Marys Duerdin', null, 'mduerdink@bloglovin.com');
insert into employee (name, birthday, email) values ('Richie Catherine', '2021-10-03', 'rcatherinel@github.com');
insert into employee (name, birthday, email) values ('Genovera Boldecke', '2022-03-13', 'gboldeckem@virginia.edu');
insert into employee (name, birthday, email) values ('Arlyne Piscot', '2022-02-04', 'apiscotn@imageshack.us');
insert into employee (name, birthday, email) values ('Shanta Molian', '2021-11-25', 'smoliano@de.vu');
insert into employee (name, birthday, email) values ('Lanni Pearsey', '2021-09-21', 'lpearseyp@sciencedaily.com');
insert into employee (name, birthday, email) values ('James McGrae', null, 'jmcgraeq@canalblog.com');
insert into employee (name, birthday, email) values ('Meris Edge', null, 'medger@tripod.com');
insert into employee (name, birthday, email) values ('Lorenza Caldwell', '2021-10-08', null);
insert into employee (name, birthday, email) values ('Myles Farbrother', '2022-01-15', 'mfarbrothert@blinklist.com');
insert into employee (name, birthday, email) values ('Winne Reiglar', '2021-08-14', 'wreiglaru@mapy.cz');
insert into employee (name, birthday, email) values ('Ivar Tebbet', '2021-05-09', 'itebbetv@imgur.com');
insert into employee (name, birthday, email) values ('Claus Basile', '2021-12-27', 'cbasilew@last.fm');
insert into employee (name, birthday, email) values ('Myrilla Robak', '2021-09-01', 'mrobakx@digg.com');
insert into employee (name, birthday, email) values ('Gav Passy', '2022-01-20', null);
insert into employee (name, birthday, email) values ('Dody Fisk', '2021-06-21', 'dfiskz@auda.org.au');
insert into employee (name, birthday, email) values ('Judi Harman', '2021-07-05', 'jharman10@zimbio.com');
insert into employee (name, birthday, email) values ('Raina Vedstra', '2021-06-20', 'rvedstra11@amazon.co.uk');
insert into employee (name, birthday, email) values ('Auroora Ryle', '2021-05-06', 'aryle12@webnode.com');
insert into employee (name, birthday, email) values ('Manny Antley', '2022-04-21', 'mantley13@tumblr.com');
insert into employee (name, birthday, email) values ('Candy Rowsell', '2021-10-30', 'crowsell14@plala.or.jp');
insert into employee (name, birthday, email) values ('Stevy Tomkin', null, 'stomkin15@archive.org');
insert into employee (name, birthday, email) values ('Valentina Liepins', '2021-05-24', 'vliepins16@mlb.com');
insert into employee (name, birthday, email) values ('Casper Kinningley', '2022-01-07', 'ckinningley17@artisteer.com');
insert into employee (name, birthday, email) values ('Stacia Wapple', '2021-09-02', 'swapple18@sciencedaily.com');
insert into employee (name, birthday, email) values ('Janaye Leyban', '2021-06-28', 'jleyban19@amazonaws.com');
insert into employee (name, birthday, email) values ('Neda Buse', '2021-07-12', 'nbuse1a@eepurl.com');
insert into employee (name, birthday, email) values ('Basil Fayne', '2022-03-19', 'bfayne1b@addthis.com');
insert into employee (name, birthday, email) values ('Marchelle Haddock', '2021-10-27', 'mhaddock1c@paginegialle.it');
insert into employee (name, birthday, email) values ('Benjamen Hedderly', '2021-05-04', 'bhedderly1d@hexun.com');

--3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'Canan Acar',
    email = 'canan@gmail.com'
WHERE id = 2;

UPDATE employee
SET name = 'Asli Acar',
    email = 'asli@gmail.com'
WHERE id = 3;

UPDATE employee
SET name = 'Kenan Acar',
    email = 'kenan@gmail.com'
WHERE id = 4;

UPDATE employee
SET name = 'Cansu Acar',
    email = 'cansu@gmail.com'
WHERE id = 10;

UPDATE employee
SET name = 'Mehmet Acar',
    email = 'mehmet@gmail.com'
WHERE id = 12;
	
--4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE name = 'Benjamen Hedderly';

DELETE FROM employee
WHERE name = 'Marchelle Haddock';

DELETE FROM employee
WHERE name = 'Basil Fayne';

DELETE FROM employee
WHERE name = 'Neda Buse';

DELETE FROM employee
WHERE name = 'Stacia Wapple';
