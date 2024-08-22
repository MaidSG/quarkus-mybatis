DROP TABLE IF EXISTS m_user;

CREATE TABLE m_user (
                       id integer not null primary key,
                       name varchar(80) not null
);

INSERT INTO m_user (id, name) values(1, 'Test User1');
INSERT INTO m_user (id, name) values(2, 'Test User2');
INSERT INTO m_user (id, name) values(3, 'Test User3');
