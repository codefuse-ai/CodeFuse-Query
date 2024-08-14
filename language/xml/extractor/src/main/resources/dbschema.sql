CREATE TABLE location (
  id          INTEGER NOT NULL PRIMARY KEY ,
  start_line_number   integer(10),
  start_column_number    integer(10),
  end_line_number     integer(10),
  end_column_number      integer(10),
  containerid integer(10) NOT NULL);
CREATE TABLE xml_attribute (
  id         INTEGER NOT NULL PRIMARY KEY ,
  element_id  integer(10) NOT NULL,
  name       varchar(55),
  value      varchar(55),
  index_order        integer(10),
  location_id integer(10) NOT NULL);
CREATE TABLE xml_character (
  id         INTEGER NOT NULL PRIMARY KEY ,
  text       varchar(255),
  parentid   integer(10) NOT NULL,
  index_order        integer(10),
  is_cdata    integer(10),
  location_id integer(10) NOT NULL);
CREATE TABLE xml_comment (
  id         INTEGER NOT NULL PRIMARY KEY ,
  text       varchar(255),
  parent_id   integer(10) NOT NULL,
  location_id integer(10) NOT NULL);
CREATE TABLE xml_dtd (
  id         INTEGER NOT NULL PRIMARY KEY ,
  root       varchar(55),
  public_id   varchar(55),
  system_id   varchar(55),
  location_id integer(10) NOT NULL);
CREATE TABLE xml_element (
  id         INTEGER NOT NULL PRIMARY KEY ,
  name       blob,
  parent_id   integer(10) NOT NULL,
  index_order        integer(10),
  location_id integer(10) NOT NULL);
CREATE TABLE xml_encoding (
  id       integer(10) NOT NULL PRIMARY KEY,
  encoding varchar(50)
  );
CREATE TABLE xml_has_namespace (
  id          INTEGER NOT NULL PRIMARY KEY,
  element_id   integer(10) NOT NULL,
  namespace_id        integer(10) NOT NULL,
  container_id integer(10) NOT NULL
   );
CREATE TABLE xml_namespace (
  id         INTEGER NOT NULL PRIMARY KEY ,
  prefix_name varchar(55),
  url        varchar(55),
  location_id integer(10) NOT NULL);

CREATE TABLE Container (
  id        INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  fileid    integer(10),
  folderid  integer(10),
  programid integer(10) NOT NULL);
CREATE TABLE "File" (
  id             INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  abspath        varchar(255),
  relpath        varchar(255),
  extension      varchar(40),
  fileidentifier varchar(50),
  Folderid       integer(10) NOT NULL,
  Containerid    integer(10) NOT NULL);
CREATE TABLE Folder (
  id               INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  abspath          varchar(255),
  folderidentifier varchar(50));
CREATE TABLE Folder_Container (
  Folderid    integer(10) NOT NULL,
  Containerid integer(10) NOT NULL,
  PRIMARY KEY (Folderid,
  Containerid),
  FOREIGN KEY(Containerid) REFERENCES Container(id),
  FOREIGN KEY(Folderid) REFERENCES Folder(id));